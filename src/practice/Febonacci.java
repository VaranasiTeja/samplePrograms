package practice;

import java.math.BigInteger;
import java.util.HashMap;

public class Febonacci {
	HashMap<Integer, BigInteger> hashmap = new HashMap<Integer, BigInteger>();

	public Febonacci() {
		hashmap.put(0, BigInteger.ZERO);
		hashmap.put(1, BigInteger.ONE);
	}

	public BigInteger findNthFebonacci(int num) {
		if (num < 0)
			throw new RuntimeException("Please no negative numbers");
		if (hashmap.get(num - 1) != null)
			return hashmap.get(num - 1);
		hashmap.put(num - 1, findNthFebonacci(num - 1).add(findNthFebonacci(num - 2)));
		return hashmap.get(num - 1);
	}
}
