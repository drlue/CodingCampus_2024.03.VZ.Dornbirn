package lukas.week04;

import ardijanla.ConsoleColors;
import data.Texts;
import lukas.Helper;

public class StringMarkHesse {
    public static void main(String[] args) {

        String input = Helper.readStringFromConsole("Hevorzuhebenden Text eingeben >>>");
        String txt = Texts.HESSE.replace(input, ConsoleColors.RED + input.toUpperCase() + ConsoleColors.RESET);
        System.out.println(txt);

    }

}

