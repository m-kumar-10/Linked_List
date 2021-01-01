package initials;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        System.out.println("Welcome To the Guessing Game...");
        Scanner name= new Scanner(System.in);
        System.out.println("Enter Your In-Game_Name");
        String Name=name.next();
        System.out.println("Hello! "+Name);
      int answer=0;
      int Generated;
      int guess;
        for (;;){
            System.out.println("SHould We Start the Game.?");
            System.out.println("Press '1' for Start or Press '0' for Decline");
            answer=name.nextInt();
            if (answer==1){
                Random numb=new Random();
                Generated= numb.nextInt(20);
                System.out.println("You Have Five Chances for Guessing Correct Number");
                for (int i=0;i<5;i++){
                    System.out.println("Enter Your Number,you guessed");
                    guess=name.nextInt();
                    if (guess>Generated){
                        System.out.println("Guess another number,Smaller than This one...");
                    }
                    else if (guess<Generated){
                        System.out.println("Guess another number, Bigger than This One...");
                    }
                    else {
                        System.out.println("you Won this Game :)");
                        System.out.println("The Number was:" + Generated);
                        break;
                        //TODO javafx
                    }
                    if (i==4){
                        System.out.println("\n\n\n\n\n\n GAME OVER :( ");
                        System.out.println("The Number was "+Generated );
                        break;
                    }

                }
                break;
            }
        }
    }
}
