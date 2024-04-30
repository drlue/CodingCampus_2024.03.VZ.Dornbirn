package lukas.week09.SchoolSim.Persons;

import ardijanla.ConsoleColors;

import java.time.LocalTime;

public class Headmaster extends Teacher {

    public Headmaster(int id, String firstName, String lastName, String title, String... subjectList) {
        super(id, firstName, lastName, title, subjectList);
    }

    @Override
    public String getColoredName() {
        return ConsoleColors.YELLOW_BRIGHT + super.getName() + ConsoleColors.RESET;
    }

}
