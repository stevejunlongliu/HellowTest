package junittest;

import java.util.ArrayList;
import java.util.Collection;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class SimpleTest extends TestCase {
	public SimpleTest(String name) {
		super(name);
	}

	public void testEmptyCollection() {
		Collection collection = new ArrayList();
		assertTrue(collection.isEmpty());
	}

	public static Test suite() {
		return new TestSuite(SimpleTest.class);
	}

	public static void main(String args[]) {
		junit.textui.TestRunner.run(suite());
	}
}
