package franco.week07.Training;

public class MultiThreading {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            MultiThread myThing=new MultiThread(i);
            myThing.start();

        }

    }
}
