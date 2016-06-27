
package be.vdab.decoratorpattern.combodecoratorstrategy;

import be.vdab.decoratorpattern.combodecoratorstrategy.Soy;
import be.vdab.decoratorpattern.combodecoratorstrategy.Mocha;
import be.vdab.decoratorpattern.combodecoratorstrategy.HouseBlend;
import be.vdab.decoratorpattern.combodecoratorstrategy.Grande;
import be.vdab.decoratorpattern.combodecoratorstrategy.Espresso;
import be.vdab.decoratorpattern.combodecoratorstrategy.DarkRoast;
import be.vdab.decoratorpattern.combodecoratorstrategy.Beverage;


public class StarbuzzCoffee {

    
    public static void main(String[] args) {
        Beverage drank = new Espresso();
        System.out.println(drank.getDescription() + ",$ " + drank.cost());
        System.out.println();
        
        Beverage drank2 = new Whip(new Mocha(new Mocha(new DarkRoast())));
        System.out.println(drank2.getDescription() + ",$ " + drank2.cost());
        System.out.println();
        
        Beverage drank3 = new HouseBlend();
        drank3 = new Soy(drank3);
        drank3 = new Mocha(drank3);
        drank3 = new Whip(drank3);
        System.out.println(drank3.getDescription() + ",$ " + drank3.cost());
        System.out.println();
        
        Beverage drank4 = new Espresso();
        drank4.setSize(new Grande());
        System.out.println(drank4.getDescription() + ",$ " + drank4.cost());
        drank4 = new Mocha(drank4);
        System.out.println(drank4.getDescription() + ",$ " + drank4.cost());
        System.out.println();
    }
    
}
