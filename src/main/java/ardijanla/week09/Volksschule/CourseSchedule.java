package ardijanla.week09.Volksschule;

public class CourseSchedule {
    private String thema;
    private Teacher teacher;
    private Room room;

    public CourseSchedule(String thema, Teacher teacher, Room room) {
        this.thema = thema;
        this.teacher = teacher;
        this.room = room;
    }
}
