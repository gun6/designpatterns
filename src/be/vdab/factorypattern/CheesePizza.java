
package be.vdab.factorypattern;


public class CheesePizza extends Pizza{
    
    PizzaIngredientenFactory ingredientFactory;
    
    public CheesePizza(PizzaIngredientenFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
    }
    public void prepare(){
        System.out.println("Voorbereiden van "+name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        //cheese = ingredientFactory.createCheese();
        System.out.println(sauce.getNaam());
    }
}
