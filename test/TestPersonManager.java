import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.sql.Date;

import javax.inject.Inject;

import org.junit.jupiter.api.Test;

import model.Person;
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
		p.setMail("fallou.seye@etu.univ-amu.fr");
		p.setMotPasse("motdepasse");
		p.setNaissance(new Date(2020, 10, 30));
		p.setName("Seye");
		p.setPrenom("Fallou");
		
		pm.savePerson(p);
	}*/
	
	@Test
	public void testFindPersonOk() {
		Person p = pm.findPerson("fallou.seye@etu.univ-amu.fr");
		
		assertNotNull(p);
		assertEquals(p.getName(), "Seye");
		assertEquals(p.getPrenom(), "Fallou");
		assertEquals(p.getMotPasse(), "motdepasse");
	}
	
	@Test
	public void testFindPersonNotOk() {
		Person p = pm.findPerson("fallou.seye@etu.univ-amu.com");
		assertNull(p);
	}
}
