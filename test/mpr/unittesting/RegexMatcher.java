package mpr.unittesting;

import org.hamcrest.Description;
import org.hamcrest.TypeSafeMatcher;

// Hamcrest umożliwia tworzenie własnych matcher-ów
// Poniżej przykład matcher-a wykorzystującego wyrażenia regularne

public class RegexMatcher extends TypeSafeMatcher<String> {
	
	private final String regex;

	public RegexMatcher(final String regex) {
		this.regex = regex;
	}

	@Override
	public void describeTo(final Description desc) {
		// definiujemy jak ma wyglądać komunikat
		desc.appendText("matches regular expression: \"" + regex + "\"");
	}

	@Override
	public boolean matchesSafely(final String string) {
		// definiujemy co ma robić matcher
		return string.matches(regex);
	}

	// metoda, której uzywać będziemy w asercjach
	public static RegexMatcher matchesRegex(final String regex) {
		return new RegexMatcher(regex);
	}
} 