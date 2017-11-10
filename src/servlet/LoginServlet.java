package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;

import model.UsuarioDB;

import objeto.Usuario;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
   
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("AQUIIIIIIII");
		String login = (String)request.getParameter("login");
		String senha = (String)request.getParameter("senha");
		System.out.println(login);		
		System.out.println(senha);	
		Usuario usu = new Usuario(); 	
		
		usu = UsuarioDB.validaLogin(login, senha);	
		
		if(usu == null){ 
			
			response.sendRedirect("paginas/login.jsp");
		}
		else{
			response.sendRedirect("index.jsp");
		}		
	}
}
