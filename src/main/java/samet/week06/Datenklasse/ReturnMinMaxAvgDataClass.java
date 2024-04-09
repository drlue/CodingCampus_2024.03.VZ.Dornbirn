package samet.week06.Datenklasse;

public class ReturnMinMaxAvgDataClass {

    public static void main(String[] args) {

        SametArray sa = new SametArray(new int[]{5, 3, -2, 8, 9, 3, 3, 2, 1, 1, 0, -1, 4, 6, 7});

        System.out.println("min: " + sa.calcMin());
        System.out.println("max: " + sa.calcMax());
        System.out.println("avg: " + sa.calcAvarage());

    }
}
