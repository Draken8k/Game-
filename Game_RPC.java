import java.util.Random;
import java.util.Scanner;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

public class Game {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Press: 0 for Rock,1 for Paper, 2 for Scissor");
        int User_input = input.nextInt();
        Random random = new Random();
        int Computer_input = random.nextInt(3);
        System.out.println(Computer_input);
        
        if(User_input == Computer_input){
            System.out.print("Draw!!");
        }
        else if(User_input == 0 && Computer_input == 2 || User_input == 1 && Computer_input == 0 || User_input == 2 && Computer_input == 1){
            System.out.print("You win!!");
        }
        else{
            System.out.print("You Lose :/");
        }
    }
}