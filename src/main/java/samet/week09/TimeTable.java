package samet.week09;

import java.util.ArrayList;
import java.util.List;

public class TimeTable {

    private String exercise;
    private List<Room> rooms;
    //private List<SchoolClass> classes;
    private List<Teacher> teachers;

    public TimeTable(String exercise){
        this.exercise = exercise;
        this.rooms = new ArrayList<>();
     //   this.classes = new ArrayList<>();
        this.teachers = new ArrayList<>();
    }

    public String getExercise() {
        return exercise;
    }

    public List<Room> getRooms() {
        return rooms;
    }

   // public List<SchoolClass> getClasses() {
     //   return classes;
    }

   // public List<Teacher> getTeachers() {
   //     return teachers;
  //  }

   // public void addSchoolClass(SchoolClass schoolClass){
   //     classes.add(schoolClass);

   // }
//}
