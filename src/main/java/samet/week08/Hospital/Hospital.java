package samet.week08.Hospital;

import ardijanla.ConsoleColors;
import katherina.week08.Schwarzwaldklinik.Abteilung;
import samet.week07.ZooSimulation.Enclosure;
import samet.week07.ZooSimulation.Keeper;

import java.util.ArrayList;
import java.util.List;

public class Hospital {

    private String name;
    private List<Department> departments;

    public Hospital(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

   @Override
   public String toString() {
       final StringBuffer sb = new StringBuffer("Welcome to the Sacred Heart Hospital");
       sb.append("\n");
       return sb.toString();
   }
}



