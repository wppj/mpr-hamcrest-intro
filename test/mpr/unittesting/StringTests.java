package mpr.unittesting;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;
import org.junit.Test;
import java.util.*;

public class StringTests {

	@Test
	public void startsWithTest() {
		assertThat("ala ma kota", startsWith("a"));
	}

	@Test
	public void endsWithTest() {
		assertThat("ala ma kota", endsWith("a"));
	}
	
	@Test
	public void containsTest() {
		assertThat("ala ma kota", containsString("ma"));
	}

	@Test
	public void ignoringCaseTest() {
		assertThat("Ala ma kota", equalToIgnoringCase("Ala ma Kota"));
	}
	
	@Test
	public void ignoringWhiteSpaceTest() {
		// Ignorowane są wielokrotne odstępy i odstępy „brzegowe”
		assertThat("  Ala     ma ", equalToIgnoringWhiteSpace("Ala  ma"));
	}
	
	@Test
	public void containsInOrderTest() {
		assertThat("  Ala     ma ", stringContainsInOrder(Arrays.asList("A", "m")));
	}
	
	@Test
	public void regexTest() {
		// Stosujemy zdefiniowany uprzednio „matcher” wykorzystujący 
		// wyrażenia regularne
		assertThat("ala ma kota", RegexMatcher.matchesRegex("a.*a"));
	}
	
}
