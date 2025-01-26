// factorielle qui s'applique à un entier 
static int fact(int n) {
  if (n<0) return -1;
  if (n>12) return -2;
  if (n<2) return 1;
  return n*fact(n-1);
}
