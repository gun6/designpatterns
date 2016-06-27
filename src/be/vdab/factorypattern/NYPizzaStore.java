
package be.vdab.factorypattern;


public class NYPizzaStore extends PizzaStore{
    
    @Override
    public Pizza createPizza(String type){
        Pizza pizza = null;
        PizzaIngredientenFactory ingredientenFactory = new NYPizzaIngredientFactory();
        
        if(type.equals("cheese")){
            pizza = new CheesePizza(ingredientenFactory);
            pizza.setName("New York Style Cheese Pizza");
        }
        else if(type.equals("clam")){
            pizza = new ClamPizza(ingredientenFactory);
            pizza.setName("New York Style Clam Pizza");
        }
        return pizza;
    }
}
