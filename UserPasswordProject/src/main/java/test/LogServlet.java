package test;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/login")
@SuppressWarnings("serial")
public class LogServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		BeanClass bc=new BeanClass();
		bc.setUserName(req.getParameter("name"));
		bc.setPassWord(req.getParameter("uword"));
		int k=new LoginDAO().insert(bc);
		if(k>0)
		{
			RequestDispatcher rd=req.getRequestDispatcher("login.jsp");
			rd.forward(req, res);
		}
	}

}
