public class Main {

    public static void main(String[] args) {


        Drum joeyDrum = new Drum();
        joeyDrum.setIsJoeys(true);

        Drum vikkiDrum = new Drum();
        vikkiDrum.setIsJoeys(false);

        //with DI
        DrumTester tester = new DrumTester(joeyDrum);
        System.out.println("instrument is joeys?: " + tester.testIsJoeys());

        tester = new DrumTester(vikkiDrum);
        System.out.println("instrument is joeys?: " + tester.testIsJoeys());

        //no DI
        //If we wanted to check a guitar that belongs to joey, we'd have to make another GuitarTester2 class that makes
        //a guitar object that belongs to joey. (since GuitarTester has hardcoded false belonging)
        GuitarTester testerNoDI = new GuitarTester();
        System.out.println("instrument is joeys? (will always be false): " + testerNoDI.testIsJoeys());


    }

}
//
//If spellchecker has a bunch of properties, then when you define it in the texteditor constructor, every text editor object that you make is limited to those exact spellchecker properties.
//if you wanted to use a different spellchecker with different properties, youd have to make another texteditor class, which constructs a spellchecker with those different properties.
//
//when using dependency injection, youd create the spellchecker outside of the texteditor constructor and just pass the spellchecker object in, that way
//when you need different spellcheckers, you just have to pass in different spellchecker objects to the texteditor class instead of having to make a bunch of
//texteditor classes.