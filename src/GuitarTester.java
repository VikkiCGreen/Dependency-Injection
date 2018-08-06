public class GuitarTester {

    private Guitar guitar;

    //NO dependency injection
    public GuitarTester() {
        Guitar guitar = new Guitar();
        guitar.setIsJoeys(false);
        this.guitar = guitar;
    }

    public boolean testIsJoeys() {
        return guitar.getIsJoeys();
    }

    //this would be a workaround when using no dependency injection. but why should we handle Guitar properties inside
    //GuitarTester? It already exists in Guitar, so why not leave Guitar to set its own properties? AKA creating object
    //outside of this class and passing it in with all of its properties defined. So this class does not have to worry about
    //all of that. "Google: Separation of Concerns". guitar class should handle setting its own properties. guitar tester's
    //purpose is to check if its joey's. It shouldn't have to worry about setting and doing guitar's logic.
    public void setGuitarIsJoeys(boolean bool) {
        guitar.setIsJoeys(bool);
    }
}
