package christian.week02.day01;

public class SquareRoot {
    public static void main(String[] args) {
        System.out.println(squareRootApprox(245));
    }
public static double squareRootApprox(int x){
        double sqrRootApprox = x;
        double max = x;
        double min = 0;
        while(Math.abs(Math.pow(sqrRootApprox,2)-x) >0.0001){
            sqrRootApprox = (max+min)/2;
            if (sqrRootApprox*sqrRootApprox >x){
                max=sqrRootApprox;
            }
            else
                min=sqrRootApprox;
        }
        return sqrRootApprox;
}
}
