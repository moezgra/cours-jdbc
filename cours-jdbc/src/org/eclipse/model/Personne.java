package org.eclipse.model;

public class Personne {
	private int num;
	private String nom;
	private String prenom;

	public Personne() {
		super();
	}

	public Personne(int num) {
		super();
		this.num = num;
	}

	public Personne(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}

	public Personne(int num, String nom, String prenom) {
		this.num = num;
		this.nom = nom;
		this.prenom = prenom;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@Override
	public String toString() {
		return "Personne [num=" + num + ", nom=" + nom + ", prenom=" + prenom + "]";
	}
}