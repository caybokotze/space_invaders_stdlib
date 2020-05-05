package scope.function;

import stdlib.StdDraw;

public class Shooter extends DefaultCritter {

    private final int width = 50;
    private final int height = 50;

    private final double turret_r = 1.5; //radius of turret circle
    private final double shooter_r = 2.5; //radius of shooter circle
    private final double vx = 2; //vx represents shooter velocity

    private double rx = 25, ry = 5; //rx and ry show shooter centre position
    public double tx = rx;  //tx and ty show turret centre position
    public double ty = ry + shooter_r;
    public double theta = 0;

    public Shooter(double xCoords, double yCoords, double radius) {
        super(xCoords, yCoords, radius);
    }

    //method which draws shooter at initial position
    public void drawShooter(){
        StdDraw.setPenColor(StdDraw.GRAY);

        StdDraw.filledCircle(tx, ty, turret_r);
        StdDraw.filledCircle(rx , ry, shooter_r);
        return;
    }

    public void moveShooter(char move)
    {
        //move left
        if (move == 'z')
        {
            //if shooter at end of screen stay at same position
            if( (rx - vx) - shooter_r < 0 ){
                //rx = rx;
            }
            else{
                rx = rx - vx;
                tx = tx - vx;
            }
        }
        //move right
        if (move == 'c')
        {
            //if shooter at end of screen stay at same position
            if( (rx + vx) + shooter_r > 50 ){
                //rx = rx;
            }
            else{
                rx = rx + vx;
                tx = tx + vx;
            }
        }
        StdDraw.filledCircle(rx, ry, shooter_r);
        StdDraw.filledCircle(tx, ty, turret_r);
    }

    public void rotateShooter(char move)
    {
        //rotate left
        if (move == 'a' )
        {
            //if turret horizontal stay at same position
            if (theta > (- Math.PI/2)){
                theta = theta - (Math.PI/6);
            }
            tx = rx + shooter_r * Math.sin(theta);
            ty = ry + shooter_r * Math.cos(theta);

            //StdDraw.clear(StdDraw.BLACK);
            StdDraw.filledCircle(rx, ry, shooter_r);
            StdDraw.filledCircle(tx, ty, turret_r);
        }
        //rotate right
        if (move == 'd')
        {
            if (theta < (Math.PI/2)){
                theta = theta + (Math.PI/6);
            }
            tx = rx + shooter_r * Math.sin(theta);
            ty = ry + shooter_r * Math.cos(theta);

            StdDraw.filledCircle(rx, ry, shooter_r);
            StdDraw.filledCircle(tx, ty, turret_r);
        }
    }

}