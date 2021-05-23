package self.practice.javalearn;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServelet extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
	{
		int i1= Integer.parseInt(req.getParameter("num1"));
		int i2= Integer.parseInt(req.getParameter("num2"));
		int k = i1+i2;
		
//		PrintWriter out=res.getWriter();
//		out.println("result is: "+ k);
		
		// request dispatcher and redirect
		
		req.setAttribute("k", k);
		
		RequestDispatcher rd = req.getRequestDispatcher("sq");
		rd.forward(req, res);
	}

}
