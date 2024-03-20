package ardijanla.week4.day03;

public class ShowDataTabular {
    public static void main(String[] args) {
        String[] firstName = {"Alfonso", "Beatrix-asdsadEleonor", "Cecsadsadil", "Daniel", "Elmar"};
        String[] lastName = {"Klein", "Kinderasdsaddorfer", "Al Elmenasasdsadr", "Schmisadsadsadsadsadsaddt", "Simma"};
        int[] age = {40, 78, 5, 18, 81};
        String[] place = {"ä", "Schwarsadsadzach", "Wiener Neudor", "Sankt Pöl", "Sankt Pölten"};
        float[] distanceFromCapital = {0f, 654.4f, 12.457634366f, 120.0f, 119.9999f};

        PrintTabular(firstName, lastName, age, place, distanceFromCapital);

    }


    public static void PrintTabular(String[] firstname, String[] lastname, int[] age, String[] place, float[] distanceFromCaptital) {
        //kopfzeile
        String formatString = "%-" + length(firstname) + "s |" + "%-" + length(lastname) + "s |" + "%-" + 3 + "s |" + "%-" + length(place) + "s |" + "%-" + 20 + "s |\n";

        System.out.printf(formatString, "Firstname", "Lastname", "age", "place", "distance");

        //Data body
        for (int i = 0; i < firstname.length; i++) {
            System.out.printf(formatString,firstname[i],lastname[i],age[i],place[i],distanceFromCaptital[i]);
        }

    }
//Umlaute sind immer zwei charactere
    public static int length(String[] str) {
        int maxNumber = str[0].length();
        for (int i = 0; i < str.length; i++) {
            if (str[i].length() > maxNumber) {
                maxNumber = str[i].length();
            }
        }
        return maxNumber;
    }


}
