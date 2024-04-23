package katherina.week08.Geometrie;

public class SantaHaus extends Geometry {
    private double a;

    public SantaHaus(double a) {
        this.a = a;
    }

    public double getCircumference() {
        double circumference = 5 * a;
        //Alle Außenkanten sind gleich lang. Von den vier Kanten des Quadrats und den drei des Dreiecks liegt je eine innen.
        //Daher ist die Gesamtzahl aller Kanten identischer Länge 5!
        return circumference;
    }

    public double getArea() {
        //Für die Berechnung der Fläche sind innenliegende Kanten wurscht.
        double square = a * a;
        double triangle = ((double) 3 / 4) * (a * a);
        //Ließe sich theoretisch ebenfalls zu einer Zeile vereinfachen: ((double) 3 / 4) * (a * a) + (a*a).
        //In diesem Fall finde ich jedoch die aufgedröselte Schreibweise übersichtlicher.
        double area = square + triangle;
        return area;
    }
}
