import static org.junit.Assert.assertNotNull;

import javax.inject.Inject;

import org.junit.jupiter.api.Test;

import model.manager.PersonManager;

public class TestPersonManager extends BaseJunit5 {

	
	@Inject
	PersonManager pm;
	
	
	@Test 
	public void testNotNull() {
		assertNotNull(pm);
		System.out.println(pm);
	}
	/*
	@Test
	public void testEntityManager() {
		assertNotNull(pm.getEntityManager());
		System.out.println("EntityManager: " + pm.getEntityManager());
	}*/
}
