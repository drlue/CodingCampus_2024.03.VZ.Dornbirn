package lukas.week07.codeSim;

public class simMain {
    public static void main(String[] args) {
        Koch[] kitchen = new Koch[]{
            new Koch("Lukas"),
            new Koch("Samet"),
            new Koch("Christian")
        };


        while (isAnyCookNotFinished(kitchen)){
            for (Koch k: kitchen) {
                k.tick();
            }
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {}
        }
    }


    private static boolean isAnyCookNotFinished(Koch[] kitchen){
        boolean result = false;
        int i = 0;
        while (!result && i < kitchen.length){
            if (!kitchen[i].hasFinished()) {
                result = true;
            }
            ++i;
        }
        return result;
    }
}
