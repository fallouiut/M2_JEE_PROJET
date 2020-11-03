package model.manager;

import java.util.List;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import model.Person;

@Stateless(name = "personManager")
@TransactionManagement(TransactionManagementType.CONTAINER)
public class PersonManager {

    @PersistenceContext(unitName = "myBase")
    EntityManager em;
    
    public void getPersonByName(int id) {
    	System.out.println(em);
    }
    
    public EntityManager getEntityManager() {
    	return this.em;
    }
    
    @PostConstruct
    public void pre() {
    	System.out.println(/*"\u001B[36m" + */"Constructing: '" + this + "'" + "\u001B[0m");
    }
    
    @PreDestroy
    public void post() {
    	System.out.println(/*"\u001B[36m" + */"Destructing: '" + this + "'" + "\u001B[0m");
    }
    
    public void addPerson(Person p) {
    	if(p != null) {
    		em.persist(p);
    		em.flush();
    	}
    }
    
    public void updatePerson(Person p) {
    	if(p != null) {
    		em.merge(p);
    	}
    }
    
    /*	    this.login = "";
	    if (login.equals(pwd)) {
	        this.login = login;
	        System.out.printf("Conexion reussie");
	        connexion= true;
	    
	    }
	}
    public List<Person> findAllPersons() {
    	List<Person> persons;
    	persons = em.find
    	return persons
    }
    */
    
    public Person findPersonByEmail(String email) {
        String query = "SELECT p FROM Person p WHERE p.mail = :pattern";

        TypedQuery<Person> q = em.createQuery(query, Person.class);
        Person p = null;
        p = q.setParameter("pattern", email).getSingleResult();
        return p;
        
    }
    
    public List<Person> findAllPersons() {
			TypedQuery<Person> q = em.createNamedQuery("findAllPersons", Person.class);
			// exécution et récupération du résultat
			List<Person> result = q.getResultList();
			return result;
    }
    
    public Person findPerson(long id) {
    	
    	Person p = em.find(Person.class, id);
    	
    	return p;
    }

}
