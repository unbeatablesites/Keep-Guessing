import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        logic();
    }


    static void logic(){
        System.out.println("I have chosen a number between 1 and 10. Try to guess it.\n");
        System.out.print("Your guess:");
        Scanner scan = new Scanner(System.in);
        int userGuess = scan.nextInt();
        int secretNumber = 5;

        while (userGuess != secretNumber){
            System.out.println("That is incorrect. Guess again.\n");
            System.out.print("Your guess:");
             userGuess = scan.nextInt();
        }

        System.out.println("That's right! You're a good guesser.");




    }

}
