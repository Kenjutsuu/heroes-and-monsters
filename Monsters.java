public class Monsters{
    private static int xpos;
    private static int ypos;
    int health; 
    int defense;
    
    
    public Monsters(int h){
        this.health = h;
        
    }
    
    public int setX(int x){
        xpos = x;
        return xpos;
    }
    
    public int setY(int y){
        ypos = y;
        return ypos;
    }
    
    
    public String toString(){
        return "Monster health: " + health;
    }
}