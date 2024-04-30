package lukas.week09.SchoolSim.Persons;

import ardijanla.ConsoleColors;
import lukas.week09.SchoolSim.Rooms.Room;
import lukas.week09.SchoolSim.School;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.Vector;

public class Teacher extends Person {

    private int id;
    private Vector<String> subjects;

    public Teacher(int id, String firstName, String lastName, String title, String... subjectList) {
        super(firstName, lastName, title);
        this.id = id;
        this.subjects = new Vector<>();
        subjects.addAll(Arrays.asList(subjectList));
    }

    public int getId() {
        return id;
    }

    private String getSubjectsString() {
        StringBuilder subjectsString = new StringBuilder();
        if (!subjects.isEmpty()) {
            for (int i = 0; i < subjects.size(); i++) {
                String s = subjects.get(i);
                if (i > 0) {
                    subjectsString.append(", ");
                }
                subjectsString.append(s);
            }
        } else {
            subjectsString.append(" - ");
        }
        return subjectsString.toString();
    }

    public String getColoredName() {
        return ConsoleColors.YELLOW + super.getName() + ConsoleColors.RESET;
    }

    public void activity(LocalTime myTime, Room teachersRoom) {
        //TODO Refactor this method, assumes that every :00 h a lesson starts and every :45 h a lesson ends
        switch (status) {
            case ATHOME -> {
                if (myTime.isAfter(LocalTime.parse("07:25")) && myTime.getHour()<12 && enterSchool(myTime)) {
                    goToRoom(teachersRoom);
                    status = Status.INCLASS;
                }
            }
            case INCLASS -> {
                if (myTime.getHour()>8 && myTime.getMinute() > 45) {
                    status = Status.HASBREAK;
                }
            }
            case HASBREAK -> {
                //goToRoom();
                if (myTime.getMinute()<= 45) {
                    status= Status.INCLASS;
                }
                if (myTime.getHour()> 16) {
                    status = Status.ATHOME;
                }
            }
        }
    }

    @Override
    protected boolean enterSchool(LocalTime myTime) {
        boolean result = false;
        if (School.random.nextInt(6) < 3) { //probability of 16,6% that person enters school between 07:30 and 08:00
            System.out.printf("%s Uhr: %s betritt die Schule %n", myTime, getColoredName());
            isInSchool = true;
            result = true;
        }
        return result;
    }

    @Override
    public String toString() {
        return super.toString() + " (" + getSubjectsString() + ")";
    }
}
