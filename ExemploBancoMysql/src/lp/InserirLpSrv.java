package lp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lp.model.LpModel;
import lp.negocio.LpRN;

/**
 * Servlet implementation class InserirLpSrv
 */

public class InserirLpSrv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InserirLpSrv() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		String nome = request.getParameter("nome");
		int ano = Integer.valueOf(request.getParameter("ano")).intValue();
		String cantor = request.getParameter("cantor");
		
		
		LpModel lpModel = new LpModel(nome,cantor,ano);

		LpRN lpRn = new LpRN();
		
		try {

			lpRn.inserirLp(lpModel);

		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		
		
		
	}

}
