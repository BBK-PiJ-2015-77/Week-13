import org.junit.*;
import org.junit.Before;
import static org.junit.Assert.*;

public class UserImplTest {
	private UserImpl u;
	private Library slough;
	
	@Before
	public void setup() {
		u = new UserImpl("Joe Bloggs");
		slough = new Library();
	}
	
	@Test
	public void testsGetName() {
		assertEquals("Joe Bloggs",u.getName());
	}
	
	@Test
	public void testsEmptyGetID() {
		assertEquals(0,u.getID());
	}
	
	@Test
	public void testsGetIDOnceSet() {
		u.setID(8);
		assertEquals(8,u.getID());
	}
	
	@Test
	public void testsRegister() {
		u.register(slough);
		assertEquals(13,u.getID());
		assertEquals(13,u.register(slough));
	}
	
	@Test
	public void testsGetLibrary() {
		u.register(slough);
		assertEquals(slough,u.getLibrary());
	}
	
}