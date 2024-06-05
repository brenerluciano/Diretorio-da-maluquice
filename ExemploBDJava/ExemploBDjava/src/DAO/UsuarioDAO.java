package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import entity.Usuario;
import entity.UsuarioExtra;
import Conexao.Conexao;

public class UsuarioDAO {

    public void cadastrarUsuario(Usuario usuario, UsuarioExtra usuarioExtra) {

        Connection conn = null;
        PreparedStatement psUsuario = null;
        PreparedStatement psUsuarioExtra = null;

        String sqlUsuario = "INSERT INTO USUARIO (NOME, LOGIN, SENHA, EMAIL) VALUES (?, ?, ?, ?)";
        String sqlUsuarioExtra = "INSERT INTO CLIENTE (CODIGO, NOME , CPF, EMAIL) VALUES (?, ?, ?, ?)";

        try {
            conn = Conexao.getConexao();
            conn.setAutoCommit(false); // Desabilita autocommit para transação

            // Inserção na tabela USUARIO
            psUsuario = conn.prepareStatement(sqlUsuario, PreparedStatement.RETURN_GENERATED_KEYS);
            psUsuario.setString(1, usuario.getNome());
            psUsuario.setString(2, usuario.getLogin());
            psUsuario.setString(3, usuario.getSenha());
            psUsuario.setString(4, usuario.getEmail());
            psUsuario.executeUpdate();

            // Recuperar o ID gerado
            ResultSet rs = psUsuario.getGeneratedKeys();
            int codigoUsuario = 0;
            if (rs.next()) {
                codigoUsuario = rs.getInt(1);
            }

            // Inserção na tabela USUARIO_EXTRA
            psUsuarioExtra = conn.prepareStatement(sqlUsuarioExtra);
            psUsuarioExtra.setInt(1, codigoUsuario);
            psUsuarioExtra.setString(2, usuarioExtra.getNome());
            psUsuarioExtra.setString(3, usuarioExtra.getCpf());
            psUsuarioExtra.setString(4, usuarioExtra.getEmail());
            psUsuarioExtra.executeUpdate();

            conn.commit(); // Commit da transação

        } catch (SQLException e) {
            if (conn != null) {
                try {
                    conn.rollback(); // Rollback em caso de erro
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
            e.printStackTrace();
        } finally {
            try {
                if (psUsuario != null) psUsuario.close();
                if (psUsuarioExtra != null) psUsuarioExtra.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}