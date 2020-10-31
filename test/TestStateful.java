import javax.inject.Inject;
import org.junit.jupiter.api.Test;
import model.User;

public class TestStateful extends BaseJunit5 {

	@Inject
	public User user;
	
	
	@Test
	public void testCrahs() {
		user.login("soso", "soso");
		user.logout();
	}
	
}
