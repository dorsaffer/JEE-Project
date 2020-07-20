package jpaClient;

import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import tn.esprit.imputation.entitys.Etudiant;
import tn.esprit.imputation.inter.IUserServiceRemote;

public class updateClient {
	public static void main(String[] args) throws NamingException  {
		String jndiName ="/jpaServer-ear/jpaServer-ejb/IUserServiceImpl!tn.esprit.imputation.inter.IUserServiceRemote";
		Context cx = new InitialContext();
		IUserServiceRemote proxy = (IUserServiceRemote) cx.lookup(jndiName);
		Etudiant e =new Etudiant();
		e.setId(2);
		e.setNom("aaaaaaa");
		e.setPrenom("dorsaf");
		e.setAdresseMail("hhhh");
		proxy.updateEtudiant(e);
		
	}
}
