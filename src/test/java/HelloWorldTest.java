import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;


public class HelloWorldTest {

	private final ByteArrayOutputStream outStream = new ByteArrayOutputStream();
	
	@Before
	public void setUp() {
	    System.setOut(new PrintStream(outStream));
	}

	@Test
	public void testSayHello() {
		HelloWorld hw = new HelloWorld();
		hw.sayHello();
		assertEquals("Hello World", outStream.toString());
		assertEquals(1, 4-3);
		assertEquals(1, 3-2);
	}
	
	@After
	public void cleanUp() {
	    System.setOut(null);
	}
	
}
