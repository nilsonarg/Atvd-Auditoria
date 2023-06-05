package aluno.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import aluno.model.AlunoModel;

public class AlunoDAO   {

	
	
	public AlunoDAO() {
		
	}
	
	
	public static java.sql.Connection getConexaoMySQL() {
		 
        Connection connection = null;          //atributo do tipo Connection
 
  
 
	try {
	 
		// Carregando o JDBC Driver padr�o
		 
		String driverName = "com.mysql.jdbc.Driver";                        
		 
		Class.forName(driverName);
 
  
 
		// Configurando a nossa conex�o com um banco de dados//
 
        String serverName = "localhost";    //caminho do servidor do BD
 
        String mydatabase = "aluno";        //nome do seu banco de dados
 
        String url = "jdbc:mysql://" + serverName + "/" + mydatabase;
 
        String username = "root";        //nome de um usu�rio de seu BD      
 
        String password = "root";      //sua senha de acesso
 
        connection = DriverManager.getConnection(url, username, password);
 
 
 
        //Testa sua conex�o//  
 
        if (connection != null) {
 
            System.out.println("STATUS--->Conectado com sucesso!");
 
        } else {
 
            System.out.println("STATUS--->N�o foi possivel realizar conex�o");
 
        }
 
 
 
        return connection;
 
  
 
        } catch (Exception e) {  
 
  
        	e.printStackTrace();
 
            return null;
 
        } 
 
  
 
    }

	
	
	public void inserir (AlunoModel model)  throws SQLException{
		Connection connection = getConexaoMySQL();
	
	    Statement statement = connection.createStatement();
	
	        
	    String inserir = "Insert into aluno.usuario values ("+model.getCodigo()+",'"+model.getNome()+"','"+model.getEndereco()+"')";
	        
	        
	    statement.execute(inserir);
	
	    statement.close();    
	      
	    connection.close();
	}

	
}
