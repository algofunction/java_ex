public class tab_max
{public static void main (String[]args)
 {int N;
  int[]tab;
  int i;
  int max;
  int compt;
  int total; 

  System.out.print("Donner la taille du tableau : ");
  N=Lire.i();
  tab=new int[N];

  System.out.println(" ");

  for(i=0;i<N;i++)
   {System.out.print("Donner le nombre numero "+(i+1)+" : ");
    tab[i]=Lire.i();}

  max=tab[0];
  for(i=1;i<N;i++)
   {if(tab[i]>max) max=tab[i];}

  System.out.println(" ");

  System.out.println("Le maximum vaut : "+max);

  compt=0;
  for(i=0;i<N;i++) {if(tab[i]==max) compt=compt+1;}

  System.out.println(" ");

  System.out.println("Le maximum est atteint "+compt+" fois ");
  System.out.println("Les indices des valeurs egales au maximum sont : ");
  for(i=0;i<N;i++) {if(tab[i]==max) System.out.println(i);}

  System.out.println(" ");

  total=0;
  for(i=0;i<N;i++) {total=total+tab[i];}
  System.out.println("La moyenne vaut : "+(total*1.0)/N);
 }
}
