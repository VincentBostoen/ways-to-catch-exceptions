package catchexception;

public class Foo {

	public void doSomething() throws ScaryException {
		throw new ScaryException("This is a very scary exception");
	}

}
