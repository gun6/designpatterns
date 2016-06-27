
package be.vdab.decoratorpattern.combodecoratorstrategy;

import be.vdab.decoratorpattern.combodecoratorstrategy.Beverage;


public class DarkRoast extends Beverage {
   
    public DarkRoast() {
        description = "Dark roast";
        original = "Dark roast";
        setSize(new Tall());
    }
    @Override
    public double cost() {
        double i = 0;
        if (maat instanceof Tall) i = 0.99;
        if (maat instanceof Grande) i = 1.09;
        if (maat instanceof Venti) i = 1.19;
        return i;
    } 
}
