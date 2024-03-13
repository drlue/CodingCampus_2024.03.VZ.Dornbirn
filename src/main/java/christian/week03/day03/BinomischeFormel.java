package christian.week03.day03;

public class BinomischeFormel {
    public static StringBuilder formulaB = new StringBuilder();

    public static void main(String[] args) {
        long [][] result = pascalTriangleHalf(5);
        System.out.println("/"+binomicalFormula(result, 4)+"/");
        String str = binomicalFormula(result, 4);
        String newstr = str.replace("1","");
        System.out.println();
        System.out.println(newstr);
    }

    public static long[][] pascalTriangleHalf(int size) {
        long[][] arr = new long[size][size];
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (col + row == size - 1 || col + row < size - 1) {
                    if (col == 0 || row == 0) {
                        arr[row][col] = 1;
                        System.out.printf("%12d", arr[row][col]);
                        System.out.print(" ");
                    } else {
                        arr[row][col] = arr[row - 1][col] + arr[row][col - 1];
                        System.out.printf("%12d", arr[row][col]);
                        System.out.print(" ");
                    }
                }
            }

            System.out.println();
        }
        return arr;
    }

    public static String binomicalFormula(long[][] arr, int n) {

        String formula = "";
        int k = 0;
        for (int i = n; i >= 0; i--) {
            if (k == 0) {
                formulaB.append(arr[i][k] + "a^" + i);
            }
            if (i < n&& i!=0) {
                formulaB.append("+"+ arr[i][k] + "a^" + k + "b^" + i);
            }
            if (i == 0) {
                formulaB.append("+"+arr[i][k] + "b^" + (i+1));
            }
            k++;
        }
        formula = formulaB.toString();
        return formula;
    }
}
