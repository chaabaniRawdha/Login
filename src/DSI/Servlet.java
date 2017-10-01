package DSI;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet
 */
@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	/*	response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String nomSaisi = request.getParameter("nom");
		out.println("");
		if(nomSaisi==null)
		out.println("il manque le parametre nom");
		else
			out.println("bonjour   " + nomSaisi + "!");
		out.println("");*/
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	RequestDispatcher rd=null;
	String login=request.getParameter("login");
	String pw=request.getParameter("password");
	if(login.equals("") || pw.equals(""))
	{
		request.setAttribute("erreur", "champs obligatoires");
		rd=request.getRequestDispatcher("/Home.jsp");
		rd.forward(request, response);
		}
	else
	{
		request.setAttribute("login",login);
		request.setAttribute("pw",pw);
		rd=request.getRequestDispatcher("/accueil.jsp");
		rd.forward(request, response);}
	doGet(request,response);
	
		
	}

}
