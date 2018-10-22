
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class database {
    



		public Connection getConnection() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException{
			
			Connection connexion = null;
			
			//Sauvgarder l'url de la base de donnée dans un string
			String url = "jdbc:mysql://localhost:3306/tp1";
			
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			
			//inserer l'url, nom d'utilisateur et le mot de passe pour la base de donnée créer
			connexion = DriverManager.getConnection(url,"root","");
			
			return connexion;
		}

}
    

