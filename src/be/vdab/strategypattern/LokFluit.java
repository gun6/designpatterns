
package be.vdab.strategypattern;


public class LokFluit {
    private QuackBehavior geluid;

    public LokFluit() {
        geluid = new Quack();
    }
    public void performQuack(){
        geluid.quack();
    }
    
    
}
