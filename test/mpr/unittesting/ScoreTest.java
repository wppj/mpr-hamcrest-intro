package mpr.unittesting;

import org.junit.Test;
import static org.junit.Assert.*;

//import static org.hamcrest.core.IsEqual.*;
import static org.hamcrest.Matchers.*;

public class ScoreTest {

	@Test
	public void test() {
		// 1. przygotowanie danych
		Score score = new Score();
		score.add(() -> 10);
		score.add(() -> 4);
		
		// 2. obliczenie wartości
		int result = score.computeScore();
		
		// 3. asercja (jUnit)
		assertThat(result, is(equalTo(7)));
		// <T> Matcher<T> equalTo(T elem)
		// <T> Matcher<T> is(Matcher<T> m)
		// <T> Matcher<T> is(T elem)
		//
		// wykorzystując powyższą postać metody is(…) asercję moglibyśmy zapisać też tak:
		// assertThat(result, is(7));
	}

}
