package irem.Person;

public class PersonMitVektorResultat {

    double minGroesse, maxGroesse, durchschnittGroesse;
    double minGewicht, maxGewicht, durchschnittGewicht;
    int minAlter, maxAlter, durchschnittAlter;

    public void StatistikResultat(double minGroesse, double maxGroesse, double durchschnittGroesse,
                                  double minGewicht, double maxGewicht, double durchschnittGewicht,
                                  int minAlter, int maxAlter, int durchschnittAlter) {
        this.minGroesse = minGroesse;
        this.maxGroesse = maxGroesse;
        this.durchschnittGroesse = durchschnittGroesse;
        this.minGewicht = minGewicht;
        this.maxGewicht = maxGewicht;
        this.durchschnittGewicht = durchschnittGewicht;
        this.minAlter = minAlter;
        this.maxAlter = maxAlter;
        this.durchschnittAlter = durchschnittAlter;
    }
}
