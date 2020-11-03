package model;

import javax.annotation.PostConstruct;
import javax.ejb.Remove;
import javax.ejb.Stateful;

@Stateful(name="user")
public class User {

    private String login = "";

    public boolean connexion= false;
    
    public String getLogin() {
    	return this.login;
    }
    
    public void setPerson(Person p) {}
    
    @PostConstruct
    public void debut() {
        System.out.printf("Debut");

    }
    
    public void login(String login, String pwd) {
	    this.login = "";
	    if (login.equals(pwd)) {
	        this.login = login;
	        System.out.printf("Conexion reussie");
	        connexion= true;
	    
	    }
	}
    
    @Remove
    public void logout() {
        this.login = "";
        System.out.printf("Deconnexion");
        connexion = false;
        
    }
}
