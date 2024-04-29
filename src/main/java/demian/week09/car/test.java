package demian.week09.car;

public class test {
    public static void main(String[] args) {
        int weight = 1500;
        int powerInkW = 150;
        int km = 1;
        double usage = km * (0.000033* weight + 0.0002*powerInkW );
        System.out.println(usage);
    }
}
