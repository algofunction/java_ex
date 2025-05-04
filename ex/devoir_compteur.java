public class devoir_compteur {
    public static void main(String[] arg) {
        char choix = 'N';
        int somme = 0;
        double moy;
        int valeur_entier_0_50;
        int compt_entier_0_50 = 1;
        int compt_entier_10_40 = 0;


        do {
            System.out.print("Donner la valeur (entre 0 et 50) de l'entier numero " + compt_entier_0_50 + " : ");
            valeur_entier_0_50 = Lire.i();

            if (valeur_entier_0_50 < 0 || valeur_entier_0_50 > 50) {
                System.out.println("La valeur doit se situer entre 0 et 50");
                continue;
            }

            if (valeur_entier_0_50 >= 10 && valeur_entier_0_50 <= 40) {
            	compt_entier_10_40++;
            }

            somme = somme + valeur_entier_0_50;
            moy = (double) somme / compt_entier_0_50;
            
            if (compt_entier_0_50 == 1) {
                System.out.format("La valeur %d vaut %d \n", compt_entier_0_50, somme);
            }

            if (compt_entier_0_50 >= 2) {
                System.out.format("La moyenne des %d valeurs vaut %.1f et leur somme vaut %d \n", compt_entier_0_50, moy, somme);
            }

            System.out.print("Voulez-vous enregistrer un autre entier (O/N)? ");
            choix = Lire.c();

            if (choix == 'O') {
            	compt_entier_0_50 = compt_entier_0_50 + 1;
            }
        } while (choix == 'O');

        System.out.format("Il y a %d entier(s) compris entre 10 et 40 \n", compt_entier_10_40);
        System.out.print("FIN DU PROGRAMME");
    }
}
