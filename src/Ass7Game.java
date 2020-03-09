import biuoop.GUI;
import game.GameFlow;
import game.AnimationRunner;

/**
 * apply a new arkanoid game.
 */
public class Ass7Game {
    public static final int WIDTH = 800, HEIGHT = 600;
    /**
     * starts a new game.
     * @param args the user input
     */
    public static void main(String[] args) {
        GUI g = new GUI("Arkanoid", WIDTH, HEIGHT);
        GameFlow gameFlow;
        // DEFAULT LEVEL SETS.
        if (args.length == 0) {
            gameFlow = new GameFlow(new AnimationRunner(g, 60), g.getKeyboardSensor(), g, "level_sets.txt");
        } else {
            gameFlow = new GameFlow(new AnimationRunner(g, 60), g.getKeyboardSensor(), g, args[0]);
        }
        gameFlow.runMenu();
    }
}
