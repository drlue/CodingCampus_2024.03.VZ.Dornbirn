package lukas.week04;

public class BlinkingText {

    public static void main(String[] args) {
        blinkText("Hello, World!", 5); // Blink "Hello, World!" 5 times
    }

    public static void blinkText(String text, int times) {
        for (int i = 0; i < times; i++) {
            System.out.print(text); // Print the text
            try {
                Thread.sleep(500); // Pause for 500 milliseconds (half a second)
                clearText(text.length()); // Clear the text after 500 milliseconds
                Thread.sleep(500); // Pause for another 500 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void clearText(int length) {
        // Print backspaces to clear the text
        for (int i = 0; i < length; i++) {
            System.out.print("\b");
        }
        // Print spaces to overwrite the cleared text
        for (int i = 0; i < length; i++) {
            System.out.print(" ");
        }
        // Print backspaces again to position the cursor back to the beginning
        for (int i = 0; i < length; i++) {
            System.out.print("\b");
        }
    }
}
