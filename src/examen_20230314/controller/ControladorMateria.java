package examen_20230314.controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import examen_20230314.model.Materia;



public class ControladorMateria {

	/**
	 * 
	 * @param rs
	 * @return
	 */
	private static Materia getEntidadFromResultSet(String sql) {
		Materia materia = null;
		try {
			Connection conn = ConnectionManager.getConexion();
			Statement st = conn.createStatement();
			
			ResultSet rs = st.executeQuery(sql);

			if (rs != null && rs.next()) {
				materia.setId(rs.getInt("id"));
				materia.setCentro(rs.getString("centro"));
				materia.setNivel(rs.getString("nivel"));
				materia.setMateria(rs.getInt("materia"));
			}
			rs.close();
			st.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return materia;
	}
}
	
	
