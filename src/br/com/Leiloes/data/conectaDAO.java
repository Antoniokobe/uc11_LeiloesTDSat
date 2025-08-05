package br.com.Leiloes.data;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class conectaDAO {

    public Connection connectDB() {
        try {
            // Cria a conexão usando try-with-resources
            return DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/uc11?user=root&password=1234&useSSL=false&allowPublicKeyRetrieval=true"
            );
        } catch (SQLException e) {
            // Exibe mensagem de erro detalhada
            JOptionPane.showMessageDialog(null, "Erro ao conectar ao banco de dados: " + e.getMessage());
            e.printStackTrace(); // Para depuração
            return null; // Retorna null em caso de erro
        }
    }
}
