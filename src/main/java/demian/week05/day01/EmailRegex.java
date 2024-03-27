package demian.week05.day01;

public class EmailRegex {

    public static void main(String[] args) {

        // AUFGABE:Erstelle einen regulären Ausdruck (Regular Expression) für Email Adressen.
        // String regex = "[richtiger Regex hier]";
        // Aufruf          System.out.println("alfons@drlue.at".matches(regex));             Ausgabe true
        // Aufruf          System.out.println("rambina.alfons@drlue.at".matches(regex));     Ausgabe true
        // Aufruf          System.out.println("rambina1.1alfons@drlue.at".matches(regex));   Ausgabe true
        // Aufruf          System.out.println("1rambina1.alfons@drlue.at".matches(regex));   Ausgabe false
        // Aufruf          System.out.println("@drlue.at".matches(regex));                   Ausgabe false
        // Aufruf          System.out.println("drlue.at".matches(regex));                    Ausgabe false
        // Aufruf          System.out.println("asdf@drlue".matches(regex));                  Ausgabe false
        // Aufruf          System.out.println("asdf@microsoft.c".matches(regex));            Ausgabe false

        String regex = "[^(.+)@(\\\\S+)$$]";
        System.out.println("alfons@drlue.at".matches(regex));
        System.out.println("rambina.alfons@drlue.at".matches(regex));
        System.out.println("asdf@microsoft.c".matches(regex));
    }
}
