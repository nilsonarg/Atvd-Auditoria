package aluno;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import aluno.model.AlunoModel;
import aluno.negocio.AlunoRN;

/**
 * Servlet implementation class InserirAlunoServlet
 */

public class InserirAlunoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InserirAlunoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nome");
		String endereco = request.getParameter("endereco");
		Integer codigo = Integer.parseInt(request.getParameter("codigo"));
		
		//Preenchendo o model do tipo da entidade a ser trabalhada
		AlunoModel nvModel = new AlunoModel(nome,endereco, codigo); 
		
		//Instanciar um objeto do tipo JavaBean que representa a tabela (ou entidade) e preencher os atributos dessa classe 
		
		try{ 
			
			//Passando como parâmetro o model preenchido, ao invés de parâmetros soltos
			AlunoRN alunoRN = new AlunoRN();
			alunoRN.inserir(nvModel);
			
		} catch(SQLException ex){
			ex.printStackTrace();
			
			response.getOutputStream().println("Ops.... aconteceu um erro na inclusão!");
		}
		
		response.sendRedirect("/ExemploBancoMysql/Resposta.jsp");
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
