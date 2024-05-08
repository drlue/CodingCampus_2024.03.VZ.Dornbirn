package lukas.week09.SchoolSim.Persons;

import ardijanla.ConsoleColors;
import lukas.week09.SchoolSim.School;
import lukas.week09.SchoolSim.SchoolClass;

import java.time.LocalTime;

public class Student extends Person {

    private int toLateCounter;


    public Student(String firstName, String lastName) {
        super(firstName, lastName);
        toLateCounter = 0;
    }


        public void activity(LocalTime myTime) {
        switch (status) {
            case ATHOME -> {
                if (myTime.isAfter(LocalTime.parse("07:25")) && myTime.getHour() < 12 && enterSchool(myTime)) {
                    status = Status.INCLASS;
                }
            }
            case INCLASS -> {
                if (myTime.getHour() > 8 && myTime.getMinute() > 45) {
                    status = Status.HASBREAK;
                }
            }
            case HASBREAK -> {
                //goToToilette(myTime);
                eatSnack(myTime);
                if (myTime.getMinute() <= 45) {
                    status = Status.INCLASS;
                }
                if (myTime.getHour() > 16) {
                    status = Status.ATHOME;
                }
            }
        }
    }

    public void writeLetterToParents(Headmaster headMaster, int countLate){
        if (toLateCounter >= countLate){
            System.out.printf("Headmaster %s invites the parents of %s and ask them to visit the headmaster office.%n", headMaster.getColoredName(), getColoredName());
            toLateCounter = 0;
        }
    }

    @Override
    protected boolean enterSchool(LocalTime myTime) {
        boolean result = false;
        if (School.random.nextInt(6) < 2) { //probability of 16,6% that person enters school between 07:30 and 08:00
            isInSchool = true;
            if (myTime.isBefore(LocalTime.parse("08:05"))) {
                System.out.printf("%s Uhr: %s betritt die Schule %n", myTime, getColoredName());
            } else {
                System.out.printf("%s Uhr: %s kommt zu spät und muss zum Direktor %n", myTime, getColoredName());
                toLateCounter++;
            }
            result = true;
        }
        return result;
    }

    private void goToToilette(LocalTime myTime) {
        double probability = School.random.nextDouble(1.0d);
        probability = status == Status.INCLASS ? probability * 2 : probability;
        if (probability < 0.1) {
            toiletteCounter++;
            System.out.printf("%s Uhr: %s muss auf die Toilette (zum %d. mal)%n", myTime, getColoredName(), toiletteCounter);

        }
    }

    private void eatSnack(LocalTime myTime) {
        if (School.random.nextDouble(1) < 0.2 && isHungry) {
            System.out.printf("%s Uhr: %s ist die Jause%n", myTime, getColoredName());
            isHungry = false;
        }
    }

    public String getColoredName() {
        return ConsoleColors.BLUE_BRIGHT + super.getName() + ConsoleColors.RESET;
    }
}

