package samet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sandkastli {



    public static void main(String[] args) {
        String email = "samet.sevimli07@gmail.com"; // Hier die E-Mail-Adresse eingeben, die du überprüfen möchtest

        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);

        if (matcher.matches()) {
            System.out.println("Die E-Mail-Adresse ist gültig.");
        } else {
            System.out.println("Die E-Mail-Adresse ist ungültig.");
        }
    }
}






