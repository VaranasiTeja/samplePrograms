package practice;

public class StringPalindromes {

	public String checkPalindromes(String stringA, String stringB) {
		String result = "no";
		for (int i = 0; i < stringA.length(); i++) {
			for (int j = 0; j < stringB.length(); j++) {
				if (stringA.charAt(i) == stringB.charAt(j)) {
					result = "yes";
					break;
				}
			}
			if (result == "yes")
				break;
		}
		return result;
	}
}
