package catchexception;

import static com.googlecode.catchexception.CatchException.*;
import static com.googlecode.catchexception.apis.CatchExceptionBdd.*;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FooTheCatchExceptionWayTest {

	private Foo foo = new Foo();

	@Test
	public void do_something_should_throw_a_scary_exception() throws Exception {
		verifyException(foo, ScaryException.class).doSomething();
	}

	@Test
	public void do_something_should_throw_a_scary_exception_with_a_specific_message() throws Exception {
		catchException(foo).doSomething();

		assert caughtException() instanceof ScaryException;
		assertEquals("This is a very scary exception", caughtException().getLocalizedMessage());
	}

	@Test
	public void do_something_should_throw_a_scary_exception_with_a_specific_message_bdd_way() throws Exception {
		when(foo).doSomething();

		then(caughtException()).isInstanceOf(ScaryException.class).hasMessage("This is a very scary exception");
	}
}
