
package be.vdab.singletonpattern;


public class NewMain {

    
    public static void main(String[] args) {
        ChocoladeBoiler B1 = ChocoladeBoiler.getInstance();
        B1.fill();
        B1.boil();
        B1.drain();
        B1.fill();
        B1.drain();
        B1.fill();
        B1.boil();
        B1.fill();
        B1.drain();
        ChocoladeBoiler B2 = ChocoladeBoiler.getInstance();
        B1.fill();
        B2.boil();
        B1.drain();
        B2.fill();
        B2.boil();
        B2.drain();
        B1.fill();
        B1.boil();
        B1.drain();
        B2.fill();
        B1.boil();
        B2.drain();
    }
    
}
