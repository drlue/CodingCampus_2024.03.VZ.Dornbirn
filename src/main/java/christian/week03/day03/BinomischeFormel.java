package christian.week03.day03;

public class BinomischeFormel {
    public static StringBuilder formulaB = new StringBuilder();

    public static void main(String[] args) {
        String result = binomicalFormula(5);
        System.out.println(result);
    }

    public static long[][] pascalTriangleHalf(int size) {
        long[][] arr = new long[size][size];
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (col + row == size - 1 || col + row < size - 1) {
                    if (col == 0 || row == 0) {
                        arr[row][col] = 1;
                        System.out.print(arr[row][col]);
                    } else {
                        arr[row][col] = arr[row - 1][col] + arr[row][col - 1];
                        System.out.print(arr[row][col]);
                    }
                }
            }
            System.out.println();

        }
        return arr;
    }

    public static String binomicalFormula(int n) {
        long[][] arr = pascalTriangleHalf(n + 1);
        String formula = "";
        int k = 0;
        for (int i = n; i >= 0; i--) {
            if (arr[i][k] == 1) {

                if (k == 0) {
                    formulaB.append("a^" + i);
                } else if (i == 1) {
                    if (i < n && k < n) {
                        formulaB.append("+" + arr[i][k] + "a" + "b^" + k);
                    }
                } else if (i == 0) {
                    formulaB.append("+" + "b^" + k);
                }

            } else if (k == 1 && i != 1) {
                if (i < n && k < n) {
                    formulaB.append("+" + arr[i][k] + "a^" + i + "b");
                }

            } else if (i == 1) {
                if (i == 1 && k == 1) {
                    formulaB.append("+" + arr[i][k] + "a" + "b");
                } else if (i < n && k < n) {
                    formulaB.append("+" + arr[i][k] + "a" + "b^" + k);
                }

            } else {
                formulaB.append("+" + arr[i][k] + "a^" + i + "b^" + k);
            }
            k++;
        }
        formula = formulaB.toString();
        return formula;
    }
}
