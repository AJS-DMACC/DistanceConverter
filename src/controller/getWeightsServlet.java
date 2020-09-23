package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.BMIConverter;;

/**
 * Servlet implementation class getWeightsServlet 
 */
@WebServlet("/getWeightsServlet")
public class getWeightsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getWeightsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userWeight = request.getParameter("userPounds"); 
		String userInches = request.getParameter("userInches");
		BMIConverter userBMI = new BMIConverter(Float.parseFloat(userWeight),Float.parseFloat(userInches));
		request.setAttribute("userWeights", userBMI);
		getServletContext().getRequestDispatcher("/weightResult.jsp").forward(request, response);
	}

}
