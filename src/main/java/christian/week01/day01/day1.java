package christian.week01.day01;

public class day1 {
    public static void main(String[] args) {
        int number1 = 4;
        int number2 = 2;

        // ohne casten kommt ein int heraus
        float solution = number2 / number1;
        System.out.println("Ergebnis von 2/4=" + solution);

        //Int "casten" zu float
        float solution2 = number2 / (float) number1;
        System.out.println(solution2);
        int index = 0;

        //increment(erhöhen) index by 1
        index++;
        index += 1;
        index = index + 1;
        ++index;
        System.out.println("Index:" + index); // = 4
        System.out.println("index++:" + index++); // = 4
        System.out.println("indexx after ++:" + index); // = 5
        System.out.println("++Index: " + (++index)); // = 6

        index *= 2;
        index += 2;
        index /= 2;
        index -= 2;
        index = 0;
        //while zuerst Bedingung prüfen, dann block ausführen
        while (index != 10) {
            System.out.println(index);
            index++;
        }
        //for
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
        //dowhile zuerst Block ausführen, dann Bedingung prüfen
        index = 0;
        do {
            System.out.println(index);
            index--;
        } while (index < -10);
        System.out.println(index);
    }
}
