package irem.week08.GeometryAbstract;

public abstract class Geometry extends IGeometry {
  @Override
  public String toString() {
   return String.format("%s has an area %.2f", getClass().getSimpleName(), getArea());
  }
 }

