package christian.week08.schoolSimulationV2;

import christian.week08.schoolSimulationV2.humans.SchoolClass;
import christian.week08.schoolSimulationV2.humans.Teacher;
import christian.week08.schoolSimulationV2.rooms.Room;

public class Timetable {
    private String name;
    private SchoolClass[] classArray;
    private Teacher[] teacherArray;

    public Timetable(String name){
        this.name = name;
        classArray= new SchoolClass[8];
        teacherArray = new Teacher[8];
    }
    //======================================================================================================get=========
 public SchoolClass getSchoolClassAtIndex(int index){
     if(classArray[index]!=null){
         return classArray[index];
     } else{
         return null;
     }
 }
 public Teacher getTeacherAtIndex(int index){
     if(teacherArray[index]!=null){
         return teacherArray[index];
     } else{
         return null;
     }
 }
    //======================================================================================================set=========
    //======================================================================================================create======
    //==================================================================================================add/remove======
    public void  addSchoolClass(SchoolClass schoolClass){
        for (int i = 0; i < classArray.length; i++) {
            if(classArray[i]==null){
                classArray[i] = schoolClass;
                break;
            }
        }
    }
    public void addTeacher(Teacher teacher){
        for (int i = 0; i < teacherArray.length; i++) {
            if(teacherArray[i]==null){
                teacherArray[i]=teacher;
                break;
            }
        }
    }
    //==================================================================================================alter===========
    //==================================================================================================simulate========

}
