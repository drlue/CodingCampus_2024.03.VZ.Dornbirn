package irem.Game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Player extends GameObjekt implements Player1 {
    public Player(int x, int y) {
        super();
    }
    @Override
    public void tick() {
        Object velX = null;
        Object x = velX;
        Object velY = null;
        Object y = velY;

    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.green);
        int x = 0;
        int y = 0;
        g.fillRect(x, y, 32, 32);
    }

    @Override
    public Rectangle getBounds() {
        int x = 0;
        int y = 0;
        return new Rectangle(x, y, 32, 32);
    }
}
