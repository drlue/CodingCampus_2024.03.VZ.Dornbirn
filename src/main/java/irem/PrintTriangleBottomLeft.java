package irem;

import java.security.cert.X509Certificate;

public class PrintTriangleBottomLeft {

    public static void main(String[] args) {
        System.out.println("printTriangleBottomLeft");
        printTriangleBottomLeft("x", 4);

    }
    public static void printTriangleBottomLeft(String Text, int nummer) {

        for (int row = 0; row < nummer; row++) {
            for (int col = 0; col < row + 1; col++) {
                System.out.print("X ");
            }
            System.out.println();
        }
    }
}
