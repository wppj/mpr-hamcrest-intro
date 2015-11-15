package mpr.unittesting;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class ReferenceTests {

	@Test
	public void nullTest() {
		String str = null;
		assertThat(str, is(nullValue()));
	}

	@Test
	public void nonNullTest() {
		Object str = "ala ma kota";
		assertThat(str, notNullValue());
	}

	@Test
	public void sameInstanceTest() {
		Note n = () -> 10;
		// oczywiście ten test się nie powiedzie…
		assertThat(n, sameInstance(() -> 10));
	}
	
}
