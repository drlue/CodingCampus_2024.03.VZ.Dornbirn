package christian.week08.schoolSimulationV2.rooms;

import christian.week08.schoolSimulationV2.Timetable;
import christian.week08.schoolSimulationV2.humans.Human;
import christian.week08.schoolSimulationV2.humans.SchoolClass;
import christian.week08.schoolSimulationV2.humans.Teacher;

import java.util.ArrayList;
import java.util.Arrays;

public class Room {
    private String name;
    private SchoolClass activeClass;
    private Teacher activeTeacher;
    private Timetable timetable;
    //======================================================================================================get=========
    public Teacher getActiveTeacher() {
        return activeTeacher;
    }
    public SchoolClass getActiveClass() {
        return activeClass;
    }
    //======================================================================================================set=========
    public void setActiveTeacher(Teacher activeTeacher) {
        if (this.activeTeacher != activeTeacher) {
            this.activeTeacher = activeTeacher;
        }

    }
    public void setActiveClass(SchoolClass activeClass) {
        if (this.activeClass != activeClass) {
            this.activeClass = activeClass;
        }

    }
    //======================================================================================================create======
    //==================================================================================================add/remove======
    //==================================================================================================alter===========
    //==================================================================================================simulate========




    public void simulateHour(int hour){
        int index = 0;
        switch (hour){
            case 8 ->{
                setActiveClass(timetable.getSchoolClassAtIndex(index));
                setActiveTeacher(timetable.getTeacherAtIndex(index));
            }


        }
    }
}
