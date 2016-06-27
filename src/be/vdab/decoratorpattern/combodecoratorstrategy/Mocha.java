
package be.vdab.decoratorpattern.combodecoratorstrategy;

import be.vdab.decoratorpattern.combodecoratorstrategy.Grande;
import be.vdab.decoratorpattern.combodecoratorstrategy.CondimentDecorator;
import be.vdab.decoratorpattern.combodecoratorstrategy.Beverage;


public class Mocha extends CondimentDecorator {
    Beverage drank;
    
    public Mocha(Beverage drank){
        this.drank = drank;
    }
    @Override
    public Size getSize(){
        return drank.getSize();
    }
    @Override
    public String getDescription(){
        return drank.getDescription() + ",Mocha";
    }
    @Override
    public double cost(){
        double i = 0;
        if (getSize() instanceof Tall) i = 0.20;
        if (getSize() instanceof Grande) i = 0.25;
        if (getSize() instanceof Venti) i = 0.30;
        return drank.cost() + i;
    }
}
