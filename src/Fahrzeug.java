public class Fahrzeug {

     //Attribute(Eigenschaften)
    private String marke;
    private String modell;
    private String farbe;
    private int baujahr;

     //Konstruktor(Hersteller)
      public Fahrzeug(String marke, String modell, String farbe, int baujahr) {
          this.marke = marke;
       this.modell = modell;
      this.farbe = farbe;
      this.baujahr = baujahr;
      }


    //Methoden
    public void datenAnzeigen() {
        System.out.println("Fahrzeug:");
        System.out.prinln("Marke:" + marke);
        System.out.println("Modell:" + modell);
        System.out.println("Farbe:" + farbe);
        System.out.println("Baujahr:" + baujahr);
    }
