public class LandingRocket {

    public static void main(String[] args){
        new LandingRocket().run();
    }

    private LandingRocketModel model;

    private void drawRocket(){

    }
    public void run(){
        LandingRocketModel model = new LandingRocketModel();
        String background = new String(System.getProperty("user.dir") + "/LandingRocket/Background.png");
        String launchingPad = System.getProperty("user.dir") + "/LandingRocket/launchpad.png";
        StdDraw.enableDoubleBuffering();
        StdDraw.setCanvasSize(1600,800);
        while (true) {
            StdDraw.picture(0.5,0.5, background,1,1);
            StdDraw.picture(0.12, 0.12, launchingPad);
            StdDraw.picture(model.getRocket().getX(), model.getRocket().getY(), model.getRocket().getRocket());
            StdDraw.show();
        }
    }
}
