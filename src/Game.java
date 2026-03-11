
public class Game {
    //game set to 20 rounds, but can be changed by modifying the TOTAL_ROUNDS constant
    private static final int TOTAL_ROUNDS = 20;

    private Player humanPlayer;
    private Player computerPlayer;
    private Rules rules;
    
    //tracks the scores for the human player, computer player, and draws
    private int humanScore;
    private int computerScore;
    private int drawScore;

    //constructor initializes the game with the human player, computer player, rules, and scores
    public Game(Player humanPlayer, Player computerPlayer) {
        this.humanPlayer = humanPlayer;
        this.computerPlayer = computerPlayer;
        this.rules = new Rules();
        this.humanScore = 0;
        this.computerScore = 0;
        this.drawScore = 0;
    }
///plays the game for the specified number of rounds, getting the choices from both players, determining the winner of each round, and updating the scores accordingly. At the end of the game, it prints the final results.
    public void play() {
        for (int round =1; round <= TOTAL_ROUNDS; round++) {
            System.out.println("Round " + round + "- ");
            
            UserChoice humanChoice = humanPlayer.getUserChoice();
            UserChoice computerChoice = computerPlayer.getUserChoice();
            String result = getWinnerMessage(humanChoice, computerChoice);

            System.out.println("You chose " + humanChoice.displayName() + ". The computer chose " + computerChoice.displayName() + ".");
            System.out.println("Score: Human: " + humanScore + " Computer: " + computerScore + " Draws= " + drawScore + ". " + result);
            System.out.println();
        }
        printFinalResult();
    }
///determines the winner of each round based on the choices made by the human and computer players, updates the scores accordingly, and returns a message indicating the result of the round.
    private String getWinnerMessage(UserChoice humanChoice, UserChoice computerChoice) {
       int result = rules.determineWinner(humanChoice, computerChoice);
       if (result == Rules.P1_WINS) {
              humanScore++;
              return "You win this round!";
         } else if (result == Rules.P2_WINS) {
              computerScore++;
              return "Computer wins this round!";
         } else {
              drawScore++;
              return "This round is a draw!";
       }
    }
///prints the final results of the game, including the final scores for the human player, computer player, and draws, and declares the overall winner of the game based on the final scores.
    private void printFinalResult() {
        System.out.println("Final Score: Human: " + humanScore + " Computer: " + computerScore + " Draws= " + drawScore);
        if (humanScore > computerScore) {
            System.out.println("Congratulations! You win!");
        } else if (computerScore > humanScore) {
            System.out.println("Computer wins! Better luck next time.");
        } else {
            System.out.println("It's a draw!");
        }
    }
    public int getHumanScore() { 
        return humanScore; 
    }
    public int getComputerScore() { 
        return computerScore; 
    }
    public int getDrawScore() { 
        return drawScore; 
    }    
}
