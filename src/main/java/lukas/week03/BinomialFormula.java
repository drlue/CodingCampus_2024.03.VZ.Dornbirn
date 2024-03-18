
package lukas.week03;

import java.util.Arrays;

public class BinomialFormula {

    public static void main(String[] args) {

        int expN = lukas.Helper.readIntFromConsole("(a+b)^n ... gewünschten Exponent n eingeben >>>");

//        String a3 = "a^3 + 3a^2b + 3ab^2 + b^3";
//        String a4 = "a^4 + 4a^3b + 6a^2b^2 + 4ab^3 + b^4";
//        String a5 = "a^5 + 5a^4b + 10a^32b^2 + 10a^2b^3 + 5ab^4 b^5";

        System.out.println(Arrays.toString(getListOfBinomialCoefficients(expN)));
        System.out.print("(a+b)^" + expN + " = ");
        //printBinomialEquation(expN);
        System.out.println(binomialEquationV2(expN));


    }

    public static int[] getListOfBinomialCoefficients(int n) {
        int[] result = new int[n + 1];
        int[][] pascalArr = PascalTriangle.createPascalTriangle(n + 1);
        for (int i = 0; i < n + 1; i++) {
            result[i] = pascalArr[i][n - i];
        }
        return result;
    }

    public static void printBinomialEquation(int n) {
        int[][] pascalArr = PascalTriangle.createPascalTriangle(n + 1);
        for (int i = 0; i < n + 1; i++) {
            //+ sign
            if (i > 0) { //print + when not first entry
                System.out.print(" + ");
            }
            if (pascalArr[i][n - i] > 1) { // print  x* if x >1
                System.out.print(pascalArr[i][n - i] + "*");
            }
            if (i == 0) { // don't print b^0
                System.out.print("a^" + n);
            } else if (i == n) { // don't print a^0
                System.out.print("b^" + i);
            } else if (i == 1) { //print b instead of b^1
                System.out.print("*a^" + (n - i) + "*b");
            } else if (n - i == 1) { //print a instead of a^1
                System.out.print("*a" + "*b^" + i);

            } else //default case
                System.out.print("*a^" + (n - i) + "*b^" + i);
        }

    }

    public static String binomialEquationV2(int n) {
        StringBuilder sb = new StringBuilder();
        int[][] pascalArr = PascalTriangle.createPascalTriangle(n + 1);
        for (int i = 0; i < n + 1; i++) {
            int coeff = pascalArr[i][n - i];
            //+ sign
            sb.append((i > 0) ? " + " : ""); //print + when not first entry

            sb.append(coeff > 1 ? coeff : ""); // print  x if x >1

            sb.append(i < n ? "a" : "");
            sb.append(i < n - 1 ? "^" + (n - i) : "");

            sb.append(i > 0 && i < n ? "*" : "");

            sb.append(i > 0 ? "b" : "");
            sb.append(i > 1 ? "^" + i : "");
        }
        return sb.toString();
    }


}

