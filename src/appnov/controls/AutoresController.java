package appnov.controls;

import java.sql.Connection;
import java.sql.SQLException;
import appnov.models.Autor;
import appnov.persistencia.ConnectionFactory;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class AutoresController {

    private Connection conn;

    public void adicionar(Autor s) {
        String sql = "INSERT INTO autores (nome, celular) VALUES (?, ?)";
        conn = ConnectionFactory.getConnection();
        try {
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, s.getNome());
            st.setString(2, s.getCelular());
            st.executeUpdate();
        } catch (SQLException e) {
            System.err.println("SQL Exception: " + e.getMessage());
            System.exit(0);
        }
    }

    public void excluir(Autor s) {
        String sql = "DELETE FROM autores WHERE id = ?";
        conn = ConnectionFactory.getConnection();
        try {
            PreparedStatement st = conn.prepareStatement(sql);
            st.setInt(1, s.getId());
            st.executeUpdate();
        } catch (SQLException e) {
            System.err.println("SQL Exception: " + e.getMessage());
            System.exit(0);
        }
    }

    public void atualizar(Autor s) {
        String sql = "UPDATE autores SET nome = ?, celular = ? WHERE id = ?";
        conn = ConnectionFactory.getConnection();
        try {
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, s.getNome());
            st.setString(2, s.getCelular());
            st.setInt(3, s.getId());
            st.executeUpdate();
        } catch (SQLException e) {
            System.err.println("SQL Exception: " + e.getMessage());
            System.exit(0);
        }
    }

    public List<Autor> buscaPorNome(Autor s) {
        String sql = "SELECT * FROM autores WHERE nome like ?";
        conn = ConnectionFactory.getConnection();
        try {
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, s.getNome());
            return processResults(st.executeQuery());
        } catch (SQLException e) {
            System.err.println("SQL Exception: " + e.getMessage());
            System.exit(0);
        }
        return null;
    }

    public Autor buscaPorId(Autor s) {
        String sql = "SELECT * FROM autores WHERE id = ?";
        conn = ConnectionFactory.getConnection();
        try {
            PreparedStatement st = conn.prepareStatement(sql);
            st.setInt(1, s.getId());
            return processResults(st.executeQuery()).get(0);
        } catch (SQLException e) {
            System.err.println("SQL Exception: " + e.getMessage());
            System.exit(0);
        }
        return null;
    }

    public List<Autor> imprime() {
        String sql = "SELECT * FROM autores";
        conn = ConnectionFactory.getConnection();
        try {
            PreparedStatement st = conn.prepareStatement(sql);
            return processResults(st.executeQuery());
        } catch (SQLException e) {
            System.err.println("SQL Exception: " + e.getMessage());
            System.exit(0);
        }
        return null;
    }

    private List<Autor> processResults(ResultSet rs) {
        List<Autor> ls = new ArrayList<>();
        try {
            while (rs.next()) {
                ls.add(
                        new Autor(rs.getInt("id"), rs.getString("nome"), rs.getString("celular"))
                );
            }
        } catch (SQLException ex) {
            System.err.println("SQL Exception: " + ex.getMessage());
        }
        return ls;
    }
}
