package irem.Datenklasse;

public class StatisticTest {
    public static <Statistics> void main(String[] args) {
        // Test mit einem festen Array
        int[] fixedNumbers = {1, -2, 3, 4, 5};
        Statistic statsFixed = new Statistic(fixedNumbers);
        System.out.println("Fixed Array - Min: " + statsFixed.calcMin());
        System.out.println("Fixed Array - Max: " + statsFixed.calcMax());
        System.out.println("Fixed Array - Avg: " + statsFixed.calcAvg());

        // Erzeugung eines zufälligen Arrays
        int[] randomNumbers = new int[10];
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = (int) (Math.random() * 200) - 100; // Werte zwischen -100 und 100
        }
        Statistic statsRandom = new Statistic(randomNumbers);
        System.out.println("Random Array - Min: " + statsRandom.calcMin());
        System.out.println("Random Array - Max: " + statsRandom.calcMax());
        System.out.println("Random Array - Avg: " + statsRandom.calcAvg());
    }
}
