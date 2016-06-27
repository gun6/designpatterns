
package be.vdab.strategypattern;


public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly(){
        System.out.println("ik vlieg niet");
    }
}
