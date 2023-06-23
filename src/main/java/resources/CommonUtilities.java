package resources;

import org.testng.asserts.SoftAssert;

public class CommonUtilities {
	public static void HanddleAssertion(String actual, String expected) {
		SoftAssert sa = new SoftAssert();
		String actualstring = actual;
		String expectedstring = expected;
		sa.assertEquals(actualstring, expectedstring);
		sa.assertAll();
	}

}
