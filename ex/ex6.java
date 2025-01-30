static void inverse(int[] tab){
  for (int i = 0; i < tab.length / 2; i++){
    int swap = tab[i];
    tab[i] = tab[tab.length - 1 - i];
    tab[tab.length - 1 - i] = swap;
  }
}
