import java.util.Scanner;
import java.util.Random;
public class spaceFlight{
  public static void main(String[] agrs){
  Scanner scan=new Scanner(System.in);
  System.out.println( "\t******************************************************************\n"+
                       "\t  Welcome Travler, to Edwards AFB. We will be launching momentarly.  \n"+
                       "\t*****************************************************************");
  System.out.println("Please enter what you would like to be called.");
  String n=scan.nextLine();
  System.out.println("Welcome "+n+" to the Edwards AFB. This is not where rockets are normaly launched from. The main locations are The Cape in Flordia and Vandenberg AFB in Californa.\nWe here at Low Cost Space Planes need the large runways in the desert for landing and launching the launch aircraft");
  character player=new character(n,10,0);
  System.out.println("I do you want me tell you a bit more about your flight before we begin?");
  String sc=scan.nextLine();
  //choice of more information
  if(sc.toLowerCase().contains("y")){
  System.out.println("You will be in the Bolt above the Thunder launch aircraft.\nThe Thunder is powered by 6 Trent 900s. This allows the 300T Bolt to be carried and launched easily.\nThe Bolt you will be flying on is the 2nd working verison of block 2 named Essex. This is its 4th of 350 flight expected lifetime before major referbishment.");
  System.out.println("The Thunder should carry you to 65,000ft before the Bolt is launched and its quad AJ10s will fire.\nEarlier versions of this legendary motor brought men to the moon and helped the shuttle change altitude in space.");
  System.out.println("The Thunder will then decend to land back Edwards AFB, where it will be refulled and have another Bolt will be added."+
                     "\nWe bevlive the Bolt will be the future of passanger and small cargo launchers, being cheaper that any other method.");
  player.addLevel();
                       }
  System.out.println("Please choses the color of your space suit.");
  String color=scan.nextLine();
  //checks if color is a near match
  if(color.toLowerCase().contains("blue")||color.toLowerCase().contains("green")){
  System.out.println("Wow "+color+" is close to my favorite color.");
  }
  System.out.println("Ok we have a "+color+" space suit, please step this way. While we fuel the flight please get in it and have one of the techs check it.\nYou will be one of 3 tourist onboard in adition to the 2 crew and 3 astronaughts who are heading to the ISS."+
                    "The total time in space should be an hour under 5 days. Landing will happen here after your enjoy the flames of rentery.");
    player.addLevel();
    // Yes the astronaughts are current US. And Yeah I used famous people for the tourist
  System.out.println("Ok now that your ready to go I will introduce you to the rest of the crew. The other tourists are Elon Musk, and Linus Sebastion."+"\nYour Pilot will be Noah Clark, the co-pilot is Elane Douglas. From NASA we have Joseph Acaba, Serena Auñón-Chancellor, and Karen Nyberg."
                       +"The bolt is fueled everyone head out to the bus and will get to the Bolt.\nHey Musk you didn't want to pay the price for your own Space X to take you?");
  System.out.println("Musk: No I was told that I couldn't fly on it, I tried to pull rank but they wouldn't have it.");
  System.out.println("This is why Musk you can't have nice things.\nMusk: Hey "+player.getName()+" do you belive in me? and what I do.");
  String musk=scan.nextLine();
  //are you going to make Musk mad at you
  boolean muskM=false;
  if(musk.toLowerCase().contains("n")){
  System.out.println("Wow your great to be around, so happy to have you with me for the next week.\nLets be nice, your going to at least tolrate each other.");
  muskM=true;
  }
  else{
  System.out.println("Thanks for backing me up. Least your nicer than Noah.\nNoah: Why do you hate me all I said is that I would never work for Space X.");
  player.addLevel();
  }
  System.out.println("Now that you all have meet and shared feelings of each other lets go.\nThe Bolt was sitting on the Thunder a stair leads up to the door. You can see the 4 large bolts that hold them togther."+
                     "Get ready for the ride of you life. Time to orbit from now should be 1.5 hours. Push back is in 15 mins. Get up in there.");
  // describing the bolt
  System.out.println("As you walk in the Bolt you see the 8 seats in a 2-3-3 configuratin.The frount having the Pilots then NASA and finaly you between Elon and Linus\nNoah: The seats are tilled back 45 degrees to reduce the G-force."+
                     "\nAs you sit down in the chair you notice there is more than the typical seat belt. Its a 5 point harness, 2 over the shoulder, 2 from each side and 1 between your legs. A tech walks up and helps you get them buckled."+
                     "\nHe also transfers your suits imblical cord from a moblie unit to the ship. He then reminds you to please not talk on coms unless needed.\nYou being to hear the pilots go through the launch checklist.\nYou then hear a raido call: "+
                     "\"Are you ready to go Essex? Yes ready for launch. We will be departing mometarily from 18C, request airspace Clear.\"\nATC: Airspace is clear, you are cleared for takeoff."+
                     "Noah: reminder please store all lose objects, please put your tray tables up and please enjoy the flight.");
  //takeoff time
  System.out.println("As the Thunder nicknamed \'Mother Duck\' begins to spin up its engines, you begin to feel the rumble in your chest.");
  System.out.println("Over the Raido: We have an issuse with engine number 3 and 4 abort takeoff. Full reverse thrusters and airbrakes out.\nWe have had to scrap this flight, we will try agian in a few days. I know you all are disapointed.");
  
  
  
  
  
  
  
  
  System.out.println("\nThanks for playing the game. It is still a work in progress with more planned to be added.");
  }
  
}