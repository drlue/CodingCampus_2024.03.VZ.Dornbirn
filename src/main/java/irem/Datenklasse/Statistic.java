package irem.Datenklasse;

public class Statistic {
    private int[] numbers;

    // Konstruktor zur Initialisierung des Arrays
    public Statistic(int[] numbers) {
        this.numbers = numbers;
    }
    public int calcMin() {
        int min = Integer.MAX_VALUE;
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
    public int calcMax() {
        int max = Integer.MIN_VALUE;
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public double calcAvg() {
        if (numbers.length == 0) {
            return 0;
        }
        double sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum / numbers.length;
    }
}
