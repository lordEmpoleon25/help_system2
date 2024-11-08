package backend;

import java.sql.*;
import java.sql.Connection;
import java.sql.SQLException;



public class Cadastro {
	 public void inserir(Usuario usuario) {
//	        String sql = "INSERT INTO help_system (idCliente, nome, setor, senha, email) VALUES (?, ?, ?, ?, ?)";
	        
	        String sql = "INSERT INTO help_system (nome, setor, senha, email) VALUES (?, ?, ?, ?)";
	        
	        try (Connection connection   = mysqlConnection.getConnection();
	             PreparedStatement statement = connection.prepareStatement(sql)) {
//	            statement.setInt(1, usuario.getidCliente());
	            statement.setString(1, usuario.getNome());
	            statement.setString(2, usuario.getSetor());
	            statement.setString(3, usuario.getSenha());
	            statement.setString(4, usuario.getEmail());

	            statement.executeUpdate();  

	        } catch (SQLException ex) {
	            throw new RuntimeException(ex);
	        }
	    }
	 
	 
	 public void inserirpergunta(Usuario usuario) {
	        String sql = "update help_system set pergunta = ? where nome = ?";
            String and = "andrews";


	        try (Connection connection  
	 = mysqlConnection.getConnection();
	             PreparedStatement statement = connection.prepareStatement(sql)) {
	            statement.setString(1, usuario.getPergunta());
//	            statement.setString(2, usuario.getNome());
	            statement.setString(2, and);

	            statement.executeUpdate();  

	        } catch (SQLException ex) {
	            throw new RuntimeException(ex);
	        }
	    }
	 
	 
	 public void inserirresposta(Usuario usuario) {
	        String sql = "update help_system set resposta = ? where nome = ?";
            String and = "andrews";

	        try (Connection connection  
	 = mysqlConnection.getConnection();
	             PreparedStatement statement = connection.prepareStatement(sql)) {
	
	            statement.setString(1, usuario.getResposta());
	            statement.setString(2, and);

	            statement.executeUpdate();  

	        } catch (SQLException ex) {
	            throw new RuntimeException(ex);
	        }
	    }
	 
	 
	 public void recebermensagem(Usuario usuario) {
	        String sql = "select pergunta, nome from help_system ";
	        try (Connection connection  
	 = mysqlConnection.getConnection();
	             PreparedStatement statement = connection.prepareStatement(sql)) {
	            
	            statement.executeUpdate();  
//teste
	        } catch (SQLException ex) {
	            throw new RuntimeException(ex);
	        }
	    }
	 
	 
	 public void receberlogin(Usuario usuario) {
	        String sql = "select email, senha from help_system ";
	        try (Connection connection  
	 = mysqlConnection.getConnection();
	             PreparedStatement statement = connection.prepareStatement(sql)) {
	            
	            statement.executeUpdate();  

	        } catch (SQLException ex) {
	            throw new RuntimeException(ex);
	        }
	    }
	 
}
