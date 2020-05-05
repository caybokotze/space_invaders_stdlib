package scope.function;

import stdlib.StdDraw;
import stdlib.StdIn;

import java.awt.*;

public class Invaders
{
    private int width;
    private int height;

    public Invaders(){
        width = 50;
        height = 50;
    }


    public void quitGame()
    {
        StdDraw.clear(StdDraw.BLACK);

        Font quitFont = new Font("Goudy Stout", Font.BOLD, 20);
        StdDraw.setFont(quitFont);
        StdDraw.setPenColor(StdDraw.GREEN);
        String quit = "YOU SUCK AT COOKING!";
        StdDraw.text( width/2 , 30 , quit);

        //after short delay game should automatically restart
    }

    public void score()
    {
        Font scoreFont = new Font("Arial", Font.PLAIN, 20);
        StdDraw.setFont(scoreFont);
        StdDraw.setPenColor(StdDraw.WHITE);
        String score = "Score:  0";
        StdDraw.text( 5 , 48 , score);
    }

}
