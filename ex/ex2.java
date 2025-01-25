// fonction ordered envoie un booléen qui indique si 3 valeurs sont triées par ordre croissant


static boolean ordered (int a, int b, int c){
  if (a<=b && b<=c) 
    return true;
  return false;
}


/*3 bugs : static boolean ordered (int a, int b, int c){
  if (a >= b >= c); 
    return true;
  return false;
}*/
