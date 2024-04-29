package samet.week09;



public class Main {

    public static void main(String[] args) {

        School school = new School("HTL Dornbirn");

        Room klassenzimmer = new Room("Klassenzimmer");
        Room turnhalle = new Room("Turnhalle");
        Room werkraum = new Room("Werkraum");
        Room musiktimmer = new Room("Musikzimmer");
        Room lehrerzimmer = new Room("Lehrerzimmer");
        school.addRoom(klassenzimmer);
        school.addRoom(turnhalle);
        school.addRoom(werkraum);
        school.addRoom(musiktimmer);

        Teacher johann = new Teacher("Herr Liebherr");
        Teacher klaus = new Teacher("Herr Knopf");
        Teacher maria = new Teacher("Frau Müller");
        Teacher dieter = new Teacher("Herr Blum");
        school.addTeacher(johann);
        school.addTeacher(maria);
        school.addTeacher(klaus);
        school.addTeacher(dieter);

        SchoolClass klasseA = new SchoolClass("Klasse 3a");
        SchoolClass klasseB = new SchoolClass("Klasse 3b");
        SchoolClass klasseC = new SchoolClass("Klasse 3c");
        school.addSchoolClasses(klasseA);
        school.addSchoolClasses(klasseB);
        school.addSchoolClasses(klasseC);

        Student ali = new Student("Ali ");
        Student jeff = new Student("Jeff ");
        Student jonas = new Student("Jonas ");
        Student diana = new Student("Diana ");
        Student steffanie = new Student("Steffanie ");
        Student toni = new Student("Toni ");

        klasseA.getStudentList().add(ali);
        klasseA.getStudentList().add(jeff);
        klasseB.getStudentList().add(jonas);
        klasseB.getStudentList().add(diana);
        klasseC.getStudentList().add(steffanie);
        klasseC.getStudentList().add(toni);

        sleep(1000);


        for (int day = 1; day <= 5; day++) {
            school.startDay();
            sleep(1000);
        }
    }
    public static void sleep(long millis){
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
