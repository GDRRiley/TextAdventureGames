/* This should be use to launch the other programs. 
  They can be run from their own main method but this is the planned way
  
*/

import java.util.Scanner;
  import java.io.IOException;
public class gabrielGameLauncher{
  
  public static void main(String[] args) throws IOException{
    Scanner scan= new Scanner(System.in);
    System.out.println("You can try all of my games I have coded here."+
                         "\n**********************************************"+
                         "\n          Created by Gabriel Riley            "+
                         "\n**********************************************");
    //loop for chosing program
    System.out.println("\nEnter 1 to play \"Walk in the City\".\nEnter 2 to play \"Cave Adventure Game\".\nEnter 3 to play\"Space Flight\".\nEnter 0 to stop playing.");
    int gchoice=1;
      while(gchoice!=0){
    gchoice=scan.nextInt();
      //the 2 code runners
      if(gchoice==1){
      walkTheCity.main(args);
      }
      if(gchoice==2){
      AdventureGameS2.main(args);
      }
      if(gchoice==3){
      spaceFlight.main(args);
    }
    if(gchoice!=0)
    System.out.println("\n\nEnter another code to play a game.\nEnter 1 to play \"Walk in the City\".\nEnter 2 to play \"Cave Adventure Game\".\nEnter 3 to play \"Space Flight\".\nEnter 0 to stop playing.");
    }
    System.out.println("\nThanks for playing hope you had a great time.\nFeel free to post videos of this online. If you want to redistrubute this pack please ask me.");
  }
}
// Want a verison of this that explains how to add your own. I have that under 2017-2018 share folder. It is this but with information on how and what you must add to get this working. 