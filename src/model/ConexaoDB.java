package model;

import java.sql.DriverManager;

import com.mysql.jdbc.Connection;

public class ConexaoDB {
private Connection con;
	
	public void iniciaDb()
	{	try
	      {	
		    String database = "jdbc:mysql://127.0.0.1/palavras";
		    String usuario = "root";
			String senha = "vertrigo";		
	        Class.forName("com.mysql.jdbc.Driver"); 
	        con = (Connection) DriverManager.getConnection( database, usuario, senha );
	        System.out.println("Conectado");
		}
	 catch ( Exception e ) {
         e.printStackTrace();
     }		
	}
public void fechaBd()
	{	try
		{	con.close();
		}
	 catch ( Exception e ) {
         e.printStackTrace();
     }
	}	
	public Connection getConexao()
	{	
		return con;		
	}
}
