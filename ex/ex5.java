// fonction maxtab à un tableau d'entiers non vide, renvoyant en resultat la plus grande valeur du tableau
static int maxtab(int[] tab) {
  int resultat = tab[0];
  for (int i=1; i<tab.length; i++)
    if(tab[i]>resultat) resultat = tab[i];
  return resultat;
}
