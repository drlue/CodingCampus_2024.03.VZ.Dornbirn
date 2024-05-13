package irem.Game;
import javax.swing.JFrame;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.Color;


    public class Game extends Canvas implements Runnable {
        private boolean running = false;
        private Thread thread;

        public static void main(String[] args) {
            new Game();
        }

        public Game() {
            JFrame frame = new JFrame("Anime Game");
            this.setPreferredSize(new Dimension(800, 600));
            frame.add(this);
            frame.pack();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
            start();
        }

        public synchronized void start() {
            running = true;
            thread = new Thread(this);
            thread.start();
        }

        public synchronized void stop() {
            running = false;
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        @Override
        public void run() {
            long lastTime = System.nanoTime();
            double amountOfTicks = 60.0;
            double ns = 1000000000 / amountOfTicks;
            double delta = 0;
            while (running) {
                long now = System.nanoTime();
                delta += (now - lastTime) / ns;
                lastTime = now;
                while (delta >= 1) {
                    tick();
                    delta--;
                }
                render();
            }
            stop();
        }

        private void tick() {
            // Update game logic here
        }

        private void render() {
            BufferStrategy bs = this.getBufferStrategy();
            if (bs == null) {
                this.createBufferStrategy(3);
                return;
            }
            Graphics g = bs.getDrawGraphics();
            g.setColor(Color.black);
            g.fillRect(0, 0, getWidth(), getHeight());

            // Draw game objects here

            g.dispose();
            bs.show();
        }
    }

