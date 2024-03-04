package irem.week01.day01;

public class LogischeOperatoren0 {
    public static void main(String[] args) {
        System.out.println(isBiggerThanTenAndEvenOrBiggerThanZero(54));
        System.out.println(isBiggerThanTenAndEvenOrBiggerThanZero2(53));

    }

    public static boolean isBiggerThanTenAndEvenOrBiggerThanZero(int value) {
        return value > 10 && (value % 2 == 0);
    }

    public static boolean isBiggerThanTenAndEvenOrBiggerThanZero2(int value) {
        if (value == 0) {
            return true;
        } else if (value > 10) {
            if (value % 2 == 0) {
                return true;
            } return false;
        } else {
            return false;
        }
    }


}

