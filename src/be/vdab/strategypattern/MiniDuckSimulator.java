
package be.vdab.strategypattern;


public class MiniDuckSimulator {

    
    public static void main(String[] args) {
        MallardDuck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();
        mallard.swim();
        mallard.display();
        System.out.println();
        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
        System.out.println();
        LokFluit fluitje = new LokFluit();
        fluitje.performQuack();
    }
    
}
