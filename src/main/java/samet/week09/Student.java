package samet.week09;

import java.util.Random;


public class Student {
    Random random = new Random();
    private String name;


    public Student(String name){
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public boolean toLate(){
        return random.nextDouble() < 0.05;

    }

}
