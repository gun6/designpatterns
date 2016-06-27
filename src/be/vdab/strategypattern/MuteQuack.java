
package be.vdab.strategypattern;


public class MuteQuack implements QuackBehavior {
    @Override
    public void quack(){
        System.out.println("<<<stilte>>>");
    }
}
