public class TCVCrawler {

	/**
	 * Converts HTML numeric character references (e.g., &#2986;&#2975;&#3016;)
	 * to their corresponding Unicode characters.
	 *
	 * @param input HTML string containing numeric references
	 * @return Decoded Unicode string
	 */
	public static String decodeHtmlNumeric(String input) {
		if (input == null || input.isEmpty()) {
			return input;
		}

		StringBuilder result = new StringBuilder();
		int i = 0;

		while (i < input.length()) {
			int start = input.indexOf("&#", i);
			if (start == -1) {
				// Append the rest of the text
				result.append(input.substring(i));
				break;
			}

			// Append text before the entity
			result.append(input.substring(i, start));
			int end = input.indexOf(';', start);
			if (end == -1) {
				// Invalid entity, append as-is
				result.append(input.substring(start));
				break;
			}

			String entity = input.substring(start + 2, end);
			try {
				int codePoint = Integer.parseInt(entity);
				result.append((char) codePoint);
			} catch (NumberFormatException e) {
				// Not a valid number, append as-is
				result.append(input, start, end + 1);
			}
			i = end + 1;
		}

		return result.toString();
	}

	// Example usage
	public static void main(String[] args) {
		String html = "&#2950;&#2992;&#2990;&#3021;&#2986;&#2980;&#3021;&#2980;&#3007;&#2994;&#3021; &#2951;&#2993;&#3016;&#2997;&#2985;&#3021; &#2997;&#3006;&#2985;&#2969;&#3021;&#2965;&#2995;&#3016;&#2991;&#3009;&#2990;&#3021; &#2986;&#3010;&#2990;&#3007;&#2991;&#3016;&#2991;&#3009;&#2990;&#3021; &#2986;&#2975;&#3016;&#2980;&#3021;&#2980;&#3006;&#2992;&#3021;";
		String decoded = decodeHtmlNumeric(html);
		System.out.println(decoded);
	}
}
