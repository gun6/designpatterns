
package be.vdab.decoratorpattern.combodecoratorstrategy;

import be.vdab.decoratorpattern.combodecoratorstrategy.Beverage;


public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
    public abstract Size getSize();
}
