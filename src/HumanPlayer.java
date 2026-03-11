import java.util.Scanner;
///represents the human player in the game, which prompts the user to input their choice of rock, paper, or scissors
public class HumanPlayer extends Player {
        private Scanner scanner;

        public HumanPlayer(String name) {
            super(name);
            scanner = new Scanner(System.in);
        }
///prompts the user to input their choice of rock, paper, or scissors, validates the input, and returns the corresponding UserChoice enum value based on the user's selection.
        @Override
        public UserChoice getUserChoice() {
            int input = 0;

            while (input < 1 || input > 3) {
                System.out.println("Choose (1=rock, 2=paper, 3=scissors): ");
                if (scanner.hasNextInt()) {
                    input = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    if (input < 1 || input > 3) {
                        System.out.println("Invalid choice. Please enter a number between 1 and 3.");
                    }
                }
                    else {
                        System.out.println("Invalid input. Please enter a number between 1 and 3.");
                        scanner.nextLine(); // Consume the invalid input
                    }
                } return UserChoice.values()[input - 1];
            }
        }
        
        



    
           
        
    


