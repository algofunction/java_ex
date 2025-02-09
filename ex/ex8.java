// définir une fonction qui s'applique à un tableau à deux dimensions et renvoyant en résultat une copie du tableau, en utilisant une boucle de parcours.
// Déclaration d'une méthode statique prenant un tableau 2D en entrée et retournant une copie de celui-ci.
static int[][] cptab2dim(int[][] tab) {
  // Création d'un tableau 2D de même taille que le tableau d'entrée.
  int[][] resultat = new int[tab.length][tab[0].length];

  // Parcours des lignes du tableau d'entrée.
  for (int i = 0; i < tab.length; i++) {
    // Parcours des colonnes de la ligne courante.
    for (int j = 0; j < tab[i].length; j++) {
      // Copie de l'élément à la position (i, j) dans le tableau résultant.
      resultat[i][j] = tab[i][j];
    }
  }

  // Retourne le tableau résultant, qui est une copie du tableau d'entrée.
  return resultat;
}

  
