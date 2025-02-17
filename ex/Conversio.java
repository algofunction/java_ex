// Docu Scanner : https://docs.oracle.com/javase/8/docs/api/java/util/Scanner.html
import java.util.Scanner; // Library Import 

// Define Conversio class
public class Conversio {
    // Define main method
    public static void main(String[] args) {
        double euros;
        double dollars;
        // Creation of the Scanner class type and the variable, creating an instance of the Scanner class using the Scanner(System.in) constructor initializes the object by providing the standard input as its source.
        Scanner scanner = new Scanner(System.in);
        // Display the message "Somme en euros?"  
        System.out.println("Somme en euros? ");
        euros = scanner.nextDouble(); // Read a decimal number entered by the user.
        
        dollars = euros * 1.118; // Convert into dollar
        
        System.out.println("La somme en dollars: ");
        System.out.println(dollars);
        
        scanner.close(); // Closing the Scanner to release resources
    }
}
