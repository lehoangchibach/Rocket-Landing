public class Rocket {
    private double x;
    private double y;
    private double angle;
    private double velx;
    private double vely;
    private double fuel = 10;
    private Extent extent;
    private final String rocket = new String("/home/bach/Documents/Code/Java/Rocket Landing/LandingRocket/rocket_red.png");

    public static void main(String[] args){
        StdDraw.enableDoubleBuffering();
        StdDraw.setCanvasSize(800,600);
        Rocket rocket = new Rocket();
        StdDraw.picture(rocket.getX(), rocket.getY(), rocket.getRocket());
    }
    Rocket(){
        this.x = 0;
        this.y = 0;
        this.angle = Math.PI/2;
    }

    public void travelling(){
        x += velx;
        y += vely;
    }

    public void accelerate(double a){
        velx += a*Math.cos(a);
        vely += a*Math.sin(a);
        fuel -= 0.2;
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
