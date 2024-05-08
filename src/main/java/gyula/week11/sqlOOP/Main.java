package gyula.week11.sqlOOP;

public class Main {
    public static void main(String[] args) {
        Country austria = new Country("Austria", "A", "Vienna", 9805030);

        City vienna = austria.searchAndCreateCityByName("Vienna");
        vienna.setPopulation(2000000);

        for (int i = 0; i < 5; i++) {
            City c = austria.searchAndCreateCityByName("Stadt " + (1+i));
            c.setPopulation((1+i)*20500);
        }

        System.out.println("Aaaa");
    }
}
