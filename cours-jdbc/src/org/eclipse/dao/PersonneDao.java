package org.eclipse.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.eclipse.config.MyConnection;
import org.eclipse.model.Personne;

public class PersonneDao implements Dao<Personne> {
	@Override
	public Personne save(Personne personne) {
		Connection c = MyConnection.getConnection();
		if (c != null) {
			try {
				PreparedStatement ps = c.prepareStatement("insert into personne (nom,prenom) values (?,?); ",
						PreparedStatement.RETURN_GENERATED_KEYS);
				ps.setString(1, personne.getNom());
				ps.setString(2, personne.getPrenom());
				ps.executeUpdate();
				ResultSet resultat = ps.getGeneratedKeys();
				if (resultat.next()) {
					personne.setNum(resultat.getInt(1));
					return personne;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	} 

	
	@Override
	public void remove(Personne personne) {
		Connection c = MyConnection.getConnection();
		if (c != null) {
			try {
				PreparedStatement ps = c.prepareStatement("DELETE FROM  personne  WHERE num = ? ; ");
				ps.setInt(1, personne.getNum());
				ps.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	// TODO Auto-generated method stub } @Override
	public Personne update(Personne t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Personne findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Personne> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
}