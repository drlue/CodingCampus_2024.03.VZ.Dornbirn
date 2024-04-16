package katherina.week7.day01.zoo;


import java.util.Random;
import java.util.Vector;

public class EinTagImZoo {
    private static Random random = new Random();

    public static class Tierpfleger{
        private String pfleger;

        enum Status { ENTER, FEED, WATCH, ADMIRE, LEAVE};
        private Status status;
        private int dauer;
        private String liebling;
        private Vector<Pfleger> personenliste;
        private Vector<Gehege> gehegeList;

        public Tierpfleger(String name, String liebling){
            this.pfleger = name;
            this.liebling = liebling;
            status = Status.ENTER;
            personenliste = new Vector<>();
            dauer = 0;
            gehegeList = new Vector<>();

        }

        public void activity(int hour){
            switch (status){
                case ENTER -> {
                    if (hour == 7) {
                        System.out.printf("Es ist %d Uhr. %s betritt das Gehege.%n",hour, pfleger);
                        status = Tierpfleger.Status.FEED;
                        dauer =1;
                    }
                }
                case FEED -> {
                        System.out.printf("Es ist nun %d Uhr. %s füttert [Tier], in [Gehege].%n", hour, pfleger);
                        status = Tierpfleger.Status.WATCH;//Hier muss noch rein: Zufallstier watchen!
                        //Und "iff" das gewatchte Tier das Lieblingstier ist, dann ist das nächste Case
                        //nicht "WATCH", sondern "ADMIRE".
                        //Pro Tier Zeit einplanen.
                    dauer =random.nextInt(3, 6);
                }
                case WATCH -> {
                    System.out.printf("Es ist nun %d Uhr. %s beobachtet [Tier] eine Weile.%n", hour, pfleger);
                    status = Tierpfleger.Status.LEAVE;
                    dauer = random.nextInt(2, 4);
                }
                case ADMIRE -> {
                    --dauer;
                    if (dauer <= 0){
                        System.out.printf("Es ist nun %d Uhr. %s findet [Tier] wunderschön und beobachtet es..%n", hour,pfleger);
                        status = Tierpfleger.Status.LEAVE;
                    }
                    dauer=2;
                }
                case LEAVE -> {
                    System.out.printf("Es ist nun %d Uhr. %s verlässt das Gehege.%n",hour,pfleger);
                    status = Tierpfleger.Status.ENTER;
                }
            }
        }
    }


    public static void sleep(long milis){
        try {
            Thread.sleep(milis);
        } catch (InterruptedException ie){}
    }

    public static void main(String[] args) {
       Tierpfleger[] pfleger = new Tierpfleger[]{
                new Tierpfleger("Paul Rossmann","Murmeltier"),
                new Tierpfleger("Alexandra Kovacevic","Koi-Karpfen"),
        };
        for (int day = 1; day <= 3; day++) {
            System.out.printf("Tag %d in unserem Zoo bricht an:%n", day);
            for (int hour = 0; hour < 24; hour++) {
                for (int i = 0; i < pfleger.length; i++) {
                    pfleger[i].activity(hour);
                }
                sleep(250);
            }
        }
    }


}
