package practice;

import org.junit.Assert;
import org.junit.Test;

public class StringPalindromesTest {

	@Test
	public void testStringPalindromes() {
		StringPalindromes strPalindromes = new StringPalindromes();
		Assert.assertEquals(strPalindromes.checkPalindromes("abba", "baab"), "yes");
		Assert.assertEquals(strPalindromes.checkPalindromes("a", "b"), "no");
		Assert.assertEquals(strPalindromes.checkPalindromes("abc", "abc"), "yes");
	}

}
