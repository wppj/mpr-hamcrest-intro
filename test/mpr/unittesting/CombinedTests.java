package mpr.unittesting;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;
import java.util.*;
import org.junit.Test;

public class CombinedTests {
	// Różne sposoby kombinowania ze sobą matcher-ów
	
	@Test
	public void anyOfTest() {
		// dopasowany musi zostać przynajmniej jeden
		assertThat(4, anyOf(Arrays.asList(
			equalTo(3),
			equalTo(4)
		)));
	}

	@Test
	public void allOfTest() {
		// dopasowane zostać muszą wszystkie
		assertThat(4, allOf(Arrays.asList(
			lessThan(7),
			greaterThan(0),
			is(instanceOf(Integer.class))
		)));
	}
	
	@Test
	public void notTest() {
		// matcher można też zanegować
		assertThat(4, not(equalTo(3)));
	}
	
	@Test
	public void bothTest() {
		// koniunkcja matcher-ów
		assertThat(4, both(greaterThan(0)).and(lessThanOrEqualTo(10)));
	}
	
	@Test
	public void eitherTest() {
		// alternatywa matcher-ów
		assertThat(4, either(greaterThanOrEqualTo(0)).or(lessThan(-1)));
	}
	
	@Test
	public void isOneOfTest() {
		// alternatywa wartości
		assertThat(4, isOneOf(1,2,3,4,5,6));
	}
	
}
