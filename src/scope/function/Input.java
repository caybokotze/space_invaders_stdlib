package scope.function;

import stdlib.StdDraw;
import stdlib.StdIn;

public class Input implements Runnable {

    Shooter shooter = new Shooter(1,1,1);
    Missile missile = new Missile(1,1,1);

    @Override
    public void run() {
        char move;
        for(move = StdIn.readChar(); move != 'q'; move = StdIn.readChar()) {
            if (move == 'a' || move == 'd') {
                StdDraw.clear(StdDraw.BLACK);
                shooter.rotateShooter(move);
            }

            if (move == 'z' || move == 'c') {
                StdDraw.clear(StdDraw.BLACK);
                shooter.moveShooter(move);
            }

            if (move == 'w') {
                missile.shootMissile();
            }
        }

        if (move == 'q') {
            Invaders quit = new Invaders();
            quit.quitGame();
        }
    }
}
