import java.util.Scanner;

public class DureeEnHeuresMinutes {
    public static void main(String[] args) {
        try (// Création d'un scanner pour lire les entrées clavier
        Scanner scanner = new Scanner(System.in)) {
            // Demander à l'utilisateur d'entrer une durée en minutes
            System.out.print("Veuillez entrer une durée en minutes : ");

            // Lecture de l'entrée utilisateur sous forme d'entier
            int dureeMinutes = scanner.nextInt();

            // Calcul du nombre d'heures (division entière par 60)
            int heures = dureeMinutes / 60;

            // Calcul du nombre de minutes restantes (opérateur modulo %)
            int minutesRestantes = dureeMinutes % 60;

            // Affichage du résultat à l'utilisateur
            System.out.println(dureeMinutes + " minutes correspond à " + heures + " heure(s) et " + minutesRestantes + " minute(s).");

            // Fermeture du scanner
            scanner.close();
        }
    }
}
