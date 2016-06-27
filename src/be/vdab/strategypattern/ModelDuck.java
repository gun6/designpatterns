
package be.vdab.strategypattern;


public class ModelDuck extends Duck{

    public ModelDuck() {
        vliegGedrag = new FlyNoWay();
        kwaakGedrag = new Quack();
    }
    
    
}
