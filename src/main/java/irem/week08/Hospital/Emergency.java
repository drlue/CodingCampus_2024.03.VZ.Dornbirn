package irem.week08.Hospital;

import java.util.ArrayList;
import java.util.List;

public class Emergency extends Department {

    private String openingTime;
    private int maxCapacity;
    private List<Department>departmentList;

    public Emergency(String name, String openingTime, int maxCapacity) {
        super(name);
        this.openingTime = openingTime;
        this.maxCapacity = maxCapacity;
        departmentList=new ArrayList<>();

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
    @Override
    public void addPatient(Patient patient) {
        if (patientList.size() < maxCapacity) {
            patientList.add(patient);
            System.out.println(patient + " is healing process will not die we hope");
        }else {
            System.out.println("now he will die...");
        }

    }
    public boolean releasePatient(){
        return true;
    }
}
