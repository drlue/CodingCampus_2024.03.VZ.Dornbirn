package katherina.week04.day01;


public class BubbleSortStringExtended {

    public static void main(String[] args) {
        String[] names = new String[]{"Samet", "Franco", "Demian", "Lukas", "Katherina", "Irem", "Ardijanla", "Aki", "Luki", "Sandro", "Berna", "Gyula"};

        boolean alpha = false;
        boolean asc = true;

        sortExtended(names, alpha, asc);
        System.out.println("Sort by " + (alpha?"Alphabetical":"length") + " " + (asc?"ascending":"descending"));
        BubbleSortString.printWithForI(names);
        System.out.println();
    }


    public static void sortExtended(String[] names, boolean alpha, boolean ascending) {
        if (alpha && ascending) {
            BubbleSortString.bubblesortNachAlphaHoch(names);
        }
        else if (alpha && !ascending) {
            BubbleSortString.bubblesortNachAlphaRunter(names);
        }
        else if (!alpha && ascending) {
            BubbleSortString.bubblesortNachLengthHoch(names);
        }
        else {
            BubbleSortString.bubblesortNachLengthRunter(names);
        }
    }

}
