public class Sword{
    String name;
    int lowDamage;
    int highDamage;
    
    public Sword(String n, int l, int h){
        name = n;
        lowDamage = l;
        highDamage = h;
    }
  
    
    public String toString(){
     return "Sword type: " + name + "\n" + "Damage: " + lowDamage + "-" + highDamage;
    }
}
