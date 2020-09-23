package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DistConverter;

/**
 * Servlet implementation class getDistancesServlet
 */
@WebServlet("/getDistancesServlet")
public class getDistancesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getDistancesServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userFeet = request.getParameter("userFeet"); 
		String userInches = request.getParameter("userInches");
		DistConverter userInput = new DistConverter(Integer.parseInt(userFeet), Integer.parseInt(userInches));
		//PrintWriter writer = response.getWriter();
		request.setAttribute("userDistValues", userInput);
		getServletContext().getRequestDispatcher("/distResult.jsp").forward(request, response);
		//writer.println(userInput.toString());
		
		//writer.close();
	}

}
