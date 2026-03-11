public class Main {
    ///the main method initializes the human player and computer player, creates a new game instance with these players, and starts the game by calling the play method.
    public static void main(String[] args) {
        Player human = new HumanPlayer("Human");
        Player computer = new ComputerPlayer("Computer");

        Game game = new Game(human, computer);
        game.play();
    }
    }
