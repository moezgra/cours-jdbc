package org.eclipse.main;

import java.util.ArrayList;
import java.util.Arrays;

import org.eclipse.dao.AdresseDao;
import org.eclipse.dao.PersonneDao;
import org.eclipse.dao.VehiculeDao;
import org.eclipse.model.Adresse;
import org.eclipse.model.Personne;
import org.eclipse.model.Vehicule;
import org.eclipse.service.PersonneService;

public class Main {
	public static void main(String[] args) throws Exception {  // ewception ici vient d'être ajouter pour remove car on a fait exception sans try
		// Personne personne = new Personne("thauvin", "florian");
		//PersonneDao personneDao = new PersonneDao();
//		Personne insertedPersonne = personneDao.save(personne);
//		if (insertedPersonne != null) {
//			System.out.println(insertedPersonne);
//		}
		//Personne personne = new Personne(9);
		//personneDao.remove(personne);
		
		//update:
		/*
		 * Personne personne = new Personne(5, "Maradona", "Diego"); PersonneDao
		 * personneDao = new PersonneDao();
		 * System.out.println(personneDao.update(personne));
		 */
		
		//findall :
		/*
		 * PersonneDao personneDao = new PersonneDao(); var personnes =
		 * personneDao.findAll(); for(Personne personne: personnes) {
		 * System.out.println(personne); }
		 */
		/*
		 * PersonneDao personneDao = new PersonneDao();
		 * System.out.println(personneDao.findById(1));
		 * System.out.println(personneDao.findById(2));
		 */
		
		//vehicule dao:
//		PersonneDao personneDao = new PersonneDao();
//		VehiculeDao  vehiculeDao = new VehiculeDao();
//		Vehicule vehicule = new Vehicule("Peugeot", "108", 2018, personneDao.findById(5));
//		System.out.println(vehiculeDao.save(vehicule));
		
		//vehicule remove:
		/*
		 * PersonneDao personneDao = new PersonneDao(); 
		 * VehiculeDao vehiculeDao = new VehiculeDao(); 
		 * Vehicule vehicule = new Vehicule(1);
		 * vehiculeDao.remove(vehicule);
		 */
		 
		 //vehicule update :
	       /* PersonneDao personneDao = new PersonneDao();
			VehiculeDao  vehiculeDao = new VehiculeDao();
			Vehicule vehicule = new Vehicule(2, "Ford", "Kuga", 2012, personneDao.findById(6));
			vehiculeDao.update(vehicule);
		}*/
		
		// vehicule findById:
		/*
		 * PersonneDao personneDao = new PersonneDao(); VehiculeDao vehiculeDao = new
		 * VehiculeDao(); System.out.println(vehiculeDao.findById(2));
		 */
		
		// vehicule findAll :
		/*
		 * PersonneDao personneDao = new PersonneDao(); VehiculeDao vehiculeDao = new
		 * VehiculeDao(); System.out.println(vehiculeDao.findById(2)); for(Vehicule
		 * vehicule: vehiculeDao.findAll()) { System.out.println(vehicule); }
		 */
		
		// findByPersonne:
		/*
		 * PersonneDao personneDao = new PersonneDao(); VehiculeDao vehiculeDao = new
		 * VehiculeDao(); for(Vehicule vehicule:
		 * vehiculeDao.findByPersonne(personneDao.findById(5))) {
		 * System.out.println(vehicule); }
		 */
		//PersonneService save
		/*PersonneService personneService = new PersonneService();
		Personne personne = new Personne("messi", "lionel");
		System.out.println(personneService.save(personne));*/
		
		//PersonneService update
		/*
		 * PersonneService personneService = new PersonneService(); Personne personne =
		 * new Personne(11, "paris", "lionel");
		 * System.out.println(personneService.update(personne));
		 */
		
		//PersonneService Remove:
		/*
		 * PersonneService personneService = new PersonneService(); Personne personne =
		 * new Personne(800); personneService.remove(personne);
		 */
		//personne service suppr la personne Mais PAS ses vehicules
		/*PersonneService personneService = new PersonneService();
		Personne personne = new Personne(6);
		personneService.remove(personne);*/
	
		//personne service findAll
		/*PersonneService personneService = new PersonneService();
		for(Personne personne: personneService.findAll()) {
			System.out.println(personne);
		}*/
		
		//adresseDao save :
		/*
		 * AdresseDao adresseDao = new AdresseDao(); Adresse adresse = new
		 * Adresse("Paradis", "13015", "Marseille", null);
		 * System.out.println(adresseDao.save(adresse));
		 */
		//adresse daosave :
		/*
		 * AdresseDao adresseDao = new AdresseDao(); Personne personne1 = new
		 * Personne("Cage", "Nicolas"); Personne personne2 = new Personne("Segal",
		 * "Steven"); ArrayList<Personne> personnes = new
		 * ArrayList<Personne>(Arrays.asList(personne1, personne2)); Adresse adresse =
		 * new Adresse("Défense", "75000", "Paris", personnes);
		 * System.out.println(adresseDao.save(adresse));
		 */
		/*
		 * AdresseDao adresseDao = new AdresseDao(); PersonneDao personneDao = new
		 * PersonneDao(); Personne personne1 = new Personne("Jolie", "Angelina");
		 * Personne personne2 = personneDao.findById(17); ArrayList<Personne> personnes
		 * = new ArrayList<Personne>(Arrays.asList(personne1, personne2)); Adresse
		 * adresse = new Adresse("Défense", "75000", "Paris", personnes);
		 * System.out.println(adresseDao.save(adresse));
		 */
		
		//remove:
		/*
		 * AdresseDao adresseDao = new AdresseDao(); Adresse adresse = new Adresse(4);
		 * adresseDao.remove(adresse);
		 */
		//findById
		//AdresseDao adresseDao = new AdresseDao();
		//System.out.println(adresseDao.findById(3));
		
		AdresseDao adresseDao = new AdresseDao();
		System.out.println(adresseDao.findAll());
	}

}
