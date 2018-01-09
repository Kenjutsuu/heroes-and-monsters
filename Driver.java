import java.util.*;
import java.io.*;
public class Driver{
    static int heroHealth;
    static int health;
    public static void main(String args[]){
        Hero Shiro = new Hero();
        
        Monsters Akuma = new Monsters(100);
        Monsters Oni = new Monsters(125);
        Monsters Satan = new Monsters(666);
        Monsters Lucifer = new Monsters(100);
        Monsters Loki = new Monsters(50);
        Monsters DaddyJeff = new Monsters(100);
        
        Object[][] map = new Object[10][10];
        
        map[Shiro.getX()][Shiro.getY()] = Shiro;
        map[Lucifer.setX(5)][Lucifer.setY(5)] = Oni;
        
        Scanner kbReader = new Scanner(System.in);
        
        System.out.println("Welcome, Hero.");

        
        while(true){
            System.out.println("Choose where you want to move (a,s,d,w)");
            String choice = kbReader.next();
        
            if(choice.equals("w")){
                Hero.moveNorth();
                System.out.println(Hero.printLoc());
            }else if(choice.equals("s")){
                Hero.moveSouth();
                System.out.println(Hero.printLoc());
            }else if(choice.equals("d")){
                Hero.moveEast();
                System.out.println(Hero.printLoc());
            }else if(choice.equals("a")){ 
                Hero.moveWest();
                System.out.println(Hero.printLoc());
            }else if(choice.equals("break")){
                break;
            }else if(choice.equals("seppuku")){
                System.out.println(" You have committed seppuku and brought honor back into the family");
                break;
            }else{
                System.out.println("Please enter in [north, south, east, or west]");
            }
            
            
            if(Hero.getX() == 1 && Hero.getY() == 1){
                System.out.println("You have encountered Lucifer");
                Hero.engage();
            }
            
            
            
        }
        
        
    }
}