package test;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@SuppressWarnings("serial")
@WebServlet("/register")
public class RegServlet  extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		BeanClass bc=new BeanClass();
		bc.setUserName(req.getParameter("name"));
		bc.setPassWord(req.getParameter("pword"));
		int k= new UserDAO().insert(bc);
		if(k>0)
		{
			RequestDispatcher rd=req.getRequestDispatcher("login.jsp");
			rd.forward(req, res);
		}
		
	}
	

}
