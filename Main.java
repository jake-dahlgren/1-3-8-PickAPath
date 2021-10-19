import java.util.*;

class Main {
  public static void main(String[] args) {
   
    String input;
    System.out.println("You are about to play a game. You will be asked for input, capital and lowercase letters are accepted. Are you ready to play? \nY : yes \nN : no");
Scanner sc = new Scanner(System.in);
input = sc.nextLine();
if (input.equals("Y") || input.equals("y"))
{

    System.out.println("You are hiking in the woods when you approach a cliff. You can either follow the ledge to the left or follow the ledge to the right. You can also turn around and return the way you came. What do you want to do? \nR : go right \nL : go left \nB : go back");
    
    input = sc.nextLine();
    if (input.equals("R")  || input.equals("r")) {
      System.out.println("You are walking along the cliff and the path starts to decend. You follow it down but trip on some loose rocks. You fall onto a ledge below the path. You can either \nP : phone for help \nC : try to climb back up");
      input = sc.nextLine();
      if (input.equals("P") || input.equals("p")) {
        System.out.println("You use your phone and call for help. A helecopter is sent to rescue you. However, the vibrations cause a landslide and you die");
      }
      else if (input.equals("C")  || input.equals("c")){
        System.out.println("You try to climb the cliff. You lose your grip and die.");
      }
      else {
        System.out.println("You chose to do neither. You sit on the ledge until you run out of water and dye of dehydration. The vultures eat your body the next morning.");
      }
    }
    else if (input.equals("L")  || input.equals("l")) {
      System.out.println("You follow the left rim and approach a cave. There is a sign that says \"Free Candy Inside\" posted by the cave. Do you \nE : enter the cave \nG : get the frick out of there ");
      input = sc.nextLine();
      if (input.equals("E") || input.equals("e")) {
        System.out.println("You enter the cave. There is a man inside. The man approaches you, reaches into his jacket, and pulls out a lollie pop and a granola bar. You eat them, exchange contact information, and go back home.");
      }
      else if (input.equals("G")  || input.equals("g")) {
        System.out.println("You try to run, but a man sees you. He asks why you didnt want his candy. You start to speak, but he throws you off the cliff out of anger. You die.");
      }
      else {
        System.out.println("You chose to do neither and stand there like an idiot. While you are standing there, a tree falls on you. You manage to call for help, but wake up a week later paralyzed from the neck down due to a spinal injury.");
      }
    }
    else if (input.equals("B")  || input.equals("b")){
      System.out.println("You turn around to return the way you came. But the serial killer who has been following you this whole time pins you against a tree and injects you with a lethal dose of horse tranquilizer. cope");
    }
    else {
      System.out.println("You didn\'t chose a valid option and therefore walk straight off the cliff. You are dead");
    }
}
else if (input.equals("N") || input.equals("n")){
  System.out.println("You said no. Why are you even here ");
}
else {
  System.out.println("You obviously didn\'t read teh instructions. You are probably an idiot'");
}
  }
}