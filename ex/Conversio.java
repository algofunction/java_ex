
import java.util.Scanner; // Importation de la classe Scanner

public class Conversio {
    public static void main(String[] args) {
        double euros;
        double dollars;
        
        // Création d'un objet Scanner pour lire les entrées de l'utilisateur
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Somme en euros? ");
        euros = scanner.nextDouble(); // Lire un nombre décimal saisi par l'utilisateur
        
        dollars = euros * 1.118; // Conversion en dollars
        
        System.out.println("La somme en dollars: ");
        System.out.println(dollars);
        
        scanner.close(); // Fermeture du Scanner pour libérer les ressources
    }
}
