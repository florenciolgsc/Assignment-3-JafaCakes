import java.util.Random;

//represents the computer player in the game, which randomly selects a choice of rock, paper, or scissors
public class ComputerPlayer extends Player {
    private Random random;

    public ComputerPlayer(String name) {
        super(name);
        this.random = new Random();
    }
//randomnly selects a choice of rock, paper, or scissors for the computer player
    @Override
    public UserChoice getUserChoice() {
        UserChoice[] choices = UserChoice.values();
        int index = random.nextInt(choices.length);
        return choices[index];
    }





}

    

