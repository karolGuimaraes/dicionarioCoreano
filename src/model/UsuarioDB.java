package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import objeto.Usuario;


public class UsuarioDB {
	static  public synchronized Usuario validaLogin(String login, String senha){
		Usuario user = new Usuario();
		try
		{
			ConexaoDB co = new ConexaoDB();
			co.iniciaDb();
			Connection c = co.getConexao();
			
			PreparedStatement ps = (PreparedStatement) c.prepareStatement("SELECT * from usuario where login =? and senha =?"); 
			
			ps.setString(1,login);
			ps.setString(2,senha);
			ResultSet res =  (ResultSet) ps.executeQuery();
			 
			res.next();
			   
			String loginBd;
			String senhaBd;
			   
			loginBd =  res.getString("login");
			senhaBd =  res.getString("senha");
			
			   
			if((loginBd.equals(login)) && (senhaBd.equals(senha))){
				
				user.setLogin(loginBd);
				user.setSenha(senhaBd);
			}  
			else{
				user = null; 
			}
			ps.close();
			c.close();
			co.fechaBd();
		}
		catch(Exception e){
			user = null;
		}	
		return user;
	}
}
