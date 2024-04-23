package franco.week08.GeometryExample;

public abstract class Geometry implements IGeometry {
    @Override
    public String toString() {
        return String.format("%s has an area %.2f", getClass().getSimpleName(), getArea());
    }

}
