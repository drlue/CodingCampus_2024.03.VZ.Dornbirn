package christian.week08.schoolSimulationV2;

import christian.week08.schoolSimulationV2.humans.SchoolClass;
import christian.week08.schoolSimulationV2.humans.Teacher;
import christian.week08.schoolSimulationV2.rooms.Room;

public class Timetable {
    private String name;
    private SchoolClass[] classArray = new SchoolClass[8];
    private Teacher[] teacherArray = new Teacher[8];
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
    //==================================================================================================alter===========
    //==================================================================================================simulate========

}
