package franco.homework;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class MergeSortedArrayLeetCode {


    public static void main(String[] args) {
        //the exercise is that we have a merge array of both with the zeros
        //we will a similar technic to selection sort
        //leftPointer and rightPointer
        int[] num1 = {1, 2, 3, 0, 0, 0};
        int [] num2= {2,5,6};
        int m=3;
        int n=3;
        int p1 = m-1 , p2 = n-1 ,i = m+n-1;
        while(p2 >=0 ){
            if(p1 >=0 && num1[p1] > num2[p2]){
                num1[i--] = num1[p1--];
            }
            else{
                num1[i--] = num2[p2--];
            }
        }
        System.out.println("sorted array");
        System.out.printf(Arrays.toString(num1)+Arrays.toString(num2));


        //print 1 to 10
        int sum=0;
        for (i = 1; i <=10; i++) {
            System.out.println(i+" ");
            //´calculate the sum of 10 num
            sum +=i;
        }
        System.out.println("Total of numbers is :" +sum);

        //multiplication number
        int num;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter any positiv number;");
        num= scan.nextInt();
        for (int index = 0; index <=10 ; index++) {

            System.out.println(index+"x"+num+"="+(num*index));
        }
    }
}
