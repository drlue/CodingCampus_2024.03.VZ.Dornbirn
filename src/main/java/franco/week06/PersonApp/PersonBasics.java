package franco.week06.PersonApp;


import java.util.List;

public class PersonBasics {
    private String name;
    private int age;
    private int height;
    private double weight;


    public PersonBasics(String name, int age, int height, double weight) {

        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty()) {
            this.name = name.toUpperCase();
        } else {
            System.err.println("Please enter a valid name...");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0 && age < 110) {
            this.age = age;
        } else {
            System.err.println("Enter a postive number");
        }
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height >= 0 && height < 280) {
            this.height = height;
        } else {
            System.err.println("Height musst be between 0 and 280cm....");
        }
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight > 3 && weight < 200) {
            this.weight = weight;

        } else {
            System.err.println("Enter a valid number...");
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name= " + this.name +
                ", age=" + this.age +
                ", height=" + this.height + "cm" +
                ", weight=" + this.weight + "kg" +
                '}';
    }
//    public int calMinHeight() {
//        int minHeight = Integer.MAX_VALUE;
//        for (PersonBasics p : personBasics) {
//            if (p.getHeight() < minHeight) {
//                minHeight = p.getHeight();
//            }
//        }
//        return minHeight;
//    }


}

