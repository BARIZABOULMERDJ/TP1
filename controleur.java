package Web;

import Métier.CalculerMoyenne;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Web.Client;
import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;

/**
 * Servlet implementation class controleur
 */
@WebServlet("/controleur")
public class controleur extends HttpServlet {
	private CalculerMoyenne Métier;
       
    /**
     * @see HttpServlet#HttpServlet()
     * 
     */
        @Override
        public void init()throws  ServletException {
            Métier= new CalculerMoyenne () ;
        }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp); //To change body of generated methods, choose Tools | Templateeption, IOException {
        super.doPost(req, resp); //To change body of generated methods, choose Tools | Templates.
        {
        
	// Etape 1 : Récupération des paramètres de la requête
            int NoteNouriture =Integer.parseInt( req.getParameter("NoteNouriture"));
            int NoteSalle =Integer.parseInt(req.getParameter("NoteSalle"));
            int NoteService =Integer.parseInt(req.getParameter("NoteService"));
            doGet(req,resp);
            // Etape 2 : Soumettre les paramètres de la requête à la couche service et récupérer résultat
	
          Client c  =new Client();
          
           c.setNoteNouriture(NoteNouriture);
           c.setNoteSalle(NoteSalle);
            c.setNoteService(NoteService);
  	HttpSession maSession = req.getSession();
        maSession.setAttribute("moy",c);
        
        
	// Etape 3 : Réponse à l'utilisateur
        	RequestDispatcher   dispatcher = req.getRequestDispatcher("acceuil.jsp");
	dispatcher.forward(req, resp);
         
}
    }
    


}
    
    
		