package franco.homework;

public class TwoDimensionArray {
    public static void main(String[] args) {
        String[][] subjects = {
                { "Data Structures & Algorithms",
                        "Programming & Logic", "Software Engineering",
                        "Theory of Computation" },                       // row 1

                { "Thermodynamics", "Metallurgy",
                        "Machine Drawing",
                        "Fluid Mechanics" },                             // row2

                { "Signals and Systems", "Digital Electronics",
                        "Power Electronics" }                            // row3
        };

        System.out.println(
                "Fundamental Subject in Computer Engineering: "
                        + subjects[0][0]);
        System.out.println(
                "Fundamental Subject in Mechanical Engineering: "
                        + subjects[1][3]);
        System.out.println(
                "Fundamental Subject in Electronics Engineering: "
                        + subjects[2][1]);
    }
}
