public class DrumTester {

    private Drum drum;

    //with dependency injection
    public DrumTester(Drum drum) {
        this.drum = drum;
    }

    public boolean testIsJoeys() {
        return drum.getIsJoeys();
    }
}
