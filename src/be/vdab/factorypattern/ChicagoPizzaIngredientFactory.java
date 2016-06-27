
package be.vdab.factorypattern;


public class ChicagoPizzaIngredientFactory implements PizzaIngredientenFactory {
    
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }
/*
    @Override
    public Cheese createCheese() {
        return new Mozzarella();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies[] veggies = {new Olives(),new Eggplant(),new Spinach()};
        return veggies;
    }

    @Override
    public Clams createClams() {
        return new FrozenClams();
    }

    @Override
    public Fish createFish() {
        return new Tuna();
    }
 */   
}
