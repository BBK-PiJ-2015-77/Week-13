import org.junit.*;
import org.junit.Before;
import static org.junit.Assert.*;

public class BookImplTest{
	private Book bk;
	
	@Before
	public void setup() {
		bk = new BookImpl("Joe Bloggs","Harry Potter");
	}
	
	@Test
	public void testsGetAuthor() {
		assertEquals("Joe Bloggs", bk.getAuthor());
	}
	
	@Test
	public void testsGetTitle() {
		assertEquals("Harry Potter", bk.getTitle());
	}
	
	
}