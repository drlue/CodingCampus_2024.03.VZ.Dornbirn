package gyula.week02;

public class CodeWithSideEffect {
    public static void main(String[] args) {
        int i = 0;

        i = i + 3;
        System.out.println(i);
        ++i;
//        System.out.println(i);
//        System.out.println(i);
        ++i;

        gyula.week01.Triangle.triangle("A ", i);
        ++i;
        System.out.println(i);
    }
}
