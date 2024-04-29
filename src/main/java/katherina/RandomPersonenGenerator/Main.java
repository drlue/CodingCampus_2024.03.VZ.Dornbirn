package katherina.RandomPersonenGenerator;

import static katherina.RandomPersonenGenerator.RandomLehrperson.generateLehrperson;
import static katherina.RandomPersonenGenerator.RandomStudent.generateStudent;
import static katherina.week08.Schwarzwaldklinik.Patient.generatePatient;

public class Main {
    public static void main(String[] args) {

//        for (int index = 0; index <10 ; index++) {
//            System.out.println(generatePatient());
//            System.out.println();
//        }

                for (int index = 0; index <10 ; index++) {
            System.out.println(generateLehrperson());
            System.out.println();
        }

//        for (int index = 0; index <10 ; index++) {
//            System.out.println(generateStudent());
//            System.out.println();
//        }


    }
}
