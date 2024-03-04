package irem.week01.day01;

public class LogischeOperatoren2 {
    public static void main(String[] args) {
        boolean trueorfalse =theNumberFiveIsSmallerThenHundert(67);
        System.out.println(trueorfalse);
    }
    public static boolean theNumberFiveIsSmallerThenHundert(int value) {
        if(value < 5 || value > 100){
            return true;
        }else
            return false;

    }

}
