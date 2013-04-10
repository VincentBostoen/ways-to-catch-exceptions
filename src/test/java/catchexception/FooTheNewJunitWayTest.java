package catchexception;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class FooTheNewJunitWayTest {

	@Rule
	public ExpectedException exception = ExpectedException.none();

	private Foo foo = new Foo();

	@Test
	public void do_something_should_throw_a_scary_exception() throws Exception {
		exception.expect(ScaryException.class);
		exception.expectMessage("This is a very scary exception");

		foo.doSomething();
	}
}
