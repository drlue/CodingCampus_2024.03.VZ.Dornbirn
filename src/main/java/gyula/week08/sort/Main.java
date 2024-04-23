package gyula.week08.sort;

import javax.swing.plaf.ButtonUI;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] names = {
                "Aki",
                "Christian",
                "Lukas",
                "Katherina",
                "Irem",
                "Gyula",
                "Demian"
        };

        System.out.println(Arrays.toString(names));
        IComp[] compArray = new IComp[]{
                new CompareByLength(),
                new CompareByAlpha(true),
                new CompareByAlpha(false),
                new CompareLengthAndFirstLetter()
        };
        for (IComp comp : compArray) {
            BubbleSort.sort(names, comp);
            System.out.println(Arrays.toString(names));
        }

        BubbleSort.sort(names, new IComp() {
            @Override
            public int compare(String a, String b) {
                return a.length() - b.length();
            }
        });
        System.out.println(Arrays.toString(names));

        BubbleSort.sort(names, (a, b) -> {
            String aRev = reverse(a);
            String bRev = reverse(b);
            return aRev.compareTo(bRev);
        });
        System.out.println(Arrays.toString(names));



        Zoo[] alleZoos = new Zoo[]{
                new Zoo("Zoo von Lukas", 1977),
                new Zoo("Zoo von Aki", 1955),
                new Zoo("Zoo von Christian", 2015)
        };

        BubbleSort.sort(alleZoos);
        System.out.println(Arrays.toString(alleZoos));

    }

    public static String reverse(String a) {
        char[] arr = a.toCharArray();
        for (int i = 0; i < arr.length / 2; i++) {
            char tmp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = tmp;
        }
        return new String(arr);
    }
}
