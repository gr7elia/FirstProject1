public class rästel {
    //Attribute
    private int w, x, z
            //Methoden
    private void rästel()({
        w = 2;
        x = 5;
        y = 0;
        z = 7;
        zahl1(7*2);
        zahl2(z);
        zahl4(x);
        zahl4(w+x+y+z);
        System.out.println("Die Zahlen sind "+w+", "+x+", "+y+", "+z+.")
    }
    private void zahl1(int a){
        w = x + z + y - a;
        w = w * w - w;
        }
        private void zahl2(int b) {
            z = b * z * w;
            y = z - b + w;
        }
        private void zahl4(int x){
        x = x+ w;
        y = x + w + y + z;

    }



