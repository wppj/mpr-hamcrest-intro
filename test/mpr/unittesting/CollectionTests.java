package mpr.unittesting;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

import java.util.*;

import org.junit.Test;

public class CollectionTests {
	List<Integer> list = Arrays.asList(1,2,3,4,5,6);

	@Test
	public void everyItemTest() {
		// czy wszystkie elementy kolekcji są mniejsze niż 10
		assertThat(list, everyItem(lessThan(10)));
	}
	
	@Test
	public void hasItemTest() {
		// czy kolekcja zawiera element 6
		assertThat(list, hasItem(6));
	}
	
	@Test
	public void hasMatchingItemTest() {
		// czy kolekcja zawiera element większy niż 5
		assertThat(list, hasItem(is(greaterThan(5))));
	}
	
	@Test
	public void hasItemsTest() {
		// czy kolekcja zawiera elementy 6, 1, 2
		assertThat(list, hasItems(6, 1, 2));
	}
	
	@Test
	public void hasMatchingItemsTest() {
		// czy kolekcja zawiera elementy większe niż 5
		// oraz elementy mniejsze niż 4
		assertThat(list, hasItems(greaterThan(5), lessThan(4)));
	}
	
}
