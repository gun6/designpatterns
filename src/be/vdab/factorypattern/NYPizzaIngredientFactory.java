
package be.vdab.factorypattern;


public class NYPizzaIngredientFactory implements PizzaIngredientenFactory {

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }
/*
    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies[] veggies = {new Garlic(),new Onion(),new Mushroom(),new RedPepper()};
        return veggies;
    }

    @Override
    public Clams createClams() {
        return new FreshClams();
    }

    @Override
    public Fish createFish() {
        return new Salmon();
    }
 */   
}
