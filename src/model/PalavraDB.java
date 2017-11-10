package model;

import java.sql.ResultSet;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class PalavraDB {
	 static public synchronized String qPalavra(String palavra, String de, String para){
		String Traduz= null;
		try{  
			ConexaoDB conb = new ConexaoDB();
			conb.iniciaDb();
			Connection con = conb.getConexao();
			
			String sql;
			if(de.equals("portugues")){
				sql = "SELECT * from portugues WHERE palavra=?";
				
			}
			else{
				sql = "SELECT * from coreano WHERE palavra=?";
			}
			PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
			ps.setString(1,palavra);
			ResultSet res =  (ResultSet) ps.executeQuery();
			int id=0;
			
			while(res.next()){
				System.out.println(res.getString("palavra"));
				id = res.getInt("codPalavra");
			}
			
		
	
			if(para.equals("coreano")) {
				System.out.println("Traduzindo de pt para ko");
				   PreparedStatement ko = (PreparedStatement) con.prepareStatement("SELECT * FROM traducao INNER JOIN coreano ON coreano.codPalavra=traducao.codCoreano AND traducao.codPortugues=?");
				   ko.setInt(1, id);
				   
				   ResultSet resT2 =  (ResultSet) ko.executeQuery();	

				   while(resT2.next()){
					  Traduz = resT2.getString("palavra");
				   }
			   }
			   else {
				   System.out.println("Traduzindo de ko para pt");
				   PreparedStatement pt = (PreparedStatement) con.prepareStatement("SELECT * FROM traducao INNER JOIN  portugues ON portugues.codPalavra=traducao.codPortugues AND traducao.codCoreano=?");
				   pt.setInt(1, id);
			
				   ResultSet resT2 =  (ResultSet) pt.executeQuery();	   
				   while(resT2.next()){
					  Traduz = resT2.getString("palavra");
					  
				   }  
			   }

			   ps.close();
			   con.close();
			   conb.fechaBd();
		}
		catch(Exception e){
		Traduz = null;
		}
		return Traduz;

	}
}
