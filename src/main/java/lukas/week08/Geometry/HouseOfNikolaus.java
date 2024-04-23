package lukas.week08.Geometry;

import samet.week02.day01.Wuerfelspiel;

public class HouseOfNikolaus extends Geometry{

    private Rectangle rec;
    private Triangle roof;
    private double recWidth;
    private double recHeight;
    private double roofHeight;

    public HouseOfNikolaus(double width, double recHeight, double roofHeight) {
        this.recWidth = width;
        this.recHeight = recHeight;
        this.roofHeight = roofHeight;
        rec = new Rectangle(recWidth, recHeight);
        roof = new Triangle(width, calcRoofSideLenght(), calcRoofSideLenght());
    }

    private double calcRoofSideLenght(){
        return Math.sqrt(recWidth*0.5*recWidth*0.5 + roofHeight*roofHeight);
    }

    @Override
    public double getCircumference() {
        return rec.getCircumference() + roof.getCircumference() - 2* recWidth;
    }

    @Override
    public double getArea() {
        return rec.getArea()+roof.getArea();
    }

    @Override
    public String getDimensionString() {
        return String.format("b x h1 x h2 = %.1f x %.1f x %.1f",recWidth, recHeight, roofHeight);
    }

    @Override
    public void doubleSize() {
        recWidth *= 2;
        recHeight *= 2;
        roofHeight *= 2;
    }
}
