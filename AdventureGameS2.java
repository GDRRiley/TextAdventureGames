import java.util.Scanner;
import java.util.Random;
public class AdventureGameS2 {
 //method that checks if you are dead
  public static int dead(Double h, int e, int playerLevel, String playerName){
if (h<0.0){
    System.out.println("Oh no " + playerName + " died! You were level " + playerLevel);
    return e=1;
   }
return e=0;

}
  
  public static void main(String[] args) {
  // TODO Auto-generated method stub
  System.out.println(  "\t***************************************************************\n"+
                       "\t  Welcome Travler, to the Cave of Wonders! Adventure awaits!  \n"+
                       "\t***************************************************************");
  Random randomGenerator = new Random();
   // Initialize player name and level and testing if dead
  
   String playerName;
   int e=0;
    String [] name={"gaben","lord gaben", "gabe", "gabriel","Keithley","noah","42","maxine"};
    String [] nameb={"greg","griggs","xavier","cody","k dog","farley","galaxykingxax","xax"};
   //created weapons and askes for name
    String[] weapons={"fist"," arm"," leg"," fist"};
   Scanner playerInput = new Scanner (System.in);
   System.out.println("What is your name?");
   playerName= playerInput.nextLine();
   //sh
   character player= new character(playerName,10,1);
   int c=0;
     while(c<name.length){
   if(playerName.equalsIgnoreCase(name[c])){
   player.changeHealth(8);
   System.out.println("You found a secret, shhhh");
   }
   if(playerName.equalsIgnoreCase(nameb[c])){
  player.changeHealth(-4);
   }
   c++;
   }
      
   System.out.println("Your are " + player.getName() + ", the level " + player.getLevel() + " foolish adventurer.\nYou feel ready to go into the cave of your dreams, you have wanted to to go into it all your childhood.\nYou have your trusty flashlight with extra batteries in your cargo pants.\nYou climb into the cave and turn on your light and walk forward until the cave increases in size.\nLooking back, you see only a hint of sunlight streaking in.");
   //First level starting
   System.out.println("You made it to the entrance of main the cave. You move your flashlight around to light the dark cobweb covered cave.\nThe damp wind wispers around you face");
   player.addLevel();
   System.out.println("You leveled up you are now level " + player.getLevel());
   //Rocks fall                 f
   double RockDamage=1;
   System.out.println("A treacherus rock ambushes you");
   player.changeHealth(-RockDamage);
   System.out.println("You took "+ (int)RockDamage +" Damage. You have " + (int)player.getHealth() + " Health remaining");
   //first loot area
   System.out.println("There is is a dark path to the left." + "\nThere is a pile of rubble to the right." + "\nDo you want to go to the left or to the right."); 
   String playerAnswer;
   playerAnswer = playerInput.nextLine();
   if(playerAnswer.equalsIgnoreCase("right")){
    System.out.println("Good Choice!\nYou get a pair of old leather boots and and a Miners hat.");
    player.addLevel();
    player.changeHealth(5);
    System.out.println("You are now level " +player.getLevel()+ " adventurer and you are not a fool anymore!\nYou now have "+ (int)player.getHealth()+" Health because of the extra armor");
    
  }
   else if(playerAnswer.equalsIgnoreCase("left")){
    player.changeHealth(-RockDamage);
    System.out.println("Wrong Way. You hit you head on a rock. You have " + (int)player.getHealth() +" health");
   //Rocks fall
   System.out.println("A treacherus rock ambushes you");
   player.changeHealth(-RockDamage);
   System.out.println("You took "+ RockDamage +" Damage. You have " + (int)player.getHealth() + " Health remaining");
   
   //
    e=dead(player.getHealth(), e, player.getLevel(),player.getName());
   }
   //
   
   else{
     System.out.println("That is not a valid answer.\nYou stumble around and take 3 damage");
     player.changeHealth(-3);
   }
   //loot 2 area
   System.out.println("As you start to walk forward you see a old sword and a backpack.\nDo you Pick it up?\nYes or No");
   playerAnswer= playerInput.nextLine();
   if(playerAnswer.equalsIgnoreCase("Yes")){
     player.changeAtack(6);
     weapons[1]=" sword";
   System.out.println("You now have a sword that you can srike with for a minmum of "+ player.getAtack()+" damage.\n You can now hold 100 small pieces of treasure ");
   }
   //loot 3 area
   System.out.println("You see a shiney stone and gold pieces next to it and a old chestplate.\nDo you take the armor, gold and the odd stone?\nYes or No");
   playerAnswer= playerInput.nextLine();
   if(playerAnswer.equalsIgnoreCase("Yes")){

     player.changeHealth(10);
     System.out.println("You backpack is 1/3 full but the pockets on you pants are full\nYou now have "+ (int)player.getHealth()+" health");
   //50 parts are used up
   }
   int w=0;
   //spear at door, old man
   System.out.println("A door is ahead of you and is pried open with a spear in the door.\nDo you grab the spear?\nAll of a suden a man walks up and taps you on the shoulder.\n Do you try to hit him? ");  
   playerAnswer= playerInput.nextLine();
   if(playerAnswer.equalsIgnoreCase("yes")){
     player.changeHealth(-15);
     System.out.println("You try to hit him but he just backs away and then you get hit by a arrow to the head.\n Your health is now "+ (int)player.getHealth()+"\nYou can barely walk");
     w=1;
   }
   
   //
e=dead(player.getHealth(), e, player.getLevel(),player.getName());
   //
   
   
   if(w==0){
   
   if(e==0){
     if (playerAnswer.equalsIgnoreCase("no")){
       System.out.println("The man wonders why you are exporing in here?");
     }
     System.out.println("You can say: You are looking for treasure or just bored");
     playerAnswer= playerInput.nextLine();
     if(playerAnswer.equalsIgnoreCase("You are looking for treasure")){
       System.out.println("The man says he use to expore the cave when he was younger but he now live in the cave.");
     }
     if(playerAnswer.equalsIgnoreCase("just bored")){
       System.out.println("The man says he use to expore the cave when he was younger but he now live in the cave.");
     }
     System.out.println("The man leads you to a secret door and opens it.\nInside there is a small bed, a fridge, a couch, TV, and a table with 4 chairs.\n What do you think of my house.\n Do you like it?");
     playerAnswer= playerInput.nextLine();
     if(playerAnswer.equalsIgnoreCase("Yes")){
       System.out.println("I hope you have a fun time exporing the cave. I had a fun time exploring the cave, said the man.\nYou walk out back into the cave.");
     }
     else{
       System.out.println("Fine, said the man.\nHe throws you out of his house and you take 4 damage from hitting your head");
       player.changeHealth(-4);
       //
e=dead(player.getHealth(), e, player.getLevel(),player.getName());
       //
     }
   }
   }
   //
e=dead(player.getHealth(), e, player.getLevel(),player.getName());
   //
   if(e==0){
   //door with spear
   System.out.println("After you come back out of the man's house you look back twards the door and walk up to it.\nYou can grab the spear or try to jump over it.");
   playerAnswer= playerInput.nextLine();
   if(playerAnswer.equalsIgnoreCase("grab")){
   weapons[2]= " spear";
   System.out.println("You can now use a spear");
   }
   else if(playerAnswer.equalsIgnoreCase("jump")){
   player.changeHealth(-3);
   System.out.println("You take 3 damage jumping over the spear.\nLeaving you with "+ (int)player.getHealth()+" health.");
   //
e=dead(player.getHealth(), e, player.getLevel(),player.getName());
   //
   }
   //pathway
   else{
     double falling= randomGenerator.nextDouble()*10;
     player.changeHealth(-falling);
   System.out.println("That is not a valid answer and you took "+falling+" damage");
   }
  }
   //
e=dead(player.getHealth(), e, player.getLevel(),player.getName());
    if(e==0){
   System.out.println("When you get through the door you see a left corrider and a right corrider.");
   playerAnswer= playerInput.nextLine();
   if(playerAnswer.equalsIgnoreCase("left")){
     //loot
   System.out.println("You see a pile of goold and a pair of chaps.\nDo you pick them up. yes no");
   playerAnswer= playerInput.nextLine();
   if(playerAnswer.equalsIgnoreCase("yes")){
   player.changeHealth(5);
   System.out.println("Your backpack is full and you have "+(int)player.getHealth()+" health.");
   //backpack full.
   }
   if(playerAnswer.equalsIgnoreCase("no")){
   }
   }
    }
    
   //health potion
   if(playerAnswer.equalsIgnoreCase("right")){
   System.out.println("You find a health potion do you drink it?");
   playerAnswer= playerInput.nextLine();
   if(playerAnswer.equalsIgnoreCase("Yes")){
   double falling= randomGenerator.nextDouble()*5+10;
   player.changeHealth(+falling);
   System.out.println("Your health is now "+ (int)player.getHealth());
   }
   if(playerAnswer.equalsIgnoreCase("No")){
   player.changeHealth(-3);
   System.out.println("You feel a odd slap and take 3 damage.\nYour helth is "+(int)player.getHealth());
   }
   
    //
e=dead(player.getHealth(), e, player.getLevel(),player.getName());
   //
    }
   if(e==0){
   //room set with arrows
   System.out.println("You start to walk forward more and you see 2 rooms Chose the left or right room."); 
   playerAnswer= playerInput.nextLine(); 
   if(playerAnswer.equalsIgnoreCase("left")){
   System.out.println("You see a bow and some arrows.\nDo you want them.");
   playerAnswer=playerInput.nextLine();
   if(playerAnswer.equalsIgnoreCase("yes")){
   weapons[3]=" Bow and arrows";
   System.out.println("You can now use a bow and arrows");
   }
   }
   //
e=dead(player.getHealth(), e, player.getLevel(),player.getName());
   //
   }
   if(e==0){
   if(playerAnswer.equalsIgnoreCase("Right")){
   System.out.println("You find a Crossbow and some bolts.\nDo you want them?");
   playerAnswer=playerInput.nextLine();
   if(playerAnswer.equalsIgnoreCase("yes")){
   weapons[3]=" Crossbow and bolts";
   }
   }
   }
   // ATV time
//
e=dead(player.getHealth(), e, player.getLevel(),player.getName());
    if(e==0){
   System.out.println("After you walk out of the room you see a ATV.\nDo you ride it");
   playerAnswer= playerInput.nextLine();
   if(playerAnswer.equalsIgnoreCase("yes")){
   double falling= randomGenerator.nextDouble()*5+10;
   player.changeHealth(-falling);
   System.out.println("You fall of of the ATV after 30 feet and take "+(int)falling+" damage.\n You have "+(int)player.getHealth()+" health remaning.");
   //
e=dead(player.getHealth(), e, player.getLevel(),player.getName());
   //
   
   } 
   if(playerAnswer.equalsIgnoreCase("no")){
   System.out.println("Good idea you would have fallen off as you had never riden an ATV before.");
   player.changeHealth(5);
   System.out.println("You randomly get a health boost.\nYou now have "+(int)player.getHealth()+" Health.");
   }
   if(!playerAnswer.equalsIgnoreCase("no")&&!playerAnswer.equalsIgnoreCase("Yes")){
   double falling= randomGenerator.nextDouble()*10+1;
   player.changeHealth(-falling);
   System.out.println("You changed your mind so you rode the ATV and took "+(int)falling+" damage from falling off of the ATV.");
   }
   //
   e=dead(player.getHealth(), e, player.getLevel(),player.getName());
   //
    }
    
   if(e==0){
   System.out.println("After you continue forwards you find a orb floating around saying:I am not crazy!!\nYou are crazy!!!\nHe then offers you a health potion.\nDo you take it or not?");
   playerAnswer= playerInput.nextLine();
   if(playerAnswer.equalsIgnoreCase("yes")){
   player.changeHealth(5);
   System.out.println("You thank the orb and walk away.");
   }
   else if(playerAnswer.equalsIgnoreCase("no")){
   player.changeHealth(-4);
   System.out.println("The orb zaps you leaving you with "+(int)player.getHealth()+" Health. You then walk away");
    //
   e=dead(player.getHealth(), e, player.getLevel(),player.getName());
   //
   }
   else{
   System.out.println("The orb zaps you taking it offensively leaving you with "+(int)player.getHealth()+" Health. You then walk away");
    //
e=dead(player.getHealth(), e, player.getLevel(),player.getName());
   //
   }
   }
   //
e=dead(player.getHealth(), e, player.getLevel(),player.getName());
   //
   if(e==0){
   System.out.println("You think that you can see a door a ways away that might lead out.\nYou walk forward and you see a door it looks locked what do you do?\n hit the door or Knock on the door");
   playerAnswer=playerInput.nextLine();
   if(playerAnswer.equalsIgnoreCase("hit")){
   player.changeHealth(-2);
   System.out.println("You try to hit the door but it does not move and you take 2 damage from twisting your ankel.That means that you have "+(int)player.getHealth()+" health left.");
   }
   if(playerAnswer.equalsIgnoreCase("knock")){
   player.addLevel();
   System.out.println("The door opens and you level up to level "+ player.getLevel());
   }
   player.changeHealth(6);
   }
    //
e=dead(player.getHealth(), e, player.getLevel(),player.getName());
   //
   //oger time
   if(e==0){
     player.changeHealth(-6);
   System.out.println("After you go through the door you enter a large room and a ork stands in front of you and hits you with is sword doing 6 damage.\nLeaving you with "+(int)player.getHealth()+" health left\nYou can use any of you weapons "+weapons[0]+weapons[1]+weapons[2]+weapons[3]+"\nSelect with 0,1,2 or 3");          
   playerAnswer=playerInput.nextLine();
   if(playerAnswer.equalsIgnoreCase("1")){
     player.addLevel();
     System.out.println("You killed the ork and gained a level.\nYou are now level " +player.getLevel());
     System.out.println("Do you want the ork's sword?");
     playerAnswer=playerInput.nextLine();
       if(playerAnswer.equalsIgnoreCase("yes")){
     weapons[1]=" Great Sword";
     }
   }
   if(playerAnswer.equalsIgnoreCase("2")){
     player.addLevel();
     System.out.println("You killed the ork and gained a level.\nYou are now level " +player.getLevel());
     System.out.println("Do you want the ork's sword?");
     playerAnswer=playerInput.nextLine();
       if(playerAnswer.equalsIgnoreCase("yes")){
     weapons[1]=" Great Sword";
     }
   }
   if(playerAnswer.equalsIgnoreCase("3")){
player.addLevel();
     System.out.println("You killed the ork and gained a level.\nYou are now level " +player.getLevel());
     System.out.println("Do you want the ork's sword?");
     playerAnswer=playerInput.nextLine();
       if(playerAnswer.equalsIgnoreCase("yes")){
     weapons[1]=" Great Sword";
     }
   }
      if(playerAnswer.equalsIgnoreCase("0")){
      System.out.println("As you rush to punch the ork with your fist it hits you in the head with its sword killing you.\nYou were player level"+player.getLevel());
     
      e=1;
      }
      System.out.println("");
      //boss 2
      if(e==0){
      System.out.println("After you defeat the ork you hear the wiz of gear and a door opens. \nWell now that you killed my pet its time to duel \nIt is the old man from the hiden house."+
      "\nWhat weapon do you want to use? You have; "+weapons[0]+weapons[1]+weapons[2]+weapons[3]+"\nselect with 0-3.");
      
      playerAnswer=playerInput.nextLine();
   if(playerAnswer.equalsIgnoreCase("1")){
     //checking you you took the ork sword, if you didn't GG
     if(weapons[1]==" Great Sword"){
     player.addLevel();
     player.addLevel();
     System.out.println("As you slash through him you hear a sizle and the old man is cut in two.\nYou leveled up. You are now level " +player.getLevel()+ ".\nCongratualtions you have defeated your hardest challenge yet");
     }
     else{
     System.out.println("You try to hit but the sword doesn't effect him.\nHe stands there and laughs. Feel the pain of Mother Russia!!\nHe pulls out a sword and dismembers you as he continues to laugh.");
     e=1;
     }
   }
   else{
      System.out.println("As you try to hit him he starts wispering, then a hole opens up and you fall down.\nYou feel as if you have been falling for ever.\nYou were player level"+player.getLevel());
      player.changeHealth(-100);
      e=1;
      }
      System.out.println("");
      }
      
   }
   
    //
e=dead(player.getHealth(), e, player.getLevel(),player.getName());
   //
   if(e==0){
   //new boss made with a while loop.
   int bossHealth=(int)Math.random()*30+40;
   boolean health=true;
    System.out.println("You hear an anoncer anounce \"This is your final test!\"");
    int blimbs=12;
    boolean sp=true;
    
   while(health==true){
     System.out.println("You have "+(int)player.getHealth()+" healh. What weapon do you swing? You have "+weapons[0]+weapons[1]+weapons[2]+weapons[3]+"\nHint use 0-3");
   playerAnswer=playerInput.nextLine();
   //main battle loop
   
   if(playerAnswer.equals("0")||playerAnswer.equals("1")||playerAnswer.equals("2")||playerAnswer.equals("3")){
     //why would you use your fist
   if(playerAnswer.equals("0")){
     System.out.println("You try to hit with your"+weapons[0]+" and you do 3 damage but take 10 from the creatures sharp scales");
     player.changeHealth(-10);
     bossHealth=bossHealth-3;
   }
   //there you go use that great sword
   if(playerAnswer.equals("1")){
     System.out.println("You try to hit with your"+weapons[1]+" and you do 15 damage but take 3 from the creatures slashing two of its "+blimbs+" limbs");
     player.changeHealth(-3);
     bossHealth=bossHealth-15;
     blimbs=blimbs-2;
   }
   //bow/crossbow works well
   if(playerAnswer.equals("3")){
     System.out.println("You try to hit with your"+weapons[3]+" but the projectile gets stuck in the scales.\nYou do minimal damage. it strikes back with "+ blimbs/3 +" of its remaing limbs and does "+blimbs/3*6+" damage.");
     player.changeHealth(-blimbs/3*6);
     bossHealth=bossHealth-2;
   }
   //a spear may do well
   if(playerAnswer.equals("2")&&sp==true){
     System.out.println("You try to hit with your"+weapons[2]+" and you do 10 damage but it gets stuck in the creatures scales rendering it broken take 10 from the creatures sharp scales");
     player.changeHealth(-10);
     bossHealth=bossHealth-3;
     sp=false;
   }
   }
   if(!playerAnswer.equals("0")&&!playerAnswer.equals("1")&&!playerAnswer.equals("2")&&!playerAnswer.equals("3")){
     System.out.println("not valid you take 2 damgae try again.");
     player.changeHealth(-2);
   }
   if(blimbs<8&&bossHealth>=0){
   bossHealth=bossHealth-5;
   System.out.println("It is starting to bleed out");
   }
e=dead(player.getHealth(), e, player.getLevel(),player.getName());
   //end condition
   if(e==1||bossHealth<0||blimbs<3){
   health=false;
   }
   }
    
   player.addLevel();
   player.addLevel();
   player.addLevel();
   System.out.println("You have killed the final boss Congraduations you are now level "+player.getLevel()+" You still have "+(int)player.getHealth()+" health left.");
   }
   //ending with death check
   //
e=dead(player.getHealth(), e, player.getLevel(),player.getName());
   //
   if(e==0){
   System.out.println("You walk out of the cave and into sunlight, your eyes sting a litte when it first hits you.\nThe day looks normal until you see a giant plane fly over with a figter starting to atack it\nWar is going on and you had no idea."
    +" It has been going on for 12 hours.\nThanks "+ playerName +" for playing the game. It is still a work in progress with more planned to be added.\nFeel free to post videos of this online. If you want to redistubute it ask me.");
   }
   //if you died/ game ended
   if(e==1){
   }

        
    
  }
}