import java.util.Scanner;
import java.util.Random;
class rockpaperscissors{
    public static void main(String[] args) {
        System.out.println("Would you like to play rock paper scissors? Type yes or no");
        String userResponse;
        Scanner scan = new Scanner(System.in);
        userResponse = scan.nextLine();
        if(userResponse.equals("yes")){
            System.out.println("Lets get started! How many round would you like to play for?");
            int userInput;
            userInput = scan.nextInt();
            System.out.println("OK! Lets Play!");
            int userWins = 0;
            int botWins = 0;
            for(int i = 1; i <= userInput; i++){
                System.out.println("What move do you select? Select the number corresponding with your choice");
                System.out.println("1. Rock   2. Paper   3. Scissors");
                int userMove = scan.nextInt();
                Random random = new Random();
                int botMove = random.nextInt(3) + 1;
                //Condition below counts for tied scenarios
                if((userMove == 1 && botMove == 1) || (userMove == 2 && botMove == 2) || (userMove == 3 && botMove == 3)){
                    userWins++;
                    botWins++;
                    if(userInput > 1){
                    System.out.println("TIE! Next Round");
                    }
                }
                else if((userMove == 1 && botMove == 3) || (userMove == 2 && botMove == 1) || (userMove == 3 && botMove == 2)){
                    userWins++;
                    if(userInput > 1){
                     System.out.println("You Won! Next Round");
                    }
                }
                else if((userMove == 3 && botMove == 1) || (userMove == 1 && botMove == 2) || (userMove == 2 && botMove == 3)){
                    botWins++;
                    if(userInput > 1){
                     System.out.println("You Lost! Next Round");
                    }
                }
            }
            if(userInput > 1){
            System.out.println("You have " + userWins + " wins. The computer won " + botWins + " times.");
            }
            if(userWins > botWins){
                System.out.println("YOU WIN!!!! It was just a computer tho...");
            }
            else if(botWins > userWins){
                System.out.println("How do you lose against a computer.... Jeeeez....");
            }
            else{
                System.out.println("Its a tie. How are you struggling against a computer");
            }
        }

        else if(userResponse.equals("no")){
            System.out.println("Ok GOODBYE!");
        }
        else{
            System.out.println("IDK what you said, the game is gonna end anyway.");
        }
    }

}

