package chef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SpecialDish {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int numTestCases = Integer.parseInt(br.readLine());
		while (numTestCases > 0) {
			SpecialDish splDish = new SpecialDish();
			String dish = br.readLine();
			if (dish.length() >= 2) {
				if (splDish.ifSpecialDish(dish))
					System.out.println("YES");
				else
					System.out.println("NO");
			} else
				System.out.println("NO");
			numTestCases--;
		}
	}

	public boolean ifSpecialDish(String dish) {
		boolean result = false;
		if ((dish.length() % 2) == 0) {
			result = dish.substring(0, dish.length() / 2).equals(dish.substring(dish.length() / 2, dish.length()))
					? true : false;
		} else {
			String subStr1 = dish.substring(0, dish.length() / 2);
			String subStr2 = dish.substring((dish.length() / 2));
			int count = checkDoubleString(subStr1, subStr2);
			if (count == 1 || count == 0)
				result = true;
			else {
				subStr1 = dish.substring(0, (dish.length() / 2) + 1);
				subStr2 = dish.substring((dish.length() / 2) + 1);
				if (checkDoubleString(subStr1, subStr2) == 1)
					result = true;
				else
					result = false;
			}
		}
		return result;
	}

	int checkDoubleString(String substr1, String substr2) {
		int count = 0, k = 0;
		for (int i = 0; i < substr1.length();) {
			if (k < substr2.length()) {
				if (substr1.charAt(i) == substr2.charAt(k)) {
					i++;
					k++;
				} else {
					if (substr1.length() > substr2.length()) {
						i++;
						count++;
					} else {
						k++;
						count++;
						if (count > 1)
							break;
					}
				}
			}
		}

		return count;
	}
}