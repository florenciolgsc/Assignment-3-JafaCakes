
public abstract class Player {
    String name;
///the constructor initializes the player's name, and there is an abstract method getUserChoice that must be implemented by subclasses to return the player's choice of rock, paper, or scissors.
    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract UserChoice getUserChoice();
    
}
