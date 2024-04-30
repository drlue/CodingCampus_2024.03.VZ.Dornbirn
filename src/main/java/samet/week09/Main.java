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
        school.addRoom(lehrerzimmer);

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
        Student leonie = new Student("Leonie");
        Student max = new Student("Max");
        Student franco = new Student("Franco");
        Student lukas = new Student("Lukas");
        Student irem = new Student("Irem");
        Student katarina = new Student("Katerina");
        Student samet = new Student("Samet");
        Student fatma = new Student("Fatma");
        Student hans = new Student("Hans");

        klasseA.addStudent(ali);
        klasseA.addStudent(jeff);
        klasseA.addStudent(leonie);
        klasseA.addStudent(max);
        klasseA.addStudent(franco);

        klasseB.addStudent(jonas);
        klasseB.addStudent(diana);
        klasseB.addStudent(lukas);
        klasseB.addStudent(irem);
        klasseB.addStudent(katarina);

        klasseC.addStudent(steffanie);
        klasseC.addStudent(toni);
        klasseC.addStudent(samet);
        klasseC.addStudent(fatma);
        klasseC.addStudent(hans);

        TimeTable mathematik = new TimeTable("Mathematik Unterricht");
        TimeTable musik = new TimeTable("Musik Unterricht");
        TimeTable werken = new TimeTable("Werk Unterricht");
        TimeTable turnen = new TimeTable("Turn Unterricht");
        klassenzimmer.addTimeTable(mathematik);
        musiktimmer.addTimeTable(musik);
        werkraum.addTimeTable(werken);
        turnhalle.addTimeTable(turnen);
        klasseA.addTimetables(mathematik);
        klasseB.addTimetables(musik);
        klasseC.addTimetables(werken);


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
