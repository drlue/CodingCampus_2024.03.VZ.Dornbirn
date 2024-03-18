package gyula.week04;

public class StringExample {
    public static void main(String[] args) {
        String textToTest = "gyula.horvath@digitalcampusvorarlberg.at";

        System.out.println("Matches: " + textToTest.matches("[a-zA-Z]+(.[a-zA-Z]+)*@[a-zA-Z]+(.[a-zA-Z]+)+"));
        System.out.println(textToTest.substring(6, 13));
        System.out.println(textToTest.replace('a', 'A'));
        String[] names = {"Alfonso", "Beatrix", "Cecil"};
        System.out.println(String.join(";", names));
        System.out.println("IsBlank? : " + "".isBlank());
        System.out.println("IsBlank? : " + "      ".isBlank());
        System.out.println("IsBlank? : " + "\n\n\n\n\n".isBlank());
        System.out.println("IsBlank? : " + "\n\nssdsfg\n\n\n".isBlank());
        System.out.println("isEmpty? : " + "".isEmpty());
        System.out.println("isEmpty? : " + "      ".isEmpty());
        System.out.println("isEmpty? : " + "\n\n\n\n\n".isEmpty());
        System.out.println("isEmpty? : " + "\n\nssdsfg\n\n\n".isEmpty());
        System.out.println("strip: " + textToTest.strip());
        System.out.println("strip: " + "              abc     ".strip());
        System.out.println("equals: " + textToTest.equals("abc"));

        System.out.println("Ich\\sliebe\\sdich!\\n(copyright\\sby\\sAki)");
        System.out.println("Ich\\sliebe\\sdich!\\n(copyright\\sby\\sAki)".translateEscapes());
    }

}
