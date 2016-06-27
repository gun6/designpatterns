
package be.vdab.factorypattern;


public class ChicagoPizzaStore extends PizzaStore{
    
    @Override
    public Pizza createPizza(String type){
        Pizza pizza = null;
        PizzaIngredientenFactory ingredientenFactory = new ChicagoPizzaIngredientFactory();
        
        if(type.equals("cheese")){
            pizza = new CheesePizza(ingredientenFactory);
            pizza.setName("Chicago Style Cheese Pizza");
        }
        else if(type.equals("clam")){
            pizza = new ClamPizza(ingredientenFactory);
            pizza.setName("Chicago Style Clam Pizza");
        }
        return pizza;
    }
}
