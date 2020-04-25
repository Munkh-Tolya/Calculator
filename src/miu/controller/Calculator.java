package miu.controller;

import miu.model.Result;
import miu.service.CalculatorService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class MyServletParm
 */
public class Calculator extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CalculatorService calculatorService;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Calculator() {
        super();
        
    }

	@Override
	public void init() throws ServletException {
		super.init();
		calculatorService = new CalculatorService();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String add1 = request.getParameter("add1").trim();
		String add2 = request.getParameter("add2").trim();
		String mult1 = request.getParameter("mult1").trim();
		String mult2 = request.getParameter("mult2").trim();

		int a1=0,a2=0,m1=0,m2=0;

		// Check for valid inputs....
		try {
			a1 = Integer.parseInt(add1);
			a2 = Integer.parseInt(add2);
		} catch(NumberFormatException e) {}

		try {
			m1 = Integer.parseInt(mult1);
			m2 = Integer.parseInt(mult2);
		} catch(NumberFormatException e) {}

		Result  result = new Result(a1,a2,m1,m2);
		calculatorService.calculateProduct(result);
		calculatorService.calculateSum(result);
		request.setAttribute("Result",result);
		request.getRequestDispatcher("WEB-INF/views/result.jsp").forward(request, response);
	}

}
