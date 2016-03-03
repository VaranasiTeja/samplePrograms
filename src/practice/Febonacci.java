package practice;

import java.util.HashMap;

public class Febonacci {
	public int findNthFebonacci(int n) {
		HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
		if (n > 0) {
			hashmap.put(0, 0);
			hashmap.put(1, 1);
			for (int i = 2; i < n; i++) {
				hashmap.put(i, hashmap.get(i - 1) + hashmap.get(i - 2));
			}
			return hashmap.get(n - 1);
		} else
			return -1;
	}
}
