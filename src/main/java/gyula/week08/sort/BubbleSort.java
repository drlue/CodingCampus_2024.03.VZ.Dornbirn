package gyula.week08.sort;

public class BubbleSort {
    public static void sort(String[] arr, IComp comp){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (comp.compare(arr[j], arr[j + 1]) > 0){
                    String tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }


    public static void sort(IObjectComp[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j].compare(arr[j + 1]) > 0){
                    IObjectComp tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }
}
