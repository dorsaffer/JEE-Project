package jpaClient;

import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import tn.esprit.imputation.entitys.Etudiant;
import tn.esprit.imputation.inter.IUserServiceRemote;

public class removeClient {

	public static void main(String[] args) throws NamingException  {
		String jndiName ="/jpaServer-ear/jpaServer-ejb/IUserServiceImpl!tn.esprit.imputation.inter.IUserServiceRemote";
		Context cx = new InitialContext();
		IUserServiceRemote proxy = (IUserServiceRemote) cx.lookup(jndiName);
		proxy.removeEtudiant(3);
		}
	

	

}
