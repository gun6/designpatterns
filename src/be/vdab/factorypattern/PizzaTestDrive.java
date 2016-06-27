
package be.vdab.factorypattern;


public class PizzaTestDrive {

    
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();
        
        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan bestelde een "+pizza.getName()+"\n");
        
        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel bestelde een "+pizza.getName()+"\n");
        
       
    }
    
}
