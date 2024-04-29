package franco.week08.GeometryExample;

public class SantaClausHouse extends Geometry {
    private double baseLength;
    private double height;

    public  SantaClausHouse(double baseLength,double height){
        this.baseLength = baseLength;
        this.height = height;
    }

    @Override
    public double getCircumference() {

        double roofSide = Math.sqrt(baseLength * baseLength + height * height);
        return 4 * baseLength + roofSide;
    }

    @Override
    public double getArea() {

        return (baseLength * baseLength) + (0.5 * baseLength * height);
    }

}
