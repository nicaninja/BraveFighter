import static engine.SEEngine.*;
import static org.lwjgl.glfw.GLFW.*;

import engine.*;

public class BraveFighter extends SEProgram {
    public static void main(String[] args) {
        BraveFighter game = new BraveFighter();
        SEstart(game);
        System.out.println(
                "aplication executing"
        );
    }

    int health;
    int magic;
    int power;
    SEObj player;

    @Override
    public void setup() {
        player = new SEObj(0, 100, 20, 20, new SETex(0, 4, 0));
    }

    @Override
    public void update() {
        if (SEisKeyPressed(GLFW_KEY_W)) {
            player.move(0,-2);
        }
        if (SEisKeyPressed(GLFW_KEY_A)) {
            player.move(-2, 0);
        }
        if (SEisKeyPressed(GLFW_KEY_S)) {
            player.move( 0, 2);
        }
        if (SEisKeyPressed(GLFW_KEY_D)) {
            player.move(2, 0);
        }
        if (SEisKeyPressed(GLFW_KEY_W) && SEisKeyPressed(GLFW_KEY_E)) {
            player.move( 0, -125);
        }
        if (SEisKeyPressed(GLFW_KEY_A) && SEisKeyPressed(GLFW_KEY_E)) {
            player.move(-125, 0);
        }
        if (SEisKeyPressed(GLFW_KEY_S) && SEisKeyPressed(GLFW_KEY_E)) {
            player.move( 0, 125);
        }
        if (SEisKeyPressed(GLFW_KEY_D) && SEisKeyPressed(GLFW_KEY_E)) {
            player.move(125, 0);
        }
    }
}