public class Extent {
    private double x;
    private double y;
    private double radius;

    Extent(double x, double y, double radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public boolean overlaps(Extent a){
        double distance = Math.sqrt(Math.pow(x-a.getX(),2) + Math.pow(y-a.getY(),2));
        return distance < (radius + a.getRadius());
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }

//    public void move(double dx, double dy){
//        x += dx;
//        y += dy;
//    }
}
