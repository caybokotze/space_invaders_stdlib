package scope.function;
import stdlib.StdDraw;
import stdlib.StdIn;
import java.awt.*;

public class TitleScreen implements IDisplay {
    public static void Display(int width, int height)
    {
        StdDraw.setXscale(0, width);
        StdDraw.setYscale(0, height);

        StdDraw.clear(StdDraw.BLACK);

        //Main title
        Font font3 = new Font("Chiller", Font.BOLD, 60);
        StdDraw.setFont(font3);
        StdDraw.setPenColor(StdDraw.GRAY);
        String name2 = "CALL OF whatever";
        StdDraw.text( width/2 + 0.5 , (height - 11) , name2);

        Font font1 = new Font("Chiller", Font.BOLD, 60);
        StdDraw.setFont(font1);
        StdDraw.setPenColor(StdDraw.GREEN);
        String name = "CALL OF WHATEVER";
        StdDraw.text( width/2 , (height - 10) , name);

        //Instructions
        String start = "Press Space or DIE!";
        Font font2 = new Font("Arial", Font.BOLD, 20);
        StdDraw.setFont(font2);
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.text( width/2 , (height - 20) , start);

        String shoot = "Shoot (w)";
        String rotate = "Rotate: Left (a), Stop (s), Right (d)";
        String move = "Move: Left: (z), Stop (x), Right (c)";
        String quit = "Quit (q), Screencap (p)";
        Font font4 = new Font("Arial", Font.BOLD, 15);
        StdDraw.setFont(font4);
        StdDraw.setPenColor(StdDraw.WHITE);
        StdDraw.text( width/2 , 12.5, shoot);
        StdDraw.text( width/2 , 10, rotate);
        StdDraw.text( width/2 , 7.5, move);
        StdDraw.text( width/2 , 5, quit);

        System.out.println("Chocolate");
        char space = StdIn.readChar();
    }
}
