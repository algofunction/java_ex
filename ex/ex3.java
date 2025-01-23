/*fonction sur un double indique si val est entiere*/

//brouillon def entier {}

static boolean estEntier(double d){
  int partieEntiere = (int) d;
  if (partieEntiere == d) return true;
  return false;
}

/* Optimisation :
static boolean estEntier(double d) {
    return d == (int) d;
}
*/
