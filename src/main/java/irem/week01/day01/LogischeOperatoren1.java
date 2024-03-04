package irem.week01.day01;

public class LogischeOperatoren1 {
    public static void main(String[] args) {
        boolean trueorfalse = NummberIsStraightAndBiggerThenTen(55);
                System.out.println(trueorfalse);
    }

    public static boolean NummberIsStraightAndBiggerThenTen(int value) {
        if(value > 10 && value %2 == 0){
            return true;

        }else{
            return false;
        }

    }
}
