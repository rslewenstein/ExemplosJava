package dao;

/**
 *
 * @author rafael
 */
import factory.ConnectionFactory;
import modelo.Usuario;
import java.sql.*;
import java.sql.PreparedStatement;

public class UsuarioDao {
    private Connection connection;
    int id;
    String nome;
    String cpf;
    String email;
    String telefone;

    
    public UsuarioDao(){
        this.connection = new ConnectionFactory().getConnection();
    }
    
    public void adiciona(Usuario usuario){
        String sql = "INSERT INTO usuario (nome,cpf,email,telefone) VALUES (?,?,?,?)";
        
        try{
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getCpf());
            ps.setString(3, usuario.getEmail());
            ps.setString(4, usuario.getTelefone());
            ps.execute();
            ps.close();
        }catch(SQLException e){
            throw new RuntimeException(e);
            //e.getMessage();
           // e.printStackTrace();
        }
    }
    
    }
    

