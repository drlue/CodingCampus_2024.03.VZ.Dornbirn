//package irem.Game;
//
//import java.awt.*;
//import java.util.ArrayList;
//
//
//public class Level {
//
//    private final ArrayList<GameObjekt.GameObject> gameObjects;
//
//    public Level() {
//        gameObjects = new ArrayList<>();
//        gameObjects.add(new ArrayList<>(100, 100));
//        gameObjects.add(new ArrayList<>()400, 100);
//
//    }
//
//    public void tick() {
//        for (GameObjekt.GameObject obj : gameObjects) {
//            obj.tick();
//        }
//    }
//
//    public void render(Graphics g) {
//        for (GameObjekt.GameObject obj : gameObjects) {
//            obj.render(g);
//        }
//    }
//
//    public ArrayList<GameObjekt.GameObject> getGameObjects() {
//        return gameObjects;
//    }
//}
//
