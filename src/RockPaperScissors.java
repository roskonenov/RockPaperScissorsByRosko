import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    private static final String ROCK = "Rock";
    private static final String PAPER = "Paper";
    private static final String SCISSORS = "Scissors";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String anotherGame = "";
        do {
            System.out.print("Choose [R]ock, [P]aper, or [S]cissors ");
            String playersChoice = scanner.nextLine();
            if (playersChoice.equalsIgnoreCase("r") || playersChoice.equalsIgnoreCase("rock")) {
                playersChoice = ROCK;
            } else if (playersChoice.equalsIgnoreCase("s") || playersChoice.equalsIgnoreCase("scissors")) {
                playersChoice = SCISSORS;
            } else if (playersChoice.equalsIgnoreCase("p") || playersChoice.equalsIgnoreCase("paper")) {
                playersChoice = PAPER;
            } else {
                System.out.println("Invalid input! Please try again...");
                continue;
            }
            Random random = new Random();
            int randomNum = random.nextInt(3);
            String computersChoice = "";
            switch (randomNum) {
                case 0:
                    computersChoice = ROCK;
                    break;
                case 1:
                    computersChoice = SCISSORS;
                    break;
                case 2:
                    computersChoice = PAPER;
                    break;
            }
            System.out.printf("The computer chose %s,\n", computersChoice);
            switch (playersChoice) {
                case ROCK:
                    if (computersChoice.equals(ROCK)) {
                        System.out.println("The game is draw.");
                    } else if (computersChoice.equals(SCISSORS)) {
                        System.out.println("You WIN!!! :)");
                    } else {
                        System.out.println("You lose. Sorry!");
                    }
                    break;
                case SCISSORS:
                    if (computersChoice.equals(ROCK)) {
                        System.out.println("You lose. Sorry!");
                    } else if (computersChoice.equals(SCISSORS)) {
                        System.out.println("The game is draw.");
                    } else {
                        System.out.println("You WIN!!! :)");
                    }
                    break;
                case PAPER:
                    if (computersChoice.equals(ROCK)) {
                        System.out.println("You WIN!!! :)");
                    } else if (computersChoice.equals(SCISSORS)) {
                        System.out.println("You lose. Sorry!");
                    } else {
                        System.out.println("The game is draw.");
                    }
                    break;
            }
            System.out.println("Would you like another game? y/n ");
            anotherGame = scanner.nextLine();
        } while (anotherGame.equalsIgnoreCase("y"));
    }
}