package chef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class PalindromeChecker {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int numTestCases = Integer.parseInt(br.readLine());
		PalindromeChecker palindromeChecker = new PalindromeChecker();
		while (numTestCases > 0) {
			String stringA = br.readLine();
			String stringB = br.readLine();
			System.out.println(palindromeChecker.checkPalindromes(stringA, stringB));
			numTestCases--;
		}
	}

	public String checkPalindromes(String stringA, String stringB) {
		String result = "No";
		for (int i = 0; i < stringA.length(); i++) {
			for (int j = 0; j < stringB.length(); j++) {
				if (stringA.charAt(i) == stringB.charAt(j)) {
					result = "Yes";
					break;
				}
			}
			if (result == "Yes")
				break;
		}
		return result;
	}
}
