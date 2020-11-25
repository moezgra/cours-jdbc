package org.eclipse.main;

import org.eclipse.dao.PersonneDao;
import org.eclipse.model.Personne;

public class Main {
	public static void main(String[] args) {
		// Personne personne = new Personne("thauvin", "florian");
		PersonneDao personneDao = new PersonneDao();
//		Personne insertedPersonne = personneDao.save(personne);
//		if (insertedPersonne != null) {
//			System.out.println(insertedPersonne);
//		}
		Personne personne = new Personne(9);
		personneDao.remove(personne);
	}
}