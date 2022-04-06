public class Rocket {
    private double x;
    private double y;
    private double angle;
    private double velx;
    private double vely;
    private double fuel = 1;
    private Extent extent;
    private final String rocket = new String(System.getProperty("user.dir") + "/LandingRocket/rocket_red.png");


    Rocket(){
        this.x = 0.13;
        this.y = 0.11;
        this.angle = Math.PI/2;
    }

    public void travelling(){
        x += velx;
        y += vely;
    }

    public void accelerate(double a){
        velx += a*Math.cos(a);
        vely += a*Math.sin(a);
        fuel -= 0.02;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Extent getExtent(){
        return new Extent(x, y, 0.5);
    }

    public String getRocket() {
        return rocket;
    }
}
