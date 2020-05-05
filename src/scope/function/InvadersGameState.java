package scope.function;

import stdlib.In;
import stdlib.StdDraw;

public class InvadersGameState {

    public static void playGame() {
        StdDraw.clear(StdDraw.BLACK);

        Enemy enemy = new Enemy(1,1,1);
        Shooter shooter = new Shooter(1,1,1);
        shooter.drawShooter();

        Input input = new Input();
        input.run();
    }
}
