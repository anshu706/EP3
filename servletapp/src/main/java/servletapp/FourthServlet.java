package servletapp;

import java.io.IOException;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/fourth")
public class FourthServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		System.out.println("This is Fourth Servlet");
		
		// CONTEXT
//		ServletContext ctx = getServletContext();
//		System.out.println(ctx.getAttribute("uni"));
		
		// SESSION
		HttpSession ss = req.getSession();
		System.out.println(ss.getAttribute("username"));
	}
}
