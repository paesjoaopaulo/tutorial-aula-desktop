package appnov.persistencia;

import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public static java.sql.Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost/banco", "root", "");
        } catch (SQLException ex) {
            System.err.println("Erro na conexão: " + ex.getMessage());
        }
        return null;
    }
}
