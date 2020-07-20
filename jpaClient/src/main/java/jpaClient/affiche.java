package jpaClient;

import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import tn.esprit.imputation.entitys.Etudiant;
import tn.esprit.imputation.inter.IUserServiceRemote;

public class affiche {

	public static void main(String[] args) throws NamingException  {
		String jndiName ="/jpaServer-ear/jpaServer-ejb/IUserServiceImpl!tn.esprit.imputation.inter.IUserServiceRemote";
		Context cx = new InitialContext();
		IUserServiceRemote proxy = (IUserServiceRemote) cx.lookup(jndiName);
		List<Etudiant> l=proxy.findAllUsers();
		for(int i=0;i<l.size();i++) {
			System.out.println(l.get(i).getNom());
		}

	}

}
