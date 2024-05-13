package irem.Game;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class SimpleGame extends JPanel implements KeyListener {

    private int x = 50;
    private int y = 50;
    private int speed = 5;

    public SimpleGame() {
        Thread gameThread = new Thread(() -> {
            while (true) {
                gameLoop();
                repaint();
                try {
                    Thread.sleep(30);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        gameThread.start();
        // KeyListener hinzufügen
        setFocusable(true);
        addKeyListener(this);
    }

    private void gameLoop() {
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        g.fillRect(x, y, 50, 50); // Zeichnet ein blaues Quadrat
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_LEFT:
                x -= speed;
                break;
            case KeyEvent.VK_RIGHT:
                x += speed;
                break;
            case KeyEvent.VK_UP:
                y -= speed;
                break;
            case KeyEvent.VK_DOWN:
                y += speed;
                break;
        }

        if (x < 0) x = 0;
        if (x > getWidth() - 50) x = getWidth() - 50;
        if (y < 0) y = 0;
        if (y > getHeight() - 50) y = getHeight() - 50;
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Spiel mit Steuerung");
        SimpleGame gamePanel = new SimpleGame();
        frame.add(gamePanel);
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}