package com.uranus.util;

public class StringUtil {
	
	private static final String regex = ".*[<>&\"'].*";

	public static String sanitize(String str) {
		if (str.equals(null) || str.equals("")) return null;
		if (str.matches(regex)) {
			str = str.replaceAll("<", "&lt");
			str = str.replaceAll(">", "&gt");
			str = str.replaceAll("&", "&amp;");
			str = str.replaceAll("\"", "&quot;");
			str = str.replaceAll("'", "&apos;");
		}
		return str;
	}
}
