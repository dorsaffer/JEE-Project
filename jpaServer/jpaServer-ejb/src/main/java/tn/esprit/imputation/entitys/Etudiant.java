package tn.esprit.imputation.entitys;

import java.io.Serializable;

import javax.ejb.Stateless;
import javax.persistence.*;
@Stateless
@Entity
@Table(name="Etudiant")
public class Etudiant implements Serializable {
	@Id
	@GeneratedValue( strategy= GenerationType.IDENTITY)
	@Column(name="UT_ID")
	int id;
	@Column(name="UT_NOM")
	String nom;
	@Column(name="UT_PRENOM")
	String prenom;
	@Column(name="UT_ADRESS_MAIL")
	String adresseMail;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAdresseMail() {
		return adresseMail;
	}
	public void setAdresseMail(String adresseMail) {
		this.adresseMail = adresseMail;
	}
	public Etudiant() {}
	public String getNom() {return nom;}
	public void setNom(String nom) {this.nom= nom;}
	public String getPrenom() {return prenom;}
	public void setPrenom(String prenom) {this.prenom= prenom;}
}
