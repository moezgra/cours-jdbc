package org.eclipse.service;import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;import org.eclipse.config.MyConnection;
import org.eclipse.dao.PersonneDao;
import org.eclipse.dao.VehiculeDao;
import org.eclipse.model.Personne;
import org.eclipse.model.Vehicule;import com.mysql.cj.xdevapi.RemoveStatement;

public class PersonneService {
	private PersonneDao personneDao = new PersonneDao();
	private VehiculeDao vehiculeDao = new VehiculeDao();
	

	public Personne save(Personne personne) {
		personne.setNom(personne.getNom().toUpperCase());
		return personneDao.save(personne);
	}

	/*
	 * public Personne update(Personne personne) {
	 * personne.setNom(personne.getNom().toUpperCase()); return
	 * personneDao.update(personne); }
	 */
	public Personne update(Personne personne) throws Exception {
		if (personneDao.findById(personne.getNum()) == null) {
			throw new Exception("Personne introuvable");
		}
		personne.setNom(personne.getNom().toUpperCase());
		return personneDao.update(personne);
	}
	//remove vehicule et personne
	/*
	 * public void remove(Personne personne) throws Exception { if
	 * (personneDao.findById(personne.getNum()) == null) { throw new
	 * Exception("Personne introuvable"); } personneDao.remove(personne); }
	 */

	// suppr la personne et ses vehicules :

	// suppr la personne Mais PAS ses vehicules :
	public void remove(Personne personne) throws Exception {
		if (personneDao.findById(personne.getNum()) == null) {
			throw new Exception("Personne introuvable");		
		}
		for(Vehicule vehicule: vehiculeDao.findByPersonne(personne)) {
			vehicule.setPersonne(null);
			vehiculeDao.update(vehicule);
		}
		personneDao.remove(personne);
	}
	
	public Personne findById(int id) {
		return personneDao.findById(id);
		
	}	public List<Personne> findAll() {
		return personneDao.findAll();
		
	}	public ArrayList<Personne> findByNomAndPrenom(String nom, String prenom) {
		return personneDao.findByNomAndPrenom(nom, prenom);
	}

}
