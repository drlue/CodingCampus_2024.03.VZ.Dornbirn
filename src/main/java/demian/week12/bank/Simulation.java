package demian.week12.bank;

public class Simulation {

    public static void main(String[] args) {

        //BANK ERSTELLEN
        Bank sparkasse = new Bank();

        //KUNDEN ERSTELLEN
        Customer demian = new Customer();
        Customer christian = new Customer();
        Customer lukas = new Customer();

        //KUNDEN ZU BANK HINZUFÜGEN
        sparkasse.addCustomer(demian);
        sparkasse.addCustomer(christian);
        sparkasse.addCustomer(lukas);

        //KONTEN ERSTELLEN
        Account gehaltskonto = new Account(1209348104);
        Account gehaltskonto2 = new Account(1234312);
        Account gehaltskonto3 = new Account(432151515);
        Account gehaltskonto4 = new Account(2134163612);

        //KONTEN KUNDEN ZUORDNEN
        demian.addAccount(gehaltskonto);
        demian.addAccount(gehaltskonto2);
        christian.addAccount(gehaltskonto3);
        lukas.addAccount(gehaltskonto4);





    }
}
