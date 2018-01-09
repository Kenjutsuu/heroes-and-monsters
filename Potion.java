public class Potion{
    int health;
    public Potion(){
        this.health = 100;
    }
    
    public int takePotion(){
        health =+ 100;
        return health;
    }
    
    public String toString(){
        return "Potion health increase: " + health;
    }
}