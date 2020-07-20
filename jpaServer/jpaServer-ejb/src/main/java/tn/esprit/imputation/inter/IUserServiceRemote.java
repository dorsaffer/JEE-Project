package tn.esprit.imputation.inter;

import java.util.List;

import javax.ejb.Remote;

import tn.esprit.imputation.entitys.Etudiant;

@Remote
public interface IUserServiceRemote {
	

	
		
		public int addEtudiant(Etudiant e);
		public void removeEtudiant(int id);
		public void updateEtudiant(Etudiant e);
		 public Etudiant findEtudById(int id);
		 public List<Etudiant> findAllUsers();
		 
	

}
