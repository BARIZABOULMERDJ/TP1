package mainClient;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Random;

public class ClientRestau implements Serializable {

	int  identifiantClient;
	Socket socket;
	ObjectInputStream oos;
	 ObjectOutputStream ois;

	public ClientRestau() throws UnknownHostException, IOException{
		Random random = new Random();
		   identifiantClient = random.nextInt(100);
		   
		
	}
	public void Connexion(){
		try {
			
			 
			 socket = new Socket("localhost", 7877);
			 
PrintWriter writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())), true);
BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
String requete = "je suis le client N° " + identifiantClient+" : Ma note est : \nEND";
			writer.println(requete);
			String response = "";
			while (true) {
				String line = reader.readLine();
				if (line == null || line.equals("END")) {
					break; 				}
				if (!response.equals("")) {
					response += "/n"; 				}
				response += line; 			}
		} catch (Exception e) {e.printStackTrace(); 		} 
	
	}public void Deconnexion() throws IOException{
		
		socket.close();
		ois.close();
		oos.close();
		System.out.println("client"+identifiantClient+"Deconnecter");
		
	}	
	}