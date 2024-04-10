package ardijanla.week06.Datenklasse;

public class mein {
    public static void main(String[] args) {
        int[] inta = new int[]{2, 5, 12, 234, 324, 1, 1, -5};

        IntConverterClass cv = new IntConverterClass(inta);
        System.out.println(""+ cv.getMax());
        System.out.println(cv.getMin());
        System.out.println(cv.getAvg());
    }
}
