
package be.vdab.singletonpattern;


public class ChocoladeBoiler {
    private boolean empty;
    private boolean boiled;
    private int cycli = 0;
    private static ChocoladeBoiler INSTANCE = new ChocoladeBoiler();
    
    private ChocoladeBoiler(){
        empty = true;
        boiled = false;
        System.out.println("leeg: " + empty+ " /warm: " + boiled + " /cyclus: " + cycli);
    }
    public static ChocoladeBoiler getInstance(){
        return INSTANCE;
    }
    public void fill(){
        if(isEmpty()){
            empty = false;
            boiled = false;
            cycli++;
            System.out.println("leeg: " + empty+ " /warm: " + boiled + " /cyclus: " + cycli);
        }
    }
    public void drain(){
        if(!isEmpty() && isBoiled()){
            empty = true;
            System.out.println("leeg: " + empty+ " /warm: " + boiled + " /cyclus: " + cycli);
        }
    }
    public void boil(){
        if(!isEmpty() && !isBoiled()){
            boiled = true;
            System.out.println("leeg: " + empty+ " /warm: " + boiled + " /cyclus: " + cycli);
        }
    }
    public boolean isEmpty(){
        return empty;
    }
    public boolean isBoiled(){
        return boiled;
    }
     
}
