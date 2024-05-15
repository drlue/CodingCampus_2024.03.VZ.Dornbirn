package lukas.week10.SqlAndOopV1;

public class Testle {
    public static void main(String[] args) {
        String str = "Hallo ? wie ? es ?";
        System.out.println(countQuestionMarks(str));
    }

    public static int countQuestionMarks(String str){
        int count = 0;
        for(char c : str.toCharArray()){
            if (c == '?'){
                count++;
            }
        }
        return  count;
    }
}
