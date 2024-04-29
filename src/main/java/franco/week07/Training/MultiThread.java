package franco.week07.Training;

public class MultiThread extends Thread{
    private int threadNum;


    public MultiThread(int threadNum){
        this.threadNum=threadNum;

    }
    @Override
    public void run(){
        for (int i = 1; i <=5 ; i++) {

            System.out.println(i+" From thread "+threadNum);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
