package franco.week08.GeometryExample;

public class GeometryExampleMain {
    public static void main(String[] args) {
        Circle rond=new Circle(5);
        System.out.println("Area of circle: "+rond.getArea());

        Triangle triangle= new Triangle(6,7,8);
        System.out.println("Area of Triangle: "+triangle.getArea());

        Square carre= new Square(4);
        System.out.println("Area of square: "+carre.getArea());
        System.out.println("Perimeter of a square: "+carre.getCircumference());
    }
}
