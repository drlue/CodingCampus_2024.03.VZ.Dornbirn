package irem.week05;

import java.security.spec.RSAOtherPrimeInfo;

public class Reverse2 {

    public static void main(String[] args) {
        System.out.println( reverse ("hello"));

    }

    public static String reverse(String text) {
        char[] zoro = text.toCharArray();
        char[] luffy = new char[zoro.length];
        for (int i = 0; i < luffy.length ; i++) {
           luffy[i] = zoro[zoro.length -1 - i]; //luff[i] = zoro[i]--> wär die kopie
            }
        return new String(luffy);
    }
}
