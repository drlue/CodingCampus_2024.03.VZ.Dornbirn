package christian.week04.day01;

public class Tabelle {
    public static void main(String[] args) {
        String [] Header = {"firstName", "lastName", "age","place", "distance"};
        String[] firstName = {"Alfonso", "Beatrix-Eleonor", "Cecil", "Daniel", "Elmar"};
        String[] lastName = {"Klein", "Kinderdorfer", "Al Elmenar", "Schmidt", "Simma"};
        int[] age = {40, 78, 5, 18, 81};
        String[] ageString = new String[age.length];
        ageString = intToStringArray(age);

        String[] place = {"Wien", "Schwarzach", "Wiener Neudorf", "Sankt Poelten", "Sankt Poelten"};
        float[] distanceFromCapital = {0f, 654.4f, 12.457634366f, 120.0f, 119.9999f};
        String[] stringDistanceFromCapital = new String[distanceFromCapital.length];

        stringDistanceFromCapital = floatToStringArray(distanceFromCapital);
        String [][] tabelle = {Header, firstName,lastName,ageString, place,stringDistanceFromCapital};

        for (int i = 0; i < tabelle.length; i++) {
            for (int j = 0; j < tabelle[i].length; j++) {
                System.out.printf("%20s",tabelle[i][j]);
            }
            System.out.print("\n"+"_".repeat(100)+"\n");

        }
    }
    public static String[] intToStringArray (int [] intArr){
        String [] arr = new String[intArr.length];
        for (int i = 0; i < arr.length; i++) {

                arr[i] = Integer.toString(intArr[i]);


        }
        return arr;
    }
    public static String[] floatToStringArray (float[]floatArr){
        String [] arr = new String[floatArr.length];
        for (int i = 0; i < arr.length; i++) {


                arr[i] = String.valueOf(floatArr[i]);


        }
        return arr;
    }
}
