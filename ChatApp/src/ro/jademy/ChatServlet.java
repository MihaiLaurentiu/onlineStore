package ro.jademy;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ChatServlet
 */
@WebServlet(urlPatterns = { "/ChatServlet" }, initParams = {
		@WebInitParam(name = "numeUtilizator", value = "anonim", description = "valoare implicita utilizator neautentificat") })
public class ChatServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ChatServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		if (request.getParameter("numeUtilizator") == null || request.getParameter("numeUtilizator").length() == 0) {
			response.sendRedirect("Autentificare.jsp");
		} else {
		HttpSession session = request.getSession();
		session.setAttribute("numeUtilizator", request.getParameter("numeUtilizator"));
		session.setMaxInactiveInterval(5 * 60);
		response.sendRedirect("Chat.jsp");

    
/*		response.getWriter().append("Nume utilizator:").append(request.getParameter("numeUtilizator"));

		response.getWriter().append("Acum am nume utilizator pe server:")
				.append(session.getAttribute("numeUtilizator").toString());*/

	}
	}
}
