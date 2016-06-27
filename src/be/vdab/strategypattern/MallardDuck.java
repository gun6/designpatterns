
package be.vdab.strategypattern;


public class MallardDuck extends Duck {

    public MallardDuck() {
        kwaakGedrag = new Quack();
        vliegGedrag = new FlyWithWings();
    }
    public void display(){
        System.out.println("wilde eend");
    }
    
    
}
