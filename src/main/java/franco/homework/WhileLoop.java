package franco.homework;

import java.util.Scanner;

public class WhileLoop {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        //counter controlled loop
        int count = 0; //count is initialized

        //count will be incrementing by one each time till it 10
        //each time a number will be printed till 0,1,2,3....till 10
        while (count <= 10) {
            System.out.println(count + " ");
            count++;
        }

        //sentinel control loop
        int count1=0;
        int value;
        int sum = 0;
        System.out.println("Write down the first number(enter o to quit)");
        value = scan.nextInt();
        while(value!=0){
            //actualizing and adding the sum
            sum=sum+value;
            //get the second value to be added

            System.out.println("write the next number:");
            value=scan.nextInt();
            count1++;
        }

        System.out.println("The total sum of your numbers is "+sum+"you've added "+count1 +" numbers");

    }


}
