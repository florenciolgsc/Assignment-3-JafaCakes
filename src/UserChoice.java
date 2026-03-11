public enum UserChoice {
    ROCK,
    PAPER,
    SCISSORS;

//// Method to display the name of the choice in a user-friendly format with first letter capitalized
    public String displayName() {
        String name = this.name();
        return name.charAt(0) + name.substring(1).toLowerCase();
    }


    
}
