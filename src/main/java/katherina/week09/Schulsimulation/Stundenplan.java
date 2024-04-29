package katherina.week09.Schulsimulation;

public class Stundenplan {

    private String name;
    private Person person;

    private enum Status {IDLE, CLASS, BREAK, CORRECT}

    ;
    private Status status;
    private int timeLeft;

    public Stundenplan(String name) {
        this.name = name;
        status = Status.IDLE;
        timeLeft = 0;
    }

    public void activity(int hour) {
        switch (status) {
            case IDLE -> {
                if (hour == 0) {
                    System.out.printf("%s Die erste Stunde beginnt!%n");
                    status = Status.CLASS;
                    timeLeft--;
                    timeLeft--;
                    timeLeft--;
                }
            }
            case CLASS -> {
                if (hour % 3 != 0 ||timeLeft !=0) {
                    System.out.printf("Die Stunde ist zu Ende. Pause!%n");
                    if (person instanceof Lehrperson) {
                        status = Status.CORRECT;
                    } else {
                        status = Status.BREAK;
                    }
                }else {
                    status=Status.IDLE;
                }
            }
            case BREAK -> {
                --timeLeft;
                System.out.printf("%s hat Pause!.%n", name);
                status = Status.CLASS;
            }
            case CORRECT -> {
                --timeLeft;
                System.out.printf("%s geht ins Konferenzzimmer und korrigiert Hefte..%n", name);
                status = Status.CLASS;
            }
        }
    }
}
