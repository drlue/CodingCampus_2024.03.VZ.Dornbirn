package irem.Game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;


public final class Enemy extends GameObjekt {
    public Enemy(int x, int y) {
        super(x, y);
        int velX = 2; // Geschwindigkeit setzen
    }

    @Override
    public void tick() {
        int velX = 0;
        int x = velX;
        velX *= -1; // Richtungswechsel bei Bildschirmrand
    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.red);
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
