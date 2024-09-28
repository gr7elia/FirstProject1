public class raetsel {
    //Attribute
    private int zahl1, zahl2, zahl3 ;

    //Methoden
    private void löseRätsel(){
        zahl1 = 5;
        zahl2 = 7;
        zahl3 = 20;
        addiereAufZahl1und2(10+10);
        addiereAufZahl1und2(7*7);
        addiereAufZahl2und3(7*7);
        addiereAufZahl3(zahl1+zahl2);
        System.out.println("Die Zahlen sind "+zahl1+", "+zahl2+", "+zahl3+".")

    }
    private void addiereAufZahl2und3(int faktor){
        zahl2 = zahl2 + faktor;
        zahl3 = zahl3 + faktor;
    }
    private void addiereAufZahl3(int zahl1, zahl2);
    this.zahl3 = zahl1 + zahl2;
}
