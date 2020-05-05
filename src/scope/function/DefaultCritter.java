package scope.function;

public abstract class DefaultCritter implements ICritter {

    private double xCoords;
    private double yCoords;
    private double radius;

    public DefaultCritter(double xCoords, double yCoords, double radius) {
        this.xCoords = xCoords;
        this.yCoords = yCoords;
        this.radius = radius;
    }

    @Override
    public void drawCritter() {

    }

    @Override
    public void moveCritter() {

    }

    public double getXCoords() {
        return xCoords;
    }

    public void setXCoords(double xCoords) {
        this.xCoords = xCoords;
    }

    public double getYCoords() {
        return yCoords;
    }

    public void setYCoords(double yCoords) {
        this.yCoords = yCoords;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


}
