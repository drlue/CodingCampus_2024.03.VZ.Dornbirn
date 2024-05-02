package christian.week08.schoolSimulationV2.rooms;

import christian.week08.schoolSimulationV2.Main;
import christian.week08.schoolSimulationV2.Timetable;
import christian.week08.schoolSimulationV2.humans.SchoolClass;
import christian.week08.schoolSimulationV2.humans.Teacher;

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

//    public void simulateLesson(){
//        if(Main.rnd.nextInt(0,101)<=5){
//            activeClass.getRandomPupil();
//        }
//    }

    public void takeDataFromTimetable(int hour) {
        int index = 0;
        switch (hour) {
            case 8 -> {
                if (timetable.getSchoolClassAtIndex(index) != null && timetable.getTeacherAtIndex(index) != null) {
                    setActiveClass(timetable.getSchoolClassAtIndex(index));
                    setActiveTeacher(timetable.getTeacherAtIndex(index));
                } else {
                    System.out.printf("%s is empty!",this.name);
                }
            }
            case 9 -> {
                index = 1;
                if (timetable.getSchoolClassAtIndex(index) != null && timetable.getTeacherAtIndex(index) != null) {
                    setActiveClass(timetable.getSchoolClassAtIndex(index));
                    setActiveTeacher(timetable.getTeacherAtIndex(index));
                }else {
                    System.out.printf("%s is empty!",this.name);
                }
            }
            case 10 -> {
                index = 2;
                if (timetable.getSchoolClassAtIndex(index) != null && timetable.getTeacherAtIndex(index) != null) {
                    setActiveClass(timetable.getSchoolClassAtIndex(index));
                    setActiveTeacher(timetable.getTeacherAtIndex(index));
                }else {
                    System.out.printf("%s is empty!",this.name);
                }
            }
            case 11 -> {
                index = 3;
                if (timetable.getSchoolClassAtIndex(index) != null && timetable.getTeacherAtIndex(index) != null) {
                    setActiveClass(timetable.getSchoolClassAtIndex(index));
                    setActiveTeacher(timetable.getTeacherAtIndex(index));
                }else {
                    System.out.printf("%s is empty!",this.name);
                }
            }
            case 12 -> {
                index = 4;
                if (timetable.getSchoolClassAtIndex(index) != null && timetable.getTeacherAtIndex(index) != null) {
                    setActiveClass(timetable.getSchoolClassAtIndex(index));
                    setActiveTeacher(timetable.getTeacherAtIndex(index));
                }else {
                    System.out.printf("%s is empty!",this.name);
                }
            }
            case 13 -> {
                setActiveClass(null);
                setActiveTeacher(null);
                System.out.println("Teachers and Pupils have Lunchbreak!");
            }
            case 14 -> {
                index = 5;
                if (timetable.getSchoolClassAtIndex(index) != null && timetable.getTeacherAtIndex(index) != null) {
                    setActiveClass(timetable.getSchoolClassAtIndex(index));
                    setActiveTeacher(timetable.getTeacherAtIndex(index));
                }else {
                    System.out.printf("%s is empty!",this.name);
                }
            }
            case 15 -> {
                index = 6;
                if (timetable.getSchoolClassAtIndex(index) != null && timetable.getTeacherAtIndex(index) != null) {
                    setActiveClass(timetable.getSchoolClassAtIndex(index));
                    setActiveTeacher(timetable.getTeacherAtIndex(index));
                }else {
                    System.out.printf("%s is empty!",this.name);
                }
            }
            case 16 -> {
                index = 7;
                if (timetable.getSchoolClassAtIndex(index) != null && timetable.getTeacherAtIndex(index) != null) {
                    setActiveClass(timetable.getSchoolClassAtIndex(index));
                    setActiveTeacher(timetable.getTeacherAtIndex(index));
                }else {
                    System.out.printf("%s is empty!",this.name);
                }
            }
        }
    }
}