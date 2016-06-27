
package be.vdab.decoratorpattern.combodecoratorstrategy;

import be.vdab.decoratorpattern.combodecoratorstrategy.Grande;
import be.vdab.decoratorpattern.combodecoratorstrategy.Beverage;


public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House blend";
        original = "House blend";
        setSize(new Tall());
    }
    @Override
    public double cost() {
        double i = 0;
        if (maat instanceof Tall) i = 0.89;
        if (maat instanceof Grande) i = 0.99;
        if (maat instanceof Venti) i = 1.09;
        return i;
    }
}
