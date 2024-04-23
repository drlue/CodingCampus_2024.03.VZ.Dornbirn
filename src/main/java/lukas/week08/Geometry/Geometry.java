package lukas.week08.Geometry;

public abstract class Geometry implements IGeometry {

    //methods
    @Override
    public String toString() {
        return String.format("%s (%s)", getClass().getSimpleName(), getDimensionString());
    }
}
