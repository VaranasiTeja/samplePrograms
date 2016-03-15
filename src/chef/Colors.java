package chef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Colors {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int numTestCases = Integer.parseInt(br.readLine());
		Colors colors = new Colors();
		while (numTestCases > 0) {
			String input = br.readLine();
			System.out.println(colors.findMinNumberOfColorsToPainted(input));
			numTestCases--;
		}
	}

	public int findMinNumberOfColorsToPainted(String input) {
		int arr[] = new int[2];
		int result = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == 'a')
				arr[0] += 1;
			else
				arr[1] += 1;
		}
		if (arr[0] > arr[1])
			result = arr[1];
		else
			result = arr[0];
		return result;
	}
}
