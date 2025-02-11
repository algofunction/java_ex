/*Définition d'une méthode statique qui extrait tous les nombres pairs 
d'un tableau 2D d'entiers (int[][]) et retourne un tableau 1D (int[]).*/
static int[] extrairePairs(int[][] tab) {
    // Création d'un tableau temporaire pour stocker tous les nombres pairs.
    // Sa taille maximale est le nombre total d'éléments dans le tableau 2D.
    int[] preResultat = new int[tab.length * tab[0].length];

    // Compteur pour suivre le nombre de nombres pairs trouvés.
    int nbPairs = 0;

    // Parcours de chaque ligne du tableau 2D.
    for (int[] ligne : tab) 
        // Parcours de chaque élément de la ligne.
        for (int n : ligne) 
            // Vérifie si l'élément est pair.
            if (n % 2 == 0) 
                // Si oui, ajoute l'élément au tableau temporaire
                // et incrémente le compteur.
                preResultat[nbPairs++] = n;

    // Retourne un tableau contenant uniquement les nombres pairs,
    // en copiant les éléments pertinents du tableau temporaire.
    return Arrays.copyOf(preResultat, nbPairs);
}
