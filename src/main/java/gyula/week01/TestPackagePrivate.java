package gyula.week01;

import ardijanla.ConsoleColors;
import gyula.week07.Developer;

public class TestPackagePrivate {
    public static void main(String[] args) {
        Developer d = new Developer("ABC", ConsoleColors.GREEN);
        // d.color = ConsoleColors.YELLOW;
    }
}
