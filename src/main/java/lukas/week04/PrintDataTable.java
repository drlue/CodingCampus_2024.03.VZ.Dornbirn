package lukas.week04;

public class PrintDataTable {
    public static void main(String[] args) {

        //data
        String[] firstName = {"Alfonso", "Beatrix-Eleonor", "Cecil", "Daniel", "Elmar"};
        String[] lastName = {"Klein", "Kinderdorfer", "Al Elmenar", "Schmidt", "Simma"};
        int[] age = {40, 78, 5, 18, 30};
        String[] place = {"Wien", "Schwarzach", "Wiener Neudorf", "Sankt Pölten", "Sankt Pölten"};
        float[] distanceFromCapital = {0f, 654.4f, 12.457634366f, 120.0f, 119.9999f};



        //print version 1
        printDataTable(firstName, lastName, age, place, distanceFromCapital);
        System.out.println();
        //print version 2
        String[] headerArr = {"First Name", "Last Name", "Age", "Place", "Distance from Capital"};
        String[] dataTypes = {"s", "s", "i", "s", "f"};
        printDataTableV2(headerArr, dataTypes, firstName, lastName, convertToStringArray(age), place, convertToStringArray(distanceFromCapital));

        System.out.println(getMax(1,2,3,4,5,6));

    }

    public static void printDataTable(String[] firstName, String[] lastName, int[] age, String[] place, float[] distanceFromCapital) {
        System.out.printf("%-20s | %-20s | %6s | %-20s | %22s\n", "First Name", "Last Name", "Age", "Place", "Distance from Capital");
        System.out.println("-".repeat(100));

        for (int i = 0; i < 5; i++) {
            System.out.printf("%-20s | %-20s | %6d | %-20s | %22.2f\n", firstName[i], lastName[i], age[i], place[i], distanceFromCapital[i]);
        }
    }

    //String[] firstName, String[] lastName, int[] age, String[] place, float[] distanceFromCapital

    public static void printDataTableV2(String[] headerArr, String[] dataTypes, String[]... dataArrs) {

        int tableWidth = 0;
        int padding = 0;
        int[] colWidths = getMaxColWidths(headerArr, dataArrs);
        String[] formatString = new String[headerArr.length];
        for (int col = 0; col < formatString.length; col++) {
            formatString[col] = String.format("| %%%s%ds ", dataTypes[col].matches("[fi]")?"":"-", colWidths[col]+padding);
        }

        //Header
        for (int i = 0; i < headerArr.length; i++) {
            System.out.printf(formatString[i], headerArr[i]);
            tableWidth += colWidths[i] + padding + 3;
        }
        System.out.println("|");
        System.out.println("-".repeat(tableWidth + 1));

        //Datenzeilen
        for (int row = 0; row < dataArrs.length; row++) {
            for (int col = 0; col < dataArrs[row].length; col++) {
                System.out.printf(formatString[col], dataArrs[col][row]);
            }
            System.out.println("|");
        }
    }


    public static int getMax(int... n) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n.length; i++) {
            if (n[i] > max) {
                max = n[i];
            }
        }
        return max;
    }

    public static int[] getMaxColWidths(String[] headerArr, String[]... dataArrs) {
        int[] result = new int[dataArrs.length];
        for (int i = 0; i < dataArrs.length; i++) {
            result[i] = headerArr[i].length();
            for (int j = 0; j < dataArrs[i].length; j++) {
                if (dataArrs[i][j].length() > result[i]) {
                    result[i] = dataArrs[i][j].length();
                }
            }
        }
        return result;
    }


    public static int getMaxColNr(String[]... strArrs) {
        int maxColNr = 0;
        for (int i = 0; i < strArrs.length; i++) {
            if (strArrs[i].length > maxColNr) {
                maxColNr = strArrs[i].length;
            }
        }
        return maxColNr;
    }

    public static String[] convertToStringArray(int[] arr) {
        String[] result = new String[arr.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = String.format("%d", arr[i]);
        }
        return result;
    }

    public static String[] convertToStringArray(float[] arr) {
        String[] result = new String[arr.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = String.format("%.2f", arr[i]);
        }
        return result;
    }

}

