
package be.vdab.decoratorpattern.combodecoratorstrategy;

import be.vdab.decoratorpattern.combodecoratorstrategy.Beverage;


public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
        original = "Espresso";
        setSize(new Tall());
    }
    @Override
    public double cost() {
        double i = 0;
        if (maat instanceof Tall) i = 1.99;
        if (maat instanceof Grande) i = 2.09;
        if (maat instanceof Venti) i = 2.19;
        return i;
    }
    
}
