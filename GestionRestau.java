package mainClient;

import java.awt.image.RescaleOp;
import java.io.Serializable;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;



public class GestionRestau implements Serializable {
	public int id;
	public int note;
	ResultSet res;
	 Statement statement=null;
	public GestionRestau(int id,int note){
		this.id=id;
		this.note=note;
	}
	public void Notenouriture(int id,int ajnote) throws SQLException{
		
	ResultSet res=statement.executeQuery("select* from compte where id='"+id+"'");
	int note1 = 0;
	while(res.next()){
		  note1=res.getInt("NoteClient");
		  System.out.println(note1);
		  
	  }
		 

	}
	
	public void Noteservice(int id,int ajnote) throws SQLException{
		
		ResultSet res=statement.executeQuery("select* from compte where id='"+id+"'");
		int note2 = 0;
		while(res.next()){
			  note2=res.getInt("NoteClient");
			  System.out.println(note2);
			  
		  }
			 

		}
	public void Notesalle(int id,int ajnote) throws SQLException{
		
		ResultSet res=statement.executeQuery("select* from compte where id='"+id+"'");
		int note3 = 0;
		while(res.next()){
			  note3=res.getInt("NoteClient");
			  System.out.println(note3);
			  
		  }
			 

		}
	}


