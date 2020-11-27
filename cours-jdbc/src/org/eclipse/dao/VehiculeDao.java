package org.eclipse.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.config.MyConnection;
import org.eclipse.model.Personne;
import org.eclipse.model.Vehicule;

public class VehiculeDao implements Dao<Vehicule> {

	@Override
	public Vehicule save(Vehicule vehicule) {
		Connection c = MyConnection.getConnection();
		if (c != null) {
			try {
				PreparedStatement ps = c.prepareStatement(
						"insert into vehicule (marque,modele, annee, numPersonne) values (?,?,?,?); ",
						PreparedStatement.RETURN_GENERATED_KEYS);
				ps.setString(1, vehicule.getMarque());
				ps.setString(2, vehicule.getModele());
				ps.setInt(3, vehicule.getAnnee());
				ps.setInt(4, vehicule.getPersonne().getNum());
				ps.executeUpdate();
				ResultSet resultat = ps.getGeneratedKeys();
				if (resultat.next()) {
					vehicule.setId(resultat.getInt(1));
					return vehicule;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	@Override
	public void remove(Vehicule vehicule) {
		Connection c = MyConnection.getConnection();
		if (c != null) {
			try {
				PreparedStatement ps = c.prepareStatement("DELETE FROM vehicule WHERE id = ? ; ");
				ps.setInt(1, vehicule.getId());
				ps.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public Vehicule update(Vehicule vehicule) {
		Connection c = MyConnection.getConnection();
		if (c != null) {
			try {
				PreparedStatement ps = c
						.prepareStatement("UPDATE Vehicule SET marque=?, modele=?, annee=?, numPersonne=? WHERE id=?;");
				ps.setString(1, vehicule.getMarque());
				ps.setString(2, vehicule.getModele());
				ps.setInt(3, vehicule.getAnnee());
				ps.setInt(4, vehicule.getPersonne().getNum());
				ps.setInt(5, vehicule.getId());
				int nbr = ps.executeUpdate();
				if (nbr == 1) {
					return vehicule;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	@Override
	public Vehicule findById(int id) {
		Connection c = MyConnection.getConnection();
		if (c != null) {
			try {
				PreparedStatement ps = c.prepareStatement("SELECT * FROM vehicule WHERE id = ?;");
				ps.setInt(1, id);
				ResultSet result = ps.executeQuery();
				if (result.next()) {
					id = result.getInt(1);
					String marque = result.getString(2);
					String modele = result.getString(3);
					int annee = result.getInt(4);
					int numPersonne = result.getInt(5);
					PersonneDao personneDao = new PersonneDao();
					Personne personne = personneDao.findById(numPersonne);
					Vehicule vehicule = new Vehicule(id, marque, modele, annee, personne);
					return vehicule;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	@Override
	public List<Vehicule> findAll() {
		ArrayList<Vehicule> vehicules = new ArrayList<Vehicule>();
		Connection c = MyConnection.getConnection();
		if (c != null) {
			try {
				PreparedStatement ps = c.prepareStatement("SELECT * FROM vehicule;");
				ResultSet result = ps.executeQuery();
				while (result.next()) {
					int id = result.getInt(1);
					String marque = result.getString(2);
					String modele = result.getString(3);
					int annee = result.getInt(4);
					int numPersonne = result.getInt(5);
					PersonneDao personneDao = new PersonneDao();
					Personne personne = personneDao.findById(numPersonne);
					Vehicule vehicule = new Vehicule(id, marque, modele, annee, personne);
					vehicules.add(vehicule);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return vehicules;
	}

	// on ajoute une methode pour savoir qulle voiture appartient à quelle personne:
	public List<Vehicule> findByPersonne(Personne personne) {
		ArrayList<Vehicule> vehicules = new ArrayList<Vehicule>();
		Connection c = MyConnection.getConnection();
		if (c != null) {
			try {
				PreparedStatement ps = c.prepareStatement("SELECT * FROM vehicule WHERE numPersonne = ?;");
				ps.setInt(1, personne.getNum());
				ResultSet result = ps.executeQuery();
				while (result.next()) {
					int id = result.getInt(1);
					String marque = result.getString(2);
					String modele = result.getString(3);
					int annee = result.getInt(4);
					int numPersonne = result.getInt(5);
					PersonneDao personneDao = new PersonneDao();
					Personne p = personneDao.findById(numPersonne);
					Vehicule vehicule = new Vehicule(id, marque, modele, annee, p);
					vehicules.add(vehicule);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return vehicules;
	}
	
	
}