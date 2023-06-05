package lp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import lp.model.LpModel;

public class LpDAO {

	
	
	public static java.sql.Connection getConexaoMySQL() {
		 
        Connection connection = null;          //atributo do tipo Connection
 
  
 
	try {
	 
		// Carregando o JDBC Driver padrão
		 
		String driverName = "com.mysql.jdbc.Driver";                        
		 
		Class.forName(driverName);
 
  
 
		// Configurando a nossa conexão com um banco de dados//
 
        String serverName = "localhost";    //caminho do servidor do BD
 
        String mydatabase = "aula";        //nome do seu banco de dados
 
        String url = "jdbc:mysql://" + serverName + "/" + mydatabase;
 
        String username = "root";        //nome de um usuário de seu BD      
 
        String password = "root";      //sua senha de acesso
 
        connection = DriverManager.getConnection(url, username, password);
 
 
 
        //Testa sua conexão//  
 
        if (connection != null) {
 
            System.out.println("STATUS--->Conectado com sucesso!");
 
        } else {
 
            System.out.println("STATUS--->Não foi possivel realizar conexão");
 
        }
 
 
 
        return connection;
 
  
 
        } catch (Exception e) {  
 
  
        	e.printStackTrace();
 
            return null;
 
        } 
 
  
 
    }

	
	
	public void inserir (LpModel lpModel)  throws SQLException{
		Connection connection = getConexaoMySQL();
	
	    PreparedStatement statement = null;
	
	        
	    String inserir = "Insert into aula.lp(ano,cantor,nome) values (?,?,?)";
	        
	        
	    
	    statement = connection.prepareStatement(inserir);
	    statement.setInt(1, lpModel.getAno());
	    statement.setString(2, lpModel.getCantor());
	    statement.setString(3, lpModel.getNome());
	    
	    
	    statement.execute();
	
	    statement.close();    
	      
	    connection.close();
	}

	
	
}
