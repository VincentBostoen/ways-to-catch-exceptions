package catchexception;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

public class FootTheOldJunitWayTest {

	private Foo foo = new Foo();

	@Test(expected = ScaryException.class)
	public void do_something_should_throw_a_scary_exception() throws Exception {
		foo.doSomething();
	}

	@Test
	public void do_something_should_throw_a_scary_exception_with_a_specific_message() {
		try {
			foo.doSomething();
			fail();
		} catch (Exception e) {
			assertTrue(e instanceof ScaryException);
			assertEquals("This is a very scary exception", e.getLocalizedMessage());
		}
	}
}
