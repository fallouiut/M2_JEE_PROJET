import static org.junit.Assert.assertEquals;


import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.sql.Date;
import java.util.List;

import javax.inject.Inject;

import org.junit.jupiter.api.Test;

import model.CV;
import model.Person;
import model.User;
import model.manager.PersonManager;

public class TestPersonManager extends BaseJunit5 {
	
	@Inject
	PersonManager pm;
	
	/*
	@Test 
	public void testNotNull() {
		assertNotNull(pm);
		System.out.println(pm);
	}
	
	@Test
	public void testEntityManager() {
		assertNotNull(pm.getEntityManager());
		System.out.println("EntityManager: " + pm.getEntityManager());
	}
	
	@Test
	public void testSavePerson() {
		Person p = new Person();
		p.setMail("fallou.seye@outlook.com");
		p.setMotPasse("motdepasse");
		p.setNaissance(new Date(2020, 10, 30));
		p.setName("Seye");
		p.setPrenom("Fallou");
		
		Person p2 = new Person();
		p2.setMail("fallou-du-13@gmail.com");
		p2.setMotPasse("motdepasse2");
		p2.setNaissance(new Date(2020, 10, 31));
		p2.setName("Seye");
		p2.setPrenom("Fallou");
		
		pm.addPerson(p2);
		pm.addPerson(p);
	}

	@Test
	public void testFindPersonOk() {
		List<Person> ps = pm.findAllPersons();
		
		assertTrue (ps.size() >= 2);
	}
	
	
	@Test
	public void testFindPersonNotOk() {
		Person p = pm.findPerson(50);
		assertNull(p);
	}

	@Test
	public void testAddingCv() {
		Person p = pm.findPersonByEmail("fallou-du-13@gmail.com");
		assertNotNull(p);
		CV cv = new CV();
	}

	@Test
	public void testFindAll() {
		List<Person> persons = pm.findAllPersons();
		assertNotNull(persons);
		
		assertTrue(persons.size() >= 2);
		
	}
	
	@Test
	public void testAddingCv() {
		Person p = pm.findPersonByEmail("fallou-du-13@gmail.com");
		
		CV cv = new CV();
		p.addCv(cv);
		
		pm.updatePerson(p);
	}
	*/
	
	@Test
	public void getCvAfterPerson() {
		Person p = pm.findPersonByEmail("fallou-du-13@gmail.com");
		
		assertNotNull(p.getCvs());
		System.out.println("P cv size: " + p.getCvs().size());
		
		for(CV cv: p.getCvs()) {
			System.out.println("CV: " + cv);
		}
		
		assertTrue(p.getCvs().get(0) != null);
	}
	
}
