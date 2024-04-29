package br.com.bb.dicre.gesem.apifazai.seguranca;

import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;

import org.springframework.stereotype.Service;

@Service
public class Autenticador {
	
	public Autenticador() {
		
	}
	
	public void autenticar(String usuario, String senha) {
		Hashtable <String, String> env = new Hashtable <String, String> ();
		
		env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
		env.put(Context.PROVIDER_URL,"ldap://INTRABB");
		env.put(Context.SECURITY_AUTHENTICATION, "simple");
		env.put(Context.SECURITY_PRINCIPAL, usuario + "@INTRABB");
		env.put(Context.SECURITY_CREDENTIALS, senha);
		
		
		try {
			DirContext ctx = new InitialDirContext(env);	
			
			System.out.println("Usuário Logado");
		} catch (Exception e) {
			throw new RuntimeException(e.getLocalizedMessage());
		}		
		
	}

}
