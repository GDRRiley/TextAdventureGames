  import java.util.Scanner;
  import java.util.Random;
  public class walkTheCity{
  
    public static void main(String[] args){
    Scanner scan= new Scanner(System.in);  
   System.out.println(  "\t*************************************************************\n"+
                       "\t\t Welcome Travler, to The Destoryed City!   \n"+
                       "\t*************************************************************");
    
    System.out.println("Enjoy walking around what remains of this once Great City.");
    System.out.println("I will be you guide. What is your name?");
    String name=scan.nextLine();
    character player=new character(name,20,1);
      System.out.println("Let me tell you a bit about myself "+player.getName()+". I was born here and lived here for almost my entire life.\nI just moved away a few months ago to go to collge. "+
    "Now tell me a bit about yourslf.");
    String about=scan.nextLine();
    System.out.println("That is intresting. Well lets get on with the tour. We can go left, right or walk forward");
    String input=scan.nextLine();
    if(input.toLowerCase().contains("right")){
    System.out.println("Ok we will go right.");
     
    
    
    
    }
    if(input.toLowerCase().contains("left")){
    System.out.println("Ok we will go left.");
     System.out.println("So up here on the left is ahhhhh!!!!.\nAs you and the guide begin to walk forward you both fell into a crack in the road.\nRIP "+player.getName()+"\nRIP Guide");
    // I don't like left so you die when you chose it. 
    }
    if(!input.toLowerCase().contains("right")&&!input.toLowerCase().contains("left")){
      if(input.toLowerCase().contains("forward")||input.toLowerCase().contains("straigt")){
      //go forward with anything else put. 
      System.out.println("Ok we will go forward.");
      }
      else{
    System.out.println("I'm not sure were you want to go, so I'm just going to go forward.");
      }
      System.out.println("So ahead to the left is the reamains of city hall and to the right is the court house.\nBoth were hit hard by the bomb, even with them being some of the strongest building in the city they couldn't take it."+
                         "Oh, I should give you this speical hazmat suit. We are going to need it as we go closer to the center of the blast.\nWe don't want to end up fried or get cancer in a week. That wouldn't be great for my ratings.");
      
      
      
      
      
    }
    
    
    System.out.println("\nThanks for playing the game. It is still a work in progress with more planned to be added.");
    }
  }