package irem.Person;

import java.util.List;

//public class PersonenMitVektorStatistic {

//    public static <StatistikResultat> StatistikResultat berechneStatistiken(List<Person> personen) {
//        double minGroesse = Double.MAX_VALUE, maxGroesse = Double.MIN_VALUE, sumGroesse = 0;
//        double minGewicht = Double.MAX_VALUE, maxGewicht = Double.MIN_VALUE, sumGewicht = 0;
//        int minAlter = Integer.MAX_VALUE, maxAlter = Integer.MIN_VALUE, sumAlter = 0;
//
//        for (Person person : personen) {
//            double groesse = person.getGroesse();
//            double gewicht = person.getGewicht();
//            int alter = person.getAlter();
//
//            if (groesse < minGroesse) minGroesse = groesse;
//            if (groesse > maxGroesse) maxGroesse = groesse;
//            sumGroesse += groesse;
//
//            if (gewicht < minGewicht) minGewicht = gewicht;
//            if (gewicht > maxGewicht) maxGewicht = gewicht;
//            sumGewicht += gewicht;
//
//            if (alter < minAlter) minAlter = alter;
//            if (alter > maxAlter) maxAlter = alter;
//            sumAlter += alter;
//        }
//
//        int anzahlPersonen = personen.size();
//        return new  StatistikResultat(
//                minGroesse, maxGroesse, sumGroesse / anzahlPersonen,
//                minGewicht, maxGewicht, sumGewicht / anzahlPersonen,
//                minAlter, maxAlter, sumAlter / anzahlPersonen
//        );
//    }
//    class StatistikResultat {
//        double minGroesse, maxGroesse, durchschnittGroesse;
//        double minGewicht, maxGewicht, durchschnittGewicht;
//        int minAlter, maxAlter, durchschnittAlter;
//
//        public StatistikResultat(double minGroesse, double maxGroesse, double durchschnittGroesse,
//                                 double minGewicht, double maxGewicht, double durchschnittGewicht,
//                                 int minAlter, int maxAlter, int durchschnittAlter) {
//            this.minGroesse = minGroesse;
//            this.maxGroesse = maxGroesse;
//            this.durchschnittGroesse = durchschnittGroesse;
//            this.minGewicht = minGewicht;
//            this.maxGewicht = maxGewicht;
//            this.durchschnittGewicht = durchschnittGewicht;
//            this.minAlter = minAlter;
//            this.maxAlter = maxAlter;
//            this.durchschnittAlter = durchschnittAlter;
//        }
//    }
//}