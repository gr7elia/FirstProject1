public class Person {

    // Attribute{
    private String name;
    private int age;

    // Referenzen

    // Konstruktor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        halloSagen();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    // Methoden
    public void halloSagen() {
        System.out.println("Hi, my name is " + name + " and I am " + age + " years old ");
    }
}
