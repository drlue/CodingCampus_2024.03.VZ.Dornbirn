package irem.Game;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class KeyInput extends KeyAdapter {

    private GameObjekt.GameObject player;

    public KeyInput(GameObjekt.GameObject player) {
        this.player = player;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_LEFT || key == KeyEvent.VK_A) {
            player.setVelX(-5);
        }
        if (key == KeyEvent.VK_RIGHT || key == KeyEvent.VK_D) {
            player.setVelX(5);
        }
        if (key == KeyEvent.VK_UP || key == KeyEvent.VK_W) {
            player.setVelY(-5);
        }
        if (key == KeyEvent.VK_DOWN || key == KeyEvent.VK_S) {
            player.setVelY(5);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_LEFT || key == KeyEvent.VK_A || key == KeyEvent.VK_RIGHT || key == KeyEvent.VK_D) {
            player.setVelX(0);
        }
        if (key == KeyEvent.VK_UP || key == KeyEvent.VK_W || key == KeyEvent.VK_DOWN || key == KeyEvent.VK_S) {
            player.setVelY(0);
        }
    }
}
