package lp.negocio;

import java.sql.SQLException;

import lp.dao.LpDAO;
import lp.model.LpModel;

public class LpRN {

	private static LpDAO lpDao = new LpDAO();
	
	
	public void inserirLp(LpModel lpModel) throws SQLException {
		lpDao.inserir(lpModel);
	}
	
	
	
	
}
