import java.util.Scanner;

public class MethodExplain {
    public static int numberOfGuesses;
    public static int gameNumber;









    /* FIRST METHOD INVOKED, initGame()
     INITIALISE BOOLEANS FOR GAME RUNNING LOGIC
     INITIALISE SCANNER AND A SOUT MESSAGE
     ENTER INTO PARENT DO WHILE TO GENERATE A NEW RANDOM NUMBER
     ENTER INTO INNER DO WHILE TO RUN THE GAME => runRound()
     WHICH WILL RUN THE GAME IN THE INNER DO WHILE LOOP AND VALIDATE YOUR INPUT WHILE RUNNING UNTIL YOU GUESS CORRECTLY
     A CONDITION IS EVALUATED IN THE runRound() TO CHECK IF YOUR GUESS IS == TO THE gameNumber
     IF NOT AND IT IS HIGHER OR LOWER A numberOfGuesses IS INCREMENTED IN THE CONDITIONAL STATEMENTS AND IS
     DISPLAYED WITH EACH GUESS

     WHEN YOU GUESS CORRECT THE gameRunning BOOLEAN
     IS REASSIGNED TO THE RETURN VALUE OF runRound(), A BOOLEAN, THAT IS ASSIGNED TO FALSE WHEN YOU GUESS CORRECTLY
      EXITING THE INNER LOOP A REASSIGNMENT OF THE programRunning BOOLEAN HAPPENS FROM THE getYesOrNo() FUNCTION
     IF IT RETURNS FALSE THE OUTER LOOP IS ENDED WITH THE SOUT MESSAGE "GOOD BYE!" OTHERWISE THE OUTER LOOP IS
     STARTED OVER AGAIN */

    public static void main(String[] args) {
        initGame();
    }

    public static void initGame() {
        boolean programRunning;
        boolean gameRunning = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the High / Low Guessing Game!");
        do {
            gameNumber = randomWithRange(1, 100);
            System.out.println("The random number is: " + gameNumber);
            do {
                gameRunning = runRound(sc);
            } while (gameRunning);
            programRunning = getYesOrNo(sc).equals("y");
        } while (programRunning);
        System.out.println("Good bye!");
    }

    public static boolean runRound(Scanner sc) {
        boolean gameNotWon = false;
        System.out.print("Please enter a guess: ");
        int playerGuess = getInteger(1, 100, sc);
        if (playerGuess == gameNumber) {
            System.out.println("GOOD GUESS!");
            gameNotWon = false;
        } else if (playerGuess > gameNumber) {
            System.out.println("LOWER");
            numberOfGuesses++;
            gameNotWon = true;
            System.out.println("Number of guesses made: " + numberOfGuesses);
        } else {
            System.out.println("HIGHER");
            gameNotWon = true;
            numberOfGuesses++;
            System.out.println("Number of guesses made: " + numberOfGuesses);
        }
        return gameNotWon;
    }

























    public static int randomWithRange(int min, int max)
    {
        int range = (max - min) + 1;
        return (int)(Math.random() * range) + min;
    }


    public static int getInteger(int min, int max, Scanner sc) {
        if (!sc.hasNextInt()) {
            System.out.println("Not a number!");
            return getInteger(min, max, sc);
        }
        int userInput = sc.nextInt();
        if (userInput >= min && userInput <= max) {
            return userInput;
        } else {
            System.out.println("Number not in range!");
            return getInteger(min, max, sc);
        }
    }

    public static String getYesOrNo(Scanner sc) {
        String userChoice;
        do {
            System.out.println("Do you wish to play again? [y/n]: ");
            userChoice = sc.next().trim();
        } while (!userChoice.equalsIgnoreCase("y") && !userChoice.equalsIgnoreCase("n"));
        return userChoice;
    }
}