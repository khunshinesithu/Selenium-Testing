import java.util.Scanner;

// Class name: noun + type
public class VoterEligibilityProgram {

    // Constant: noun (capitalized)
    private static final String INPUT_MESSAGE = "Please enter your age:";
    private static final String ERROR_MESSAGE = "Invalid input! Please enter a valid age."; 
    private static final int VOTING_AGE = 18;

    public static void main(String[] args) {

        // Variable: adjective + noun
        Scanner inputScanner = new Scanner(System.in); 

        System.out.println(INPUT_MESSAGE);
        try {
            // Variable: adjective + noun
            int userAge = inputScanner.nextInt(); 

            // Function: verb + object
            checkVotingEligibility(userAge);

        } catch (Exception inputException) { // Error handling
            System.out.println(ERROR_MESSAGE);
        } finally {
            inputScanner.close();
        }
    }

    // Function: verb + object
    public static void checkVotingEligibility(int inputAge) { 
        
        // Boolean: verb + noun + adjective
        boolean canUserVote = inputAge >= VOTING_AGE; 

        if (canUserVote) {
            System.out.println("You are eligible to vote!");
        } else if (inputAge > 0) {
            System.out.println("You are not eligible to vote yet.");
        } else {
            System.out.println("Age must be positive.");
        }
    }
}