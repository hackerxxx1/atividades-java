

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;



public class UsuarioDAO {

	// Consulta usuario no banco de dados
	public boolean checkLogin(String login, String senha) {

		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		ResultSet rs = null;

		boolean check = false;

		try {

			stmt = con.prepareStatement("SELECT * FROM Cliente WHERE nome = ? and senha = ?");
			stmt.setString(1, login);
			stmt.setString(2, senha);

			rs = stmt.executeQuery();

			if (rs.next()) {

				check = true;
			}

		} catch (SQLException ex) {
			Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
		} finally {
			ConnectionFactory.closeConnection(con, stmt, rs);
		}

		return check;

	}

	public void cadastra(String login,String senha) {

		Connection con = ConnectionFactory.getConnection();
		String sql = "INSERT INTO Cliente(nome,senha) VALUES(?,?)";

		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setString(1, login);
			preparador.setString(2, senha);

			preparador.execute();
			preparador.close();

			JOptionPane.showMessageDialog(null, "dados cadastrados com sucesso");

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "nao foi possivel cadastrar os dados "+e.getMessage());

		}

	}

}
