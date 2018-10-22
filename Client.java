
package Web;

import java.util.Scanner;


public class Client {
    private String nom;
    private String prenom;
    private int NoteNouriture;
     private int NoteSalle ;
     public int NoteService;
	public Client(){}
		public Client(String nom,String prenom, int NoteService,int NoteSalle,int NoteNouriture)
		  {
			 this.nom=nom;
			 this.prenom=prenom;
			 this.NoteNouriture=NoteNouriture;
                         this.NoteSalle=NoteSalle;
                         this.NoteService=NoteService;
			 
		  }
           
                /*  Scanner sc = new Scanner(System.in);
           System.out.println("saisire NoteNouriture1 ");
    int NoteNouriture1 = sc.nextInt();
         if(NoteNouriture1<=20){
          System.out.println("saisire NoteSalle1");
            int NoteSalle1 = sc.nextInt();
                if(NoteSalle1<=20){
                    System.out.println("saisire NoteService1");
                    int NoteService1 = sc.nextInt();
                         if(NoteService1<=20){
                         System.out.println(Métier.CalculerMoyenne.moyenne(m));
                        
                    }
                    else {
                                System.out.println("saisir a nouveau)");
                              
                                }
               
                        
                    }      
                else{
                        System.out.println("saisir a nouveau)");}
                    
                }
            else {
    System.out.println("saisir a nouveau)");
}
        */  


    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

   public int getNoteNouriture() {
        return NoteNouriture;
    }

    public int getNoteSalle() {
        return NoteSalle;
    }

    public int getNoteService() {
        return NoteService;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

 public void setNoteNouriture(int NoteNouriture) {
        this.NoteNouriture = NoteNouriture;
    }

    public void setNoteSalle(int NoteSalle) {
        this.NoteSalle = NoteSalle;
    }

    public void setNoteService(int NoteService) {
        this.NoteService = NoteService;

                

}}