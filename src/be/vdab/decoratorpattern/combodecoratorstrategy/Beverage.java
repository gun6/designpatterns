
package be.vdab.decoratorpattern.combodecoratorstrategy;


public abstract class Beverage {
    String description = "Unknown Beverage";
    String original = "Unknown Beverage";
    Size maat;
    
    public String getDescription(){
        return description;
    }
    public abstract double cost();
    
    public String getOriginal(){
        return original;
    }
    
    public void setSize (Size maat){
        this.maat = maat;
        description = getOriginal() + "," + maat.getOmschrijving();
    }
    public Size getSize(){
        return maat;
    }
}
