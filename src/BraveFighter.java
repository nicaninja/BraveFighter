import static engine.SEEngine.*;
import static engine.SEObjects.*;
import static engine.SETextures.*;
import static org.lwjgl.glfw.GLFW.*;

import engine.*;

public class BraveFighter extends SEProgram {
    public static void main(String[] args) {
        BraveFighter game = new BraveFighter();
        SEstart(game);
    }

    int health;
    int magic;
    int power;
    SEObj player;

    @Override
    public void setup() {
        player = SEcreateObject(0, 100, 40, 40, SEloadColor(4, 4, 2));
    }

    @Override
    public void update() {
        if (SEgetKeyPosition(GLFW_KEY_W)) {
            SEobjMove(player, 0, -2);
        }
        if (SEgetKeyPosition(GLFW_KEY_A)) {
            SEobjMove(player, -2, 0);
        }
        if (SEgetKeyPosition(GLFW_KEY_S)) {
            SEobjMove(player, 0, 2);
        }
        if (SEgetKeyPosition(GLFW_KEY_D)) {
            SEobjMove(player, 2, 0);
        }
    }
}