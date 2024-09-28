public class Person {

    // Attribute{
    private String name = "Peter";
    private int age = 15;

    // Referenzen

    // Konstruktor
     public Person() {
         halloSagen();
     }

    // Methoden
    public void halloSagen(){
            System.out.println("Hi, my name is " + name +  " and I am "  + age + " years old ");
    }

}
