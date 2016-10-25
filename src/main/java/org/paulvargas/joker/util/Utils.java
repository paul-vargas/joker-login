package org.paulvargas.joker.util;

import java.util.Objects;

public class Utils {

	public static <T> T nvl(T expr1, T expr2) {
		Objects.requireNonNull(expr2, "");
		return expr1 == null ? expr2 : expr1;
	}

	public static boolean hasText(String str) {
		return str != null && str.length() > 0 && str.matches(".*?[^\\p{javaWhitespace}].*");
	}

}
