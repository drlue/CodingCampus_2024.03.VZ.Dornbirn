package ardijanla.week08.Geometry;

public abstract class Geometry implements IGeometry {
    @Override
    public String toString() {
        return String.format("The Circum from the %s is: %.2f and the area is: %.2f"
                , this.getClass().getSimpleName()
                , getCircumference()
                , getArea());
    }
}
