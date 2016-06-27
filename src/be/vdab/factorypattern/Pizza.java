
package be.vdab.factorypattern;

import java.util.ArrayList;


public abstract class Pizza {
    
    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    //protected Veggies[] veggies;
    //protected Cheese cheese;
    //protected Clams clam;
    //protected Fish fish;
    
    public abstract void prepare();
        
    public void bake(){
        System.out.println("25 min op 350 graden");
    }
    public void cut(){
        System.out.println("in 6 parten");
    }
    public void box(){
        System.out.println("in officiele doos");
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    @Override
    public String toString(){
        return "under construction";
    }
}
