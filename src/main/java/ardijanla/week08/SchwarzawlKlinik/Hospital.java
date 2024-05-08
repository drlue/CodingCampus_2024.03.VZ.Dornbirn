package ardijanla.week08.SchwarzawlKlinik;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
    private String name;

    private List<Department> departments;

    public Hospital(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department department){
        departments.add(department);
    }
}
