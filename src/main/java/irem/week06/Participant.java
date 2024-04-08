package irem.week06;

import gyula.week06.example1.Workshop;

public class Participant {
    private String name;
    private gyula.week06.example1.Workshop workshop;

    public Participant(String name){
        this.name = name;
        this.workshop = null;
    }

    public gyula.week06.example1.Workshop getWorkshop() {
        return workshop;
    }

    public void setWorkshop(Workshop workshop) {
        this.workshop = workshop;
    }

    @Override
    public String toString() {
        return "Participant " + name + " visits " + workshop.getName();
    }
}

