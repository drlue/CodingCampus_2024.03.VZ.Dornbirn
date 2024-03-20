package katherina.week04.day03;

//Um die einzelnen Buchstaben und Zeichen zu zählen soll ein int[] verwendet werden.
// Der entsprechende char kann für das Array als Index verwendet werden.
// Gib am Schluss die Anzahl der einzelnen Zeichen (zb. A,a,ä,.) aus.

import java.util.Arrays;

public class ZeichenCounter {
    public static void main(String[] args) {
        String text = (String.join("\n", "Marie Sk\u0142odowska Curie (* 7. November 1867 in Warschau, Russisches Kaiserreich; \u2020 4. Juli 1934 bei Passy, geborene Maria Salomea Sk\u0142odowska) war eine Physikerin und Chemikerin polnischer Herkunft, die in Frankreich lebte und wirkte. Sie untersuchte die 1896 von Henri Becquerel beobachtete Strahlung von Uranverbindungen und pr\u00E4gte f\u00FCr diese das Wort \u201Eradioaktiv\u201C. Im Rahmen ihrer Forschungen, f\u00FCr die ihr 1903 ein anteiliger Nobelpreis f\u00FCr Physik und 1911 der Nobelpreis f\u00FCr Chemie zugesprochen wurde, entdeckte sie gemeinsam mit ihrem Ehemann Pierre Curie die chemischen Elemente Polonium und Radium. Marie Curie ist die einzige Frau unter den vier Personen, denen bisher mehrfach ein Nobelpreis verliehen wurde, und neben Linus Pauling die einzige Person, die Nobelpreise auf zwei unterschiedlichen Fachgebieten erhielt.\n", "Marie Curie wuchs im damals zu Russland gehörigen Teil Polens auf. Da Frauen dort nicht zum Studium zugelassen wurden, zog sie nach Paris und begann Ende 1891 ein Studium an der Sorbonne, das sie mit Lizenziaten in Physik und Mathematik beendete. Im Dezember 1897 begann sie die Erforschung radioaktiver Substanzen, die seitdem den Schwerpunkt ihrer wissenschaftlichen Tätigkeit bildeten. Nach dem Unfalltod Pierre Curies wurden ihr 1906 zunächst seine Lehrverpflichtungen übertragen. Zwei Jahre später wurde sie schließlich auf den für ihn geschaffenen Lehrstuhl für Allgemeine Physik berufen. Sie war die erste Frau und die erste Professorin, die an der Sorbonne lehrte. Als sich Marie Curie 1911 um einen Sitz in der Académie des sciences bewarb und im selben Jahr ihr Verhältnis mit Paul Langevin bekannt wurde, erschienen in der Boulevardpresse Artikel, in denen sie persönlich angegriffen und als Fremde, Intellektuelle, Jüdin und sonderbare Frau bezeichnet wurde.\n", "Während des Ersten Weltkrieges widmete sich Marie Curie als Radiologin der Behandlung verwundeter Soldaten. Sie entwickelte einen Röntgenwagen, der es ermöglichte, radiologische Untersuchungen in unmittelbarer Nähe der Front vorzunehmen, und beteiligte sich an der Qualifizierung der notwendigen Techniker und Krankenschwestern. Nach dem Krieg engagierte sie sich in der Internationalen Kommission für Geistige Zusammenarbeit des Völkerbundes für bessere Arbeitsbedingungen von Wissenschaftlern. An dem von ihr geleiteten Pariser Radium-Institut setzte sie sich für die Förderung von weiblichen und ausländischen Studenten ein."));
        System.out.println(text);
        System.out.println();
        System.out.println("Um die Zeichen zählen zu können, muss zunächst einmal der Text in Zeichen zerlegt werden.");
        System.out.println();
        System.out.println(Arrays.toString(text.toCharArray()));
        char[] arr = text.toCharArray();
        System.out.println("Dieser Text enthält" +countUniqueLetters(Arrays.toString(arr)) + "unterschiedliche Zeichen.");
    }

    public static int countUniqueLetters(String text) {
        boolean[] isItThere = new boolean[Character.MAX_VALUE];
        for (int index = 0; index < text.length(); index++) {
            isItThere[text.charAt(index)] = true;
        }

        int count = 0;
        for (int index = 0; index < isItThere.length; index++) {
            if (isItThere[index]) {
                count++;
            }
        }

        return count;
    }
}
