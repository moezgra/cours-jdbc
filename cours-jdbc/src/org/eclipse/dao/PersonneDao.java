package org.eclipse.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.config.MyConnection;
import org.eclipse.model.Personne;

public class PersonneDao implements Dao<Personne> {
	@Override
	public Personne save(Personne personne) {
		Connection c = MyConnection.getConnection();
		if (c != null) {
			try {
				PreparedStatement ps = c.prepareStatement("INSERT into personne (nom,prenom) values (?,?); ",
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
				PreparedStatement ps = c.prepareStatement("DELETE FROM personne WHERE num = ? ; ");
				ps.setInt(1, personne.getNum());
				ps.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public Personne update(Personne personne) {
		Connection c = MyConnection.getConnection();
		if (c != null) {
			try {
				PreparedStatement ps = c.prepareStatement("UPDATE personne SET nom=? , prenom=? WHERE num=? ; ",
						PreparedStatement.RETURN_GENERATED_KEYS);
				ps.setString(1, personne.getNom());
				ps.setString(2, personne.getPrenom());
				ps.setInt(3, personne.getNum());
				int nbr = ps.executeUpdate();
				if (nbr != 0) {
					return personne;
				}			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}


	@Override
	public Personne findById(int id) {
		Connection c = MyConnection.getConnection();
		if (c != null) {
			try {
				PreparedStatement ps = c.prepareStatement("SELECT * FROM Personne WHERE num = ?;");
				ps.setInt(1, id);
				ResultSet result = ps.executeQuery();
				if (result.next()) {
					int num = result.getInt(1);
					String nom = result.getString(2);
					String prenom = result.getString(3);
					Personne personne = new Personne(num, nom, prenom);
					return personne;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	@Override
	public List<Personne> findAll() {
		ArrayList<Personne> personnes = new ArrayList<Personne>();
		Connection c = MyConnection.getConnection();
		if (c != null) {
			try {
				PreparedStatement ps = c.prepareStatement("SELECT * FROM Personne;");
				ResultSet result = ps.executeQuery();
				while (result.next()) {
					int num = result.getInt(1);
					String nom = result.getString(2);
					String prenom = result.getString(3);
					Personne personne = new Personne(num, nom, prenom);
					personnes.add(personne);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return personnes;
	}
	
	public ArrayList<Personne> findByNomAndPrenom(String nom, String prenom) {
		ArrayList<Personne> personnes = new ArrayList<Personne>();
		Connection c = MyConnection.getConnection();
		if (c != null) {
			try {
				PreparedStatement ps = c.prepareStatement("SELECT * FROM Personne WHERE nom = ? AND prenom = ?;");
				ps.setString(1, nom);
				ps.setString(2, prenom);				
				ResultSet result = ps.executeQuery();
				while (result.next()) {
					int num = result.getInt(1);
					String n = result.getString(2);
					String p = result.getString(3);
					Personne personne = new Personne(num, n, p);
					personnes.add(personne);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return personnes;
	}
				

}	