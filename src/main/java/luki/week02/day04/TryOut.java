package luki.week02.day04;

import javax.sound.sampled.*;
import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class TryOut {
    public static void main(String[] args) throws UnsupportedLookAndFeelException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        System.out.println(UIManager.getCrossPlatformLookAndFeelClassName());

        for (UIManager.LookAndFeelInfo feel : UIManager.getInstalledLookAndFeels()) {
            UIManager.setLookAndFeel(feel.getClassName());

            JFrame frame = new JFrame(feel.getClassName());
            JPanel panel = new JPanel();
            panel.add(new JButton("HALLO"));
            panel.add(new JEditorPane());
            frame.setContentPane(panel);
            frame.setSize(400, 400);
            frame.setVisible(true);
        }


//        playAudio();

        String input2 = "5 + 5 + 5";
        char[] chars = input2.toCharArray();
        for (char c : chars) {
            if (c == 43) {
                System.out.println("This is a plus");
            }
        }
        int b = '5' * '3';
        char b1 = '5' * '3';
        System.out.println("B: " + b);
        System.out.println("B: " + b1);
    }
}
