
package be.vdab.strategypattern;


public class Squeak implements QuackBehavior {
    @Override
    public void quack(){
        System.out.println("piep");
    }
}
