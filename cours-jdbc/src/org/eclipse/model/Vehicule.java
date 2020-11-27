package org.eclipse.model;

public class Vehicule {
	private int id;
	private String marque;
	private String modele;
	private int annee;
	private Personne personne;

	public Vehicule() {
	}

	public Vehicule(int id) {
		super();
		this.id = id;
	}

	public Vehicule(String marque, String modele, int annee, Personne personne) {
		this.marque = marque;
		this.modele = modele;
		this.annee = annee;
		this.personne = personne;
	}

	public Vehicule(int id, String marque, String modele, int annee, Personne personne) {
		this.id = id;
		this.marque = marque;
		this.modele = modele;
		this.annee = annee;
		this.personne = personne;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}

	public Personne getPersonne() {
		return personne;
	}

	public void setPersonne(Personne personne) {
		this.personne = personne;
	}

	@Override
	public String toString() {
		return "Vehicule [id=" + id + ", marque=" + marque + ", modele=" + modele + ", annee=" + annee + ", personne="
				+ personne + "]";
	}
}
