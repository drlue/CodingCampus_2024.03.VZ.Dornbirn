package katherina.week08.Geometrie;

public abstract class Geometry {
    //Superklasse, wenn ich es richtig verstanden habe


    public Geometry(){
    }

    public double getCircumference() {
        return 0.0;
    }

    public double getArea() {
        return 0.0;
    }

    private String getShape() {
        return null;
    }

    @Override
    public String toString() {
        return String.format("Der Umfang des %s beträgt %d, und die Fläche beträgt %d.",getShape(), getCircumference(),getArea());
    }


}

