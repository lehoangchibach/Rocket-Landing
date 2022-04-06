public class LandingRocketModel {

    private Rocket rocket = new Rocket();
    private LandingPad landingPad;

    LandingRocketModel(){
        rocket = new Rocket();
        landingPad = new LandingPad(2,2);
    }

    public Rocket getRocket() {
        return rocket;
    }

    public LandingPad getLandingPad() {
        return landingPad;
    }
}
