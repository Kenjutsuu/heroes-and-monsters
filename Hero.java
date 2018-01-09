import java.io.*;
import java.util.*;
import java.util.Random;

public class Hero{
    static Scanner kbReader = new Scanner(System.in);
    private static Monsters Akuma;
    private static Monsters Oni;
    private static int health;
    private static int xpos;
    private static int ypos;
    private static Armor armor;
    private static int heroHealth;
    private static Sword dagger;
    private static Sword katana;
    private static Sword Odachi;
    private static Sword Tanto;
    private static Potion potion;
    public Hero (){
        xpos = 0;
        ypos = 9;
        heroHealth = 100;
        dagger = new Sword("dagger", 10,30);
        
    }
    public static int getX(){
        return xpos;
        
    }
    public static int getY(){
        return ypos;
    }
    
    public static int isHealed(){
        potion = new Potion();
        health = health + 100;
        return health;
    }
    public static String moveNorth(){
        ypos++;
        if(ypos > 10){
            ypos--;
            return "You cannot move any further";
        }
        return "Location: " + xpos + "," + ypos;    
    }
    
    public static String moveSouth(){
        ypos--;
        if(ypos < 0){
            ypos++;
            return "You cannot move any further";
        }
        return "Location: " + xpos + "," + ypos; 
    }
    
    public static String moveEast(){
        xpos++;
        if(xpos > 10){
            xpos--;
            return "You cannot move any further";
        }
        return "Location: " + xpos + "," + ypos; 
    }
    
    public static String moveWest(){
        xpos--;
        if(xpos < 0){
            xpos++;
            return "You cannot move any further";
        }
        return "Location: " + xpos + "," + ypos; 
    }
    
    public static String printLoc(){
        return "Location: " + xpos + "," + ypos; 
    }
    
    public static boolean engage(){
        
        while(heroHealth >= 0 || health >=0){
            System.out.println("1.Attack 2.Block 3.Escape 4.Heal");
            String choice = kbReader.next();
            
            if(choice.equals("1")){
                
                System.out.println("You have attacked the Lucifer.");
                
                health = 100;
                health -= 20;
                
                System.out.println(health);
                
                while(health >= 0){
                    System.out.println("1.Attack 2.Block 3.Escape 4.Heal");
                    choice = kbReader.next();
                    health -= 20;
                    System.out.println(health);
                    
                    System.out.println("Hero health: " + heroHealth);
                    if(heroHealth <= 0){
                        System.out.println("You died...");
                        break;
                    }
                    if(choice.equals("4")){
                        heroHealth += 50;
                    }
                }
                if(health <= 0){
                    System.out.println("You have killed Lucifer");
                    break;
                }
               
            }else if(choice.equals("2")){
                System.out.println("You have used block");
            }else if(choice.equals("3")){
                System.out.println("You have chosen to run away");
                
            }else if(choice.equals("4")){
                System.out.println("You have chosen to take a health potion");
                health = 100;
            }else if(choice.equals("break")){
                return true;
            }else{
                System.out.println("please enter in 1 2 3 or 4");
            }
            return false;
          
        }
        return true;
    }    
    
    public String toString(){
        return "Hero name: Null" + "\n" + "Health: " + health;
    }
}