
package be.vdab.strategypattern;


public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly(){
        System.out.println("ik vlieg");
    }
}
