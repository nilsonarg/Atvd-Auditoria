package aluno.negocio;

import java.sql.SQLException;

import aluno.dao.AlunoDAO;
import aluno.model.AlunoModel;

public class AlunoRN {


	AlunoDAO alunoDao = new AlunoDAO();



	public AlunoRN() {

	}


	public void inserir (AlunoModel model) throws SQLException {

		alunoDao.inserir(model);	

	}





}
