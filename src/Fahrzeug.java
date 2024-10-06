public class Fahrzeug {

     //Attribute(Eigenschaften)
    private String marke;
    private String modell;
    private String farbe;
    private int baujahr;
    private Person Fahrer;
    private Person beiFahrer;

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
        public int getBaujahr() {
            return baujahr;
        }
        public String getFarbe() {
            return farbe;
        }
        public String getMarke() {
            return marke;
        }
        public String getModell() {
            return modell;
        }
        ///////////////////////////////////
       public Person getFahrer() {
          return fahrer;
       }
       public Person getBeiFahrer() {
          return fahrer;
       }
       /////////////
       public void setBaujahr(int baujahr) {
            this.baujahr = baujahr;
        }
        public void setFarbe(String farbe) {
        this.farbe = farbe;
        }
        public void setMarke(String marke) {
            this.marke = marke;
        }
        public void setModell(String modell) {
            this.modell = modell;
        }
        public void setFahrer(Person fahrer) {
          this.Fahrer = fahrer;
        }
        public void setBeifahrer(Person beifahrer) {
          this.beiFahrer = beifahrer;
        }

        public void nenneBesatzung() {
            System.out.println("Im Auto sitzt " + fahrer.getName() + " als Fahrer und " + beifahrer.getName() + " als Beifahrer.");
        }
        }
        //Referenzen
        Person beifahrer = new Person("Bilal El Hawari", 17);
        Person fahrer = new Person("Yener Varli", 16);
}