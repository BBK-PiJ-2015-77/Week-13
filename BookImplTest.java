import org.junit.*;
import static org.junit.Assert.*;

public class BookImplTest{

	@Test
	public void testsGetAuthor() {
		String inputA = "Joe Bloggs";
		String inputT = "";
		Book b = new BookImpl(inputA,inputT);
		String output = b.getAuthor();
		String expected = "Joe Bloggs";
		assertEquals(output, expected);
	}
	
	
	
}