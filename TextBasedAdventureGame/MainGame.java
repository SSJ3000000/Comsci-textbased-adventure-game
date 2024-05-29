
/**
 * Text Based Adventure Game *
 * (Book)
 *(23/05/24)
 */
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList; 
public class MainGame
{
    //  Variables
    public int Skeletons; // used for skeletons switch statement
    public int Potions; // used for potions switch statement
    public ArrayList<String> inventory = new ArrayList<String>(); // ArrayList for inventory
    
    
    

        /**
     * Constructor for objects of class MainGame
     */
    
    public MainGame()
    {
        Scanner keyboard=new Scanner(System.in);

            
        System.out.println("Room 1: Where am I?");
        System.out.println("");
        System.out.println("");
        
       System.out.println("You wake up on a twin size bed with red silky bed sheets, you're tied to the bed with pink fuzzy handcuffs.");
       System.out.println("Luckily there are keys that unlocks the hand cuffs on the pillow next to you that you use to unlock cuffs.");
       System.out.println("");
       System.out.println("You stand and up and notice that you have nothing on you except a basic tee and trousers");
       System.out.println("You notice chains and what seem to be like bondage hanging from the ceiling.");
       System.out.println("You go up to the only door, when touch the handle you sense that theres probably something you don't wanna see behind it.");
       System.out.println("");
       System.out.println("Enter ENTER to continue.");
       if (keyboard.nextLine().equals(""))   
    
    Room2();
        
        
        }
        
        public void Room2() 
        {
        Scanner keyboard=new Scanner(System.in);
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("Room 2: First Encounter");
        System.out.println("");
        System.out.println("You open and door and immediately a volley of arrows race past your head.");
        System.out.println("Three skeletons look at with bloodlust");
        System.out.println("");
        System.out.println("What do you do?");
        System.out.println("");
        System.out.println("1. You charge at the closest skeletons and try to steal its bow.");
        System.out.println("2. You back to the other room and close the door");
        System.out.println("3. You around the room in circles");
        
        String userInput = keyboard.nextLine();

if (userInput.equals("inventory")) {
    Skeletons = 4; // Assigning 4 to Potions if user input is "inventory"
} else {
    Skeletons = Integer.parseInt(userInput); // Parsing the user input to an integer
}

        switch(Skeletons) {
            case 1: System.out.println("You were successfully able to steal one of skeletons bow, but you didn't grab any arrows so the other 2 skeletons shoot you and you die");
                break;
                
            case 2: System.out.println("You go back to the previous room but the skeletons arrow pierce through the door and you die");
                break;
                
            case 3: System.out.println("You run around the room until the skeletons ran out of arrows, so you charged at them and killed them all with your fists.");
                    Room3();
                break;
            case 4: checkInventory();
            Room2();
                break;
                
            default: System.out.println("ERROR: Please input a valid option.");
            Room2();
        }
    }
    
    public void Room3() {
        Scanner keyboard=new Scanner(System.in);
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("Room 3: Potion Shop");
        System.out.println("");
        System.out.println("After narrowly killing all 3 skeletons and avoiding death.");
        System.out.println("You go up one of their dead remains and noitce some gold was on the ground next to it.");
        System.out.println("You pick up 10 gold pieces and the skeletons bow and arrow");
            String g10="10 Gold Pieces"; // adding the 10 gold pieces to inventory
            inventory.add(g10);
            String bownarrow="Bow and Arrow"; // adding the bow and arrow to inventory
            inventory.add(bownarrow);
        System.out.println("");
        System.out.println("");
        System.out.println("After looting the skeletons corpses, you see another door to your left");
        System.out.println("Before opening the door you carefully peak through the door");
        System.out.println("You see room completely decorated with books, potions, other magical items. You also see a stall that seems to sell potions with a shopkeeper at the front");
        System.out.println("Curious, you go up to him and see what he sells");
        System.out.println("");
        System.out.println("");
        System.out.println("Shopkeeper: HELLO HOW MAY I HELP YOU TODAY?");
        System.out.println("Hi, I have 10 gold pieces what can I buy that?");
        System.out.println("Shopkeeper: UNFORTUNATLY THAT WON'T GET YOU A LOT BUT THAT GET YOU MOST OF OUR POTIONS");
        System.out.println("What are they?");
        String[] potionList = new String[] {"1. Regeneration","2. Strength","3. Speed"};
        System.out.println("Shopkeeper: THAT COULD GET YOU:");
        System.out.println(Arrays.toString(potionList));
        System.out.println("");
        System.out.println("Which one would you like to buy?");
        
    String userInput = keyboard.nextLine();

if (userInput.equals("inventory")) {
    Potions = 4; // Assigning 4 to Potions if user input is "inventory"
} else {
    Potions = Integer.parseInt(userInput); // Parsing the user input to an integer
}
        
     switch(Potions) {
        case 1: 
            System.out.println("Shopkeeper: GOOD CHOICE, HERE YOU GO.");
            System.out.println("He hands you a potion of regeneration and you give him your 10 gold pieces. ");
            inventory.remove(g10); // removing the 10 gold you just spent.
            String p1="Regeneration Potion";
            inventory.add(p1);
            Room4();
                break;
                
            case 2: 
            System.out.println("Shopkeeper: GOOD CHOICE, HERE YOU GO.");
            System.out.println("He hands you a potion of Strength and you give him your 10 gold pieces. ");
            inventory.remove(g10); // removing the 10 gold you just spent.
            String p2="Strength Potion";
            inventory.add(p2);
            Room4();
                break;
                
            case 3: System.out.println("Shopkeeper: GOOD CHOICE, HERE YOU GO.");
            System.out.println("He hands you a potion of Speed and you give him your 10 gold pieces. ");
            inventory.remove(g10); // removing the 10 gold you just spent.
            String p3="Speed Potion";
            inventory.add(p3);
            Room4();
                break;
                
            case 4: checkInventory();
            Room3();
                break;
                
            default: System.out.println("EEROR: Please input a valid option.");
            Room3();
                break;
                
           
        }
        
    }
    
    
public void Room4() {
    Scanner keyboard=new Scanner(System.in);
    System.out.println("");
    System.out.println("");
    System.out.println("");
    System.out.println("Room 4: Baby ");
    System.out.println("");
    System.out.println("When the potion comes in contact with your hand, the the whole room, including the shopkeeper starts to turn inot dust.");
    System.out.println("All the books, the potions, the stall, everything starts to dust away");
    System.out.println("The only thing thats still intact is the potion that he handed you.");
    System.out.println("");
    System.out.println("You notice a door that forms out of thin air in the corner of the room where the bookshelfs used to be");
    System.out.println("You walk up to the door and a piece of paper falls down to your feet");
    System.out.println("");
    System.out.println("PRESS ENTER TO PICK UP");
    
    if (keyboard.nextline().equals(""))
    Room4P2();
    
    
}

public void Room4P2() {
    
}
    
public void checkInventory() {
    System.out.println("Here is your inventory:" + inventory);
}
    

    
    
}


    

