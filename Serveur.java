package mainServer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
public class Serveur {
	public static void main(String args[]) throws Exception {
		
		
		try {	
			ServerSocket serverSocket = new ServerSocket(7877);
			while(true){
			Socket socket = serverSocket.accept();
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())), true);
			String requete = "";
			while (true) {
				String line = reader.readLine();
				if (line == null || line.equals("END"))
					break;
				if (!requete.equals("")) {
					requete += "/n";    }
				requete += line; 		}
			String response = "Réponse du serveur ok \nEND";
			writer.println(response);
		     Connexion c=new Connexion();
		     Thread t=new Thread();
		     t.start();
		}} catch (Exception e) {
			e.printStackTrace(); 		} 	} }

