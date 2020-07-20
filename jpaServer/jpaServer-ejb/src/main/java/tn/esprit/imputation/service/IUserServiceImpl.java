package tn.esprit.imputation.service;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.esprit.imputation.entitys.Etudiant;
import tn.esprit.imputation.inter.IUserServiceRemote;
@Stateless
@LocalBean
public class IUserServiceImpl implements IUserServiceRemote{
	@PersistenceContext(unitName="imputation-ejb") 
	EntityManager em;

	public int addEtudiant(Etudiant e) {
		System.out.println("add etudiant");
		em.persist(e);
	
		return e.getId();
		
	}

	public void removeEtudiant(int id) {
		System.out.println("In removeUser: ");
		em.remove(em.find(Etudiant.class, id));
		System.out.println("Out of removeUser: ");
		
	}

	public void updateEtudiant(Etudiant e) {
		System.out.println("In updateUser: ");
		Etudiant user= em.find(Etudiant.class,e.getId());
		user.setNom(e.getNom());
		user.setPrenom(e.getPrenom());
	
		
		
		System.out.println("Out of updateUser: ");
	}

	public Etudiant findEtudById(int id) {
		
		Etudiant user= em.find(Etudiant.class,id);
		return user;
	}

	public List<Etudiant> findAllUsers() {
		List<Etudiant>user=em.createQuery("from Etudiant",Etudiant.class).getResultList();
		return user;
	}
	 


}
