package org.eclipse.model;

import java.util.ArrayList;

public class Adresse {
	private int id;
	private String rue;
	private String codePostal;
	private String ville;
	private ArrayList<Personne> personnes = new ArrayList<Personne>();

	public Adresse() {
	}

	public Adresse(int id) {
		this.id = id;
	}

	public Adresse(String rue, String codePostal, String ville, ArrayList<Personne> personnes) {
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
		this.personnes = personnes;
	}

	public Adresse(int id, String rue, String codePostal, String ville, ArrayList<Personne> personnes) {
		this.id = id;
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
		this.personnes = personnes;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public ArrayList<Personne> getPersonnes() {
		return personnes;
	}

	public void setPersonnes(ArrayList<Personne> personnes) {
		this.personnes = personnes;
	}

	@Override
	public String toString() {
		return "Adresse [id=" + id + ", rue=" + rue + ", codePostal=" + codePostal + ", ville=" + ville + ", personnes="
				+ personnes + "]";
	}
}