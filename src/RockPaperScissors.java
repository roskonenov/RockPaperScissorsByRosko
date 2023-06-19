import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    private static final String ROCK = "Rock";
    private static final String PAPER = "Paper";
    private static final String SCISSORS = "Scissors";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String anotherGame = "";
        int gamesPlayed = 0;
        int playersWins = 0;
        int computersWins = 0;
        int drawGames = 0;
        do {
            System.out.print(ANSI_YELLOW + "Choose [R]ock, [P]aper, or [S]cissors " + ANSI_RESET);
            String playersChoice = scanner.nextLine();
            if (playersChoice.equalsIgnoreCase("r") || playersChoice.equalsIgnoreCase("rock")) {
                playersChoice = ROCK;
            } else if (playersChoice.equalsIgnoreCase("s") || playersChoice.equalsIgnoreCase("scissors")) {
                playersChoice = SCISSORS;
            } else if (playersChoice.equalsIgnoreCase("p") || playersChoice.equalsIgnoreCase("paper")) {
                playersChoice = PAPER;
            } else {
                System.out.println(ANSI_RED + "Invalid input! Please try again..." + ANSI_RESET);
                if (gamesPlayed == 0) {
                    anotherGame="y";
                }
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
            System.out.printf(ANSI_BLUE + "The computer chose %s,\n" + ANSI_RESET, computersChoice);
            switch (playersChoice) {
                case ROCK:
                    if (computersChoice.equals(ROCK)) {
                        System.out.println(ANSI_GREEN + "The game is draw." + ANSI_RESET);
                        drawGames++;
                    } else if (computersChoice.equals(SCISSORS)) {
                        System.out.println(ANSI_GREEN + "You WIN!!! :)" + ANSI_RESET);
                        playersWins++;
                    } else {
                        System.out.println(ANSI_GREEN + "You lose. Sorry!" + ANSI_RESET);
                        computersWins++;
                    }
                    break;
                case SCISSORS:
                    if (computersChoice.equals(ROCK)) {
                        System.out.println(ANSI_GREEN + "You lose. Sorry!" + ANSI_RESET);
                        computersWins++;
                    } else if (computersChoice.equals(SCISSORS)) {
                        System.out.println(ANSI_GREEN + "The game is draw." + ANSI_RESET);
                        drawGames++;
                    } else {
                        System.out.println(ANSI_GREEN + "You WIN!!! :)" + ANSI_RESET);
                        playersWins++;
                    }
                    break;
                case PAPER:
                    if (computersChoice.equals(ROCK)) {
                        System.out.println(ANSI_GREEN + "You WIN!!! :)" + ANSI_RESET);
                        playersWins++;
                    } else if (computersChoice.equals(SCISSORS)) {
                        System.out.println(ANSI_GREEN + "You lose. Sorry!" + ANSI_RESET);
                        computersWins++;
                    } else {
                        System.out.println(ANSI_GREEN + "The game is draw." + ANSI_RESET);
                        drawGames++;
                    }
                    break;
            }
            gamesPlayed++;
            System.out.printf(ANSI_PURPLE + "  Game stats:\n        Wins: %d\n       Loses: %d\n       Draws: %d\n" + ANSI_RESET, playersWins, computersWins, drawGames);
            System.out.printf(ANSI_PURPLE + "Games played: %d\n" + ANSI_RESET, gamesPlayed);
            System.out.println(ANSI_CYAN + "Would you like another game? y/n " + ANSI_RESET);
            anotherGame = scanner.nextLine();
             while (!anotherGame.equalsIgnoreCase("y") && !anotherGame.equalsIgnoreCase("n")){
                 System.out.println(ANSI_RED + "I'm sorry...? Type again! y/n" + ANSI_RESET);
                 anotherGame = scanner.nextLine();
             }
            if (anotherGame.equalsIgnoreCase("n")) {
                System.out.println(ANSI_BLUE + "Sorry to lose you! Hope to see you soon!" + ANSI_RESET);
                return;
            }
        } while (anotherGame.equalsIgnoreCase("y"));
    }
}