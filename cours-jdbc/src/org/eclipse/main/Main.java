package org.eclipse.main;

import org.eclipse.dao.PersonneDao;
import org.eclipse.dao.VehiculeDao;
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
		PersonneService personneService = new PersonneService();
		Personne personne = new Personne(800);
		personneService.remove(personne);
	}
	
}

	
		  
		 
	
