//If rules change, this class can be changed accordingly without messing up Game class -> Encapsulation


public class Rules {
    public static final int P1_WINS = 1;
    public static final int P2_WINS = 2;
    public static final int DRAW = 0;


    //return who will win based on the choices of the players
    public int determineWinner(UserChoice p1Choice, UserChoice p2Choice) {
        if (p1Choice == p2Choice) {
            return DRAW;
        } else if ((p1Choice == UserChoice.ROCK && p2Choice == UserChoice.SCISSORS) ||
                   (p1Choice == UserChoice.PAPER && p2Choice == UserChoice.ROCK) ||
                   (p1Choice == UserChoice.SCISSORS && p2Choice == UserChoice.PAPER)) {
            return P1_WINS;
        } else {
            return P2_WINS;
        }
    }
    
}
