package practice;

import java.math.BigInteger;
import java.util.HashMap;

public class Febonacci {
	HashMap<Integer, BigInteger> hashmap = new HashMap<Integer, BigInteger>();

	public BigInteger findNthFebonacci(int num) {
		if (hashmap.size() > num) {
			return hashmap.get(num - 1);
		} else if (num > 0) {
			if (hashmap.size() < 2) {
				hashmap.put(0, BigInteger.ZERO);
				hashmap.put(1, BigInteger.ONE);
			}
			for (int key = hashmap.size(); key < num; key++) {
				hashmap.put(key, hashmap.get(key - 1).add(hashmap.get(key - 2)));
			}
			System.out.println(hashmap);
			return hashmap.get(num - 1);
		} else
			throw new RuntimeException("Please no negative numbers");
	}
}
