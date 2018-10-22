
package Métier;


public class CalculerMoyenne {
        int [] TableauNote = new int [3];
        int[] TableauMoy =new int[5];
    void recus() {
        
    for (int i=0; i<=3; i++)
      {if (TableauNote[i]>3)
	System.out.println(TableauNote[i]);
	}
    
    }
   public void  moyenne() {
   float m = 0;
   for (int i=0; i<=3; i++)
     {m= m+TableauNote[i];}
   m = m/3;
  //System.out.println(TableauNote[m]);
   
   
   
   }
   public void MoyenneGenerale(){
       float moy =0;
       int n =5;
       for (int j=0;j<=n;j++){
           moy=moy+TableauMoy[j];
           moy=moy/n;
           System.out.println("Métier.CalculerMoyenne.MoyenneGenerale(moy)");
           
           
       }
   }

    public static void trier(char[] tableau) {
		int i, j, cle;
		
		for (i = 1; i < tableau.length; i++) {
			cle = tableau[i];
			j = i;
			while ((j >= 1) && (tableau[j - 1] > cle)) {
				tableau[j]  = tableau[j - 1] ;
				j = j - 1;
			}
			tableau[j] = (char) cle;
		}
	}
	
	public static void afficher(char[] tableau) {
		for (char valeur : tableau) System.out.print(valeur + " ");
		System.out.println();
	}

    
}
    

