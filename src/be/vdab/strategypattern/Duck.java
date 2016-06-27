
package be.vdab.strategypattern;


public abstract class Duck {
    protected FlyBehavior vliegGedrag;
    protected QuackBehavior kwaakGedrag;
    
    public Duck(){}
    
    public void performFly(){
        vliegGedrag.fly();
    }
    public void performQuack(){
        kwaakGedrag.quack();
    }
    public void swim(){
        System.out.println("ik zwem");
    }
    public void setFlyBehavior(FlyBehavior fb){
        vliegGedrag = fb;
    }
    public void setQuackBehavior(QuackBehavior fb){
        kwaakGedrag = fb;
    }
}
