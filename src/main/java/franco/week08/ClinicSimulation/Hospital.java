package franco.week08.ClinicSimulation;

import java.util.ArrayList;
import java.util.List;

public class Hospital { private String name;
    private String openingTime;
    private int maxCapacity;
    private List<Department> departmentList;

    public Hospital(String name, String openingTime, int maxCapacity) {
        this.name = name;
        this.openingTime = openingTime;
        this.maxCapacity = maxCapacity;
        departmentList=new ArrayList<>();

    }

    ////////////////////////////////////////GETTER AND SETTER///////////////////////////////////////////////////////////
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOpeningTime() {
        return openingTime;
    }

    public void setOpeningTime(String openingTime) {
        this.openingTime = openingTime;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    ///////////////////////////////////////////////METHODE//////////////////////////////////////////////////////

    public void addDeparment(Department department) {
        if (!departmentList.contains(department)) {
            departmentList.add(department);
        }

    }

    /////////////////////////////////////////////PRINT STRUCTURE/////////////////////////////////////////////////
    public void printStructure() {
        System.out.printf("=".repeat(40) + "\n" + "Welcome to %s \n ", name);
        for (Department department : departmentList) {
            System.out.println(department);
        }
    }

}
