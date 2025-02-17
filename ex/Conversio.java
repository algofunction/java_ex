// Docu Scanner : https://docs.oracle.com/javase/8/docs/api/java/util/Scanner.html
import java.util.Scanner; // Importation de la classe Scanner

public class Conversio {
    public static void main(String[] args) {
        double euros;
        double dollars;
        
        // Création du type de classe Scanner et de la variable, création d'une instance de la classe Scanner via le constructeur Scanner(System.in) initialise l'objet  en lui passant en source, l'entrée standard
        Scanner scanner = new Scanner(System.in);
        // Display the message "Somme en euros?"  
        System.out.println("Somme en euros? ");
        euros = scanner.nextDouble(); // Lire un nombre décimal saisi par l'utilisateur
        
        dollars = euros * 1.118; // Conversion en dollars
        
        System.out.println("La somme en dollars: ");
        System.out.println(dollars);
        
        scanner.close(); // Fermeture du Scanner pour libérer les ressources
    }
}

/* Define Conversio class {
    Define main method 
        Define a float euros;
        Define a float dollars;
        

**/
