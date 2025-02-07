// définir une fonction qui s'applique à un tableau et renvoyant en résultat une copie du tableau, en utilisant une boucle de parcours.

static int[] cptab(int[] tab) {
    // Déclaration et initialisation d'un tableau `resultat` de la même longueur que le tableau `tab`.
    int[] resultat = new int[tab.length];
    
    // Boucle pour parcourir chaque élément du tableau d'entrée `tab`.
    for (int i = 0; i < tab.length; i++) {
        // Copier l'élément correspondant de `tab` dans le tableau `resultat`.
        resultat[i] = tab[i];
    }
    
    // Retourner le tableau `resultat`, qui est une copie exacte de `tab`.
    return resultat;
}
