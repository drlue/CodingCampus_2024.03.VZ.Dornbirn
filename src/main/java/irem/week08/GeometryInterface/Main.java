package irem.week08.GeometryInterface;

//import gyula.week08.geomatry.Circle;
//import gyula.week08.geomatry.Rectangle;
//import gyula.week08.geomatry.Square;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<GeometryInterface> list = new ArrayList<>();

        GeometryInterface circle = (GeometryInterface) new Circle(5.0);
        System.out.println("Circle:");
        System.out.println("Circumference:" + circle.getCircumference()); //umfang
        System.out.println("Area " + circle.getArea());//fläche
        System.out.println();

        GeometryInterface square = (GeometryInterface) new Square(4.0);
        System.out.println("Square:");
        System.out.println("Circumference:" + square.getCircumference());
        System.out.println("Area " + square.getArea());
        System.out.println();

        GeometryInterface rectangle = (GeometryInterface) new Rectangle(3.0, 2.0);
        System.out.println("Rectangle");
        System.out.println("Circumference:" + rectangle.getCircumference());
        System.out.println("Area " + rectangle.getArea());
        System.out.println();

        GeometryInterface houseOfNicolaus = (GeometryInterface) new HouseOfNicolaus(3);
        System.out.println("House of Nicolaus:");
        System.out.println("Circumference:" + houseOfNicolaus.getCircumference());
        System.out.println("Area" + houseOfNicolaus.getArea());
        System.out.println();

        GeometryInterface star = (GeometryInterface) new Star(5,2,1);
        System.out.println("Star:");
        System.out.println("Circumference:" + star.getCircumference());
        System.out.println("Area" + star.getArea());
        System.out.println();


        list.add(houseOfNicolaus);
        list.add(star);
        list.add(rectangle);
        list.add(square);
        list.add(circle);

        printTotalCircumferenceAndArea(list);
        //Umfang
    }

    private static void printTotalCircumferenceAndArea(List<GeometryInterface> geometries) {
        double totalCircumference = 0.0;
        double totalArea = 0.0;

        for (GeometryInterface g : geometries) {
            totalCircumference += g.getCircumference();
            totalArea += g.getArea();
        }

        System.out.println("Total Circumference: " + totalCircumference);
        System.out.println("Total Area: " + totalArea);
    }
}

