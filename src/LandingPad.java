public class LandingPad {
    private double x;
    private double y;
    private final String landingPad = new String(System.getProperty("user.dir") + "/LandingRocket/launchpad.png");


    public LandingPad(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public String getLandingPad() {
        return landingPad;
    }

    //    public boolean checkLanding(Rocket rocket){
//        //To do
//        return false;
//    }

//    public void floating(){
//    }
}
