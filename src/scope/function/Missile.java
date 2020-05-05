package scope.function;

import stdlib.StdDraw;

public class Missile extends DefaultCritter{

    private final double rmissile;//radius of missile
    private final double vmissile;//velocity of missile
    //
    private double xCoords;
    private double yCoords;
    private double radius;

    public Missile(double xCoords, double yCoords, double radius){
        super(xCoords, yCoords, radius);

        this.xCoords = xCoords;
        this.yCoords = yCoords;
        this.radius = radius;

        rmissile = 1.5;
        vmissile = 2;
    }

    public void shootMissile()
    {
        Shooter shoot = new Shooter(1,1,1);
        double xmissile = shoot.tx;
        double ymissile = shoot.ty;
        double angle = shoot.theta;

        //continue until missile reaches end of screen
        while( ymissile < 50 && xmissile > 0 && xmissile < 50)
        {
            ymissile += vmissile*Math.cos(angle);
            xmissile += vmissile*Math.sin(angle);
            StdDraw.filledCircle(xmissile, ymissile, rmissile);
        }
        return;
    }
}