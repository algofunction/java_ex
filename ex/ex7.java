// définir une fonction qui s'applique à un tableau et renvoyant en résultat une copie du tableau, en utilisant une boucle de parcours.
static int[] cptab(int[] tab) {
	int[] resultat = new int[tab.length];
	for(int i=0; i<tab.length; i++)
		resultat[i] = tab[i];
	return resultat;
}
