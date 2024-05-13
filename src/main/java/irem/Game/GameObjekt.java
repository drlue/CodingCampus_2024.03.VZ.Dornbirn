package irem.Game;
import java.awt.Graphics;
import java.awt.Rectangle;

public abstract class GameObjekt {

    public GameObjekt(int x, int y) {
    }

    public GameObjekt() {

    }

    public abstract void tick();

    public abstract void render(Graphics g);

    public abstract Rectangle getBounds();

    public abstract class GameObject {
        protected int x, y;
        protected int velX, velY;

        public GameObject(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public abstract void tick();
        public abstract void render(Graphics g);
        public abstract Rectangle getBounds();

        public void setX(int x) { this.x = x; }
        public int getX() { return x; }

        public void setY(int y) { this.y = y; }
        public int getY() { return y; }

        public void setVelX(int velX) { this.velX = velX; }
        public int getVelX() { return velX; }

        public void setVelY(int velY) { this.velY = velY; }
        public int getVelY() { return velY; }
    }
}
