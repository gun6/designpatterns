
package be.vdab.decoratorpattern.combodecoratorstrategy;

import be.vdab.decoratorpattern.combodecoratorstrategy.Size;
import be.vdab.decoratorpattern.combodecoratorstrategy.Grande;
import be.vdab.decoratorpattern.combodecoratorstrategy.CondimentDecorator;
import be.vdab.decoratorpattern.combodecoratorstrategy.Beverage;


public class Soy extends CondimentDecorator {
   Beverage drank;
    
    public Soy(Beverage drank){
        this.drank = drank;
    }
    @Override
    public Size getSize(){
        return drank.getSize();
    }
    @Override
    public String getDescription(){
        return drank.getDescription() + ",Soy";
    }
    @Override
    public double cost(){
        double i = 0;
        if (getSize() instanceof Tall) i = 0.15;
        if (getSize() instanceof Grande) i = 0.20;
        if (getSize() instanceof Venti) i = 0.25;
        return drank.cost() + i;
    } 
}
