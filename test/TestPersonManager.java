import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.sql.Date;
import java.util.List;

import javax.inject.Inject;

import org.junit.jupiter.api.Test;

import model.Cv;
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
	*/
	@Test
	public void testSavePerson() {
		Person p = new Person();
		p.setMail("fallou-du-13@outlook.com");
		p.setMotPasse("motdepasse");
		p.setNaissance(new Date(2020, 10, 30));
		p.setName("Seye");
		p.setPrenom("Fallou");
		
		pm.addPerson(p);
	}
	/*
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

	@Test
	public void testAddingCv() {
		Person p = pm.findPerson("fallou.seye@etu.univ-amu.fr");
		assertNotNull(p);
		Cv cv = new Cv();

		p.addCv(cv);		
		pm.updatePerson(p);
	}
	/*
	@Test
	public void testGetCv() {
		Person p = pm.findPerson("fallou.seye@etu.univ-amu.fr");
		
		List<Cv> cvs = p.getCvs();

		System.out.println("-------------------------");
		System.out.println("Taille cvs: " + cvs.size());
		
		assertTrue(cvs.size() > 0);
	}
	*/
}
