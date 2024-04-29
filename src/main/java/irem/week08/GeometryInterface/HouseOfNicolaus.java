package irem.week08.GeometryInterface;

public class HouseOfNicolaus implements GeometryInterface {
    private double sideLength;

    public HouseOfNicolaus(int i) {

    }

    public void HouseOfNikolaus(double sideLength) {
        this.sideLength = sideLength;
    }

    public double getCircumference() {
        // Umfang des Hauses als geschlossene Figur
        return 8 * sideLength;
    }

    public double getArea() {
        //Fläche basierend auf der Grundfläche und dem Dach
        return sideLength * sideLength + (0.5 * sideLength * sideLength);
    }
}
