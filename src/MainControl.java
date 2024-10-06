public class MainControl {

    //Attribute
    //Referenzen
    private Person person1;
    private Person person2, person3;

    public static void main (String[] args) {
        //halloWelt();
        new Person("David Gregory Glusmann", 16);
        new Person("Yener Varli", 16);
        new Person("Bilal El Hawari", 17);
    }
    public MainControl() {
        person1 = new Person("David Gregory Glusmann", 16);
        person2 = new Person("Yener Varli", 16);
        person3 = new Person("Bilal El Hawari", 17);
        //
        person1.halloSagen();
        System.out.println(person1);
        System.out.println(person2);
        person1.setName("Sebastian");
        System.out.println("Person 1 heißt " + person1.getName() );
    }
}
//--------------------------------------------
    public static void main (String[] args) {
        // halloWelt();
        new Person();
        new Person();
        new Person();
        new Person();
        Fahrzeug fahrzeug1 = new Fahrzeug("Mercedes", "S63", "schwarz", 2016);
        fahrzeug1.setFahrer(new Person("Yener Varli", 16));
        fahrzeug1.setBeifahrer(new Person("Bilal El Hawari", 17));
        Fahrzeug fahrzeug2 = new Fahrzeug("BMW", "M5", "schwarz", 1985);
        Fahrzeug fahrzeug3 = new Fahrzeug("Lamborghini", "Huracan", "rot", 2014);
    }
    }

