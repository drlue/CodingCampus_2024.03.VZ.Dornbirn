package irem.Game;

import java.awt.image.BufferedImage;
import java.util.ArrayList;


public class Sprite {
    private ArrayList<BufferedImage> frames;
    private int currentFrame;
    private int frameDelay;
    private int counter;

    public Sprite(ArrayList<BufferedImage> frames, int frameDelay) {
        this.frames = frames;
        this.frameDelay = frameDelay;
        this.currentFrame = 0;
        this.counter = 0;
    }

    public void update() {
        counter++;
        if (counter >= frameDelay) {
            counter = 0;
            currentFrame = (currentFrame + 1) % frames.size();
        }
    }

    public BufferedImage getCurrentFrame() {
        return frames.get(currentFrame);
    }
}