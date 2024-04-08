package irem.Datenklasse;
//Erstelle die Datenklasse mit einem Sinnvollen Klassennamen und entsprechenden Attributen.
// Achte hierbei auch auf die Korrekte Sichtbarkeit

    public class Resultat {
        private int min;
        private int max;
        private double durchschnitt;

        public Resultat(int min, int max, double durchschnitt) {
            this.min = min;
            this.max = max;
            this.durchschnitt = durchschnitt;
        }

        public int getMin() {
            return min;
        }

        public int getMax() {
            return max;
        }

        public double getDurchschnitt() {
            return durchschnitt;
        }

        @Override
        public String toString() {
            return String.format("Min: %d, Max: %d, Durchschnitt: %.2f", min, max, durchschnitt);
        }
    }
