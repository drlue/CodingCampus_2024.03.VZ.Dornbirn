package katherina.week08.Geometrie;

public class NavigationStar extends Geometry {
    private double a;

    public NavigationStar(double a) {
        this.a = a;
    }

    public double getCircumference() {
        double circumference = 8 * a;
        //Kann im Vergleich zum Nikolaushaus vereinfacht werden. Quadrat liegt komplett innen, ist hier also
        //irrelevant (armes Quadrätle!). Es gibt acht äußere Kanten, die alle gleich lang sind.
        return circumference;
    }

    public double getArea() {
        //Aber bei der Fläche ist das Quadrat wieder mit dabei..
        double square = a * a;
        double triangle = (((double) 3 / 4) * (a * a)) * 4;
        //Ich benötige die Fläche von vier Dreiecken.
        double area = square + triangle;
        return area;
    }
}

