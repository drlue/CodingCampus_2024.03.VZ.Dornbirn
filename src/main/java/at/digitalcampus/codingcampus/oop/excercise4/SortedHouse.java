package at.digitalcampus.codingcampus.oop.excercise4;

import at.digitalcampus.codingcampus.oop.excercise2.Person;
import at.digitalcampus.codingcampus.oop.excercise3.House;

public class SortedHouse extends House {

    ///Überschreibe addPerson(Person person) und sortiere,
    // nach dem Namen,
    //         entweder die List nach dem Einfügen der Person
    //         oder füge diese direkt an der richtigen Stelle ein.


    ////////////// KONSTRUKTOR ////////////////
    public SortedHouse(int doors, int windows, String address) {
        super(doors, windows, address);
    }

    ////////////// METHODE ////////////////
    @Override
    public void addPerson(Person person) {
        super.addPerson(person);
        bubblesort();
    }


    public void bubblesort() {
        //Anzahl sortierungen anhang Listenlänge definieren
        for (int j = 0; j < super.getResidents().size(); j++) {
            //Name wenn nötig bis ans Ende der Liste verschieben
            for (int i = 0; i < super.getResidents().size()-1; i++) {
                //Namen(Strings) vergleichen und tauschen wenn nötig
                if (super.getResidents().get(i).getName().compareTo(super.getResidents().get(i + 1).getName()) > 0) {
                    String temp = super.getResidents().get(i).getName();
                    super.getResidents().get(i).setName(super.getResidents().get(i + 1).getName());
                    super.getResidents().get(i + 1).setName(temp);
                }
            }
        }
    }
}
