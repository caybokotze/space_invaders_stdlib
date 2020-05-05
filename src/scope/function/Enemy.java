package scope.function;
import stdlib.StdDraw;

public class Enemy extends DefaultCritter {

    public Enemy(double xCoords, double yCoords, double radius) {
        super(xCoords, yCoords, radius);
    }

    public void run(){
        drawEnemy();
        enemies();
    }

    //draw 10 enemy targets
    static int enemy_size = 10;
    static double[] x_enemy = new double [enemy_size]; //x coordinates of enemy
    static double[] y_enemy = new double [enemy_size]; //y coordinates of enemy
    static double r_enemy = 1.5; //radius of enemy circles
    static double vx = r_enemy*2 , vy = r_enemy*2;

    @Override
    public void drawCritter() {
        drawEnemy();
    }

    //draws enemy at starting position
    public void drawEnemy()
    {
        StdDraw.setPenColor(StdDraw.RED);

        //initialise centre coordinates to 0
        for (int i = 0; i < enemy_size; i++){
            x_enemy[i] = 0;
            y_enemy[i] = 0;
        }
        //set x-coordinates for all enemy circles
        x_enemy[0] = 2;
        for(int j = 1; j < 5; j++)
        {
            x_enemy[j] = x_enemy[j-1] + r_enemy*2;
        }
        x_enemy[5] = 2;
        for(int j = 6; j < 10; j++)
        {
            x_enemy[j] = x_enemy[j-1] + r_enemy*2;
        }
        //set y-coordinates for all enemy circles
        for(int i = 0; i < 5; i++)
        {
            y_enemy[i] = 45;
        }
        for(int i = 5; i < 10; i++)
        {
            y_enemy[i] = 42;
        }
        //Draw enemy circles
        for(int i = 0; i < enemy_size; i++)
        {
            StdDraw.filledCircle( x_enemy[i], y_enemy[i], r_enemy );
        }
        return;
    }

    //object enemies
    public void enemies()
    {
        //update enemy position and draw until reaches bottom of screen
        while (y_enemy[9] > (r_enemy*5))
        {
            //move enemy right until reaches end of screen
            while ( x_enemy[4] < (50 - r_enemy*3))
            {
                for (int i= 0; i < 10; i++)
                {
                    x_enemy[i] = x_enemy[i] + vx;
                    StdDraw.filledCircle(  x_enemy[i], y_enemy[i], r_enemy );
                }

                try{
                    Thread.sleep(500);
                }
                catch(InterruptedException e)
                {
                    System.out.println("I am GROOT");
                }
                //StdDraw.clear(StdDraw.BLACK);

            }
            //move enemy down
            for (int i = 0; i < 10; i++)
            {
                y_enemy[i] = y_enemy[i] - vy;
                StdDraw.filledCircle(  x_enemy[i], y_enemy[i], r_enemy );
            }

            try{
                Thread.sleep(500);
            }
            catch(InterruptedException e)
            {
                System.out.println("I am GROOT");
            }
            StdDraw.clear(StdDraw.BLACK);

            //move enemy left until reaches end of screen
            while ( x_enemy[0] > (r_enemy*3))
            {
                for (int i= 0; i < 10; i++)
                {
                    x_enemy[i] = x_enemy[i] - vx;
                    StdDraw.filledCircle(  x_enemy[i], y_enemy[i], r_enemy );
                }
                try{
                    Thread.sleep(500);
                }
                catch(InterruptedException e)
                {
                    System.out.println("I am GROOT");
                }
                StdDraw.clear(StdDraw.BLACK);
            }
            for (int i = 0; i < 10; i++)
            {
                y_enemy[i] = y_enemy[i] - vy;
                StdDraw.filledCircle(  x_enemy[i], y_enemy[i], r_enemy );
            }
            try{
                Thread.sleep(500);
            }
            catch(InterruptedException e)
            {
                System.out.println("I am GROOT");
            }
            StdDraw.clear(StdDraw.BLACK);
        }

        return;
    }

}