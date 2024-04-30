package lukas.week09.SchoolSim;

import lukas.week09.SchoolSim.Persons.Headmaster;
import lukas.week09.SchoolSim.Persons.Student;
import lukas.week09.SchoolSim.Persons.Teacher;
import lukas.week09.SchoolSim.Rooms.ClassRoom;
import lukas.week09.SchoolSim.Rooms.Gym;
import lukas.week09.SchoolSim.Rooms.TeachersRoom;
import lukas.week09.SchoolSim.Rooms.TechRoom;

public class Main {

    public static void main(String[] args) {
        System.out.println("--------------THIS IS SCHOOL--------------");

        School school = new School("Volksschule Rotkreuz", "Lustenau", 6890);
        //TeachersRoom
        TeachersRoom teachersRoom = new TeachersRoom("Teachers Room");
        school.addRoom(teachersRoom);
        //ClassRooms
        for (int i = 0; i < 5; i++) {
            ClassRoom classRoom = new ClassRoom("Classroom " + (i + 1));
            school.addRoom(classRoom);
        }
        //TechRoom
        for (int i = 0; i < 2; i++) {
            TechRoom techRoom = new TechRoom("Workroom " + (i + 1));
            school.addRoom(techRoom);
        }
        //Gym
        for (int i = 0; i < 2; i++) {
            Gym gym = new Gym("Gym " + (i + 1));
            school.addRoom(gym);
        }


        //Headmaster
        school.setHeadmaster(new Headmaster(0, "Elmar", "Dür", "Mag.", "Mathematik", "Sport"));
        //Teachers
        school.addTeacher(new Teacher(1, "Brigitte", "Bertle", "Dr.", "Deutsch", "Französich"));
        school.addTeacher(new Teacher(2,"Josef", "Moosbrugger", "Mag.", "Mathematik", "Informatik"));
        school.addTeacher(new Teacher(3,"Günther", "Groß", "Mag.", "Geographie", "Geschichte"));
        school.addTeacher(new Teacher(4,"Andrea", "Kühny", "Dr.", "Latein", "Französisch"));
        school.addTeacher(new Teacher(5,"Klaus", "Fellner", "Mag.", "Sport", "Mathematik"));
        school.addTeacher(new Teacher(6, "Stephanie", "Stark", "Mag.", "Englisch", "Deutsch"));
        school.addTeacher(new Teacher(7, "Gyula", "Horvath", "Msc.", "Informatik", "Philosophie"));
        school.addTeacher(new Teacher(8, "Tim", "Allen", "Prof.", "Technik"));
        school.addTeacher(new Teacher(9, "Al", "Boland", "Dr.", "Technik"));

        String[] firstName = new String[]{"Max", "Sophia"};
        String[] lastName = new String[]{"Müller", "Schmidt"};

        for (int i = 0; i < 8; i++) {
            SchoolClass sc = new SchoolClass("Klasse " + (1+i / 2) + (char)('a' + i %2));
            school.addSchoolClass(sc);
            int countStudent = School.random.nextInt(5,20);
            for (int j = 0; j < countStudent; j++) {
                Student st = new Student(
                        firstName[School.random.nextInt(firstName.length)],
                        lastName[School.random.nextInt(lastName.length)]);
                sc.addStudent(st);
            }
        }
        school.printStructure();
        //System.exit(0);
        //SchoolClass and students
        SchoolClass schoolClass1 = new SchoolClass("Klasse 1a");
        school.addSchoolClass(schoolClass1);
        schoolClass1.addStudent(new Student("Max", "Müller"));
        schoolClass1.addStudent(new Student("Sophia", "Schmidt"));
        schoolClass1.addStudent(new Student("Jonas", "Wagner"));
        schoolClass1.addStudent(new Student("Leonie", "Becker"));
        schoolClass1.addStudent(new Student("Lukas", "Hofmann"));
        SchoolClass schoolClass2 = new SchoolClass("Klasse 1b");
        school.addSchoolClass(schoolClass2);
        schoolClass2.addStudent(new Student("Emilia", "Weber"));
        schoolClass2.addStudent(new Student("Felix", "Schulz"));
        schoolClass2.addStudent(new Student("Laura", "Richter"));
        schoolClass2.addStudent(new Student("Noah", "Schäfer"));
        schoolClass2.addStudent(new Student("Hannah", "Zimmermann"));

        //Lessons
        schoolClass1.addLesson(new Lesson("08:00", "Mathematik", school.getTeacherByName("Josef Moosbrugger"), school.getRoomByName("Classroom 1")));
        schoolClass1.addLesson(new Lesson("09:00", "Deutsch", school.getTeacherByName("Brigitte Bertle"), school.getRoomByName("Classroom 2")));
        schoolClass1.addLesson(new Lesson("10:00", "Latein", school.getTeacherByName("Andrea Kühny"), school.getRoomByName("Classroom 3")));
        schoolClass1.addLesson(new Lesson("11:00", "Geographie", school.getTeacherByName("Günther Groß"), school.getRoomByName("Classroom 1")));
        schoolClass1.addLesson(new Lesson("13:00", "Informatik", school.getTeacherByName("Gyula Horvath"), school.getRoomByName("Classroom 4")));
        schoolClass1.addLesson(new Lesson("14:00", "Sport", school.getTeacherByName("Klaus Fellner"), school.getRoomByName("Gym 1")));
        schoolClass1.addLesson(new Lesson("15:00", "Technik", school.getTeacherByName("Tim Allen"), school.getRoomByName("Workroom 1")));
        schoolClass1.addLesson(new Lesson("16:00", "Technik", school.getTeacherByName("Tim Allen"), school.getRoomByName("Workroom 1")));

        schoolClass2.addLesson(new Lesson("08:00", "Englisch", school.getTeacherByName("Stephanie Stark"), school.getRoomByName("Classroom 4")));
        schoolClass2.addLesson(new Lesson("09:00", "Französisch", school.getTeacherByName("Andrea Kühny"), school.getRoomByName("Classroom 3")));
        schoolClass2.addLesson(new Lesson("10:00", "Philosphie", school.getTeacherByName("Gyula Horvath"), school.getRoomByName("Classroom 4")));
        schoolClass2.addLesson(new Lesson("11:00", "Mathematik", school.getTeacherByName("Josef Moosbrugger"), school.getRoomByName("Classroom 1")));
        schoolClass2.addLesson(new Lesson("14:00", "Technik", school.getTeacherByName("Al Boland"), school.getRoomByName("Workroom 2")));
        schoolClass2.addLesson(new Lesson("15:00", "Technik", school.getTeacherByName("Al Boland"), school.getRoomByName("Workroom 2")));
        schoolClass2.addLesson(new Lesson("16:00", "Sport", school.getTeacherByName("Klaus Fellner"), school.getRoomByName("Gym 2")));



        school.printStructure();

        school.simulateDays(10);


    }
}
