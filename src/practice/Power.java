package practice;

public class Power {

	public long findPower(int num, int power) {
		long value = 1;
		for (int i = 0; i < power; i++) {
			value *= num;
		}
		return value;
	}

	public long findPowerByExponentiationBySquare(long num, long power) {
		if (power == 0)
			return 1;
		int value = 1;
		while (power > 1) {
			if ((power & 1) == 0) {
				num *= num;
				power = power >> 1;
			} else {
				value *= num;
				num *= num;
				power = (power - 1) >> 1;
			}
		}
		return num * value;
	}

	public long findPowerByExponentiationRecursiveWay(long num, long power) {
		if (power < 0)
			return findPowerByExponentiationRecursiveWay(1 / num, -power);
		else if (power == 1)
			return num;
		else if (power % 2 == 1)
			return num * findPowerByExponentiationRecursiveWay(num * num, (power - 1) / 2);
		else if (power % 2 == 0)
			return findPowerByExponentiationRecursiveWay(num * num, power / 2);
		else
			return 1;
	}

	public long expo(long num, long power) {
		int result = 1;

		while (power != 0) {
			if (power % 2 == 1) {
				result *= num;
				power -= 1;
			}
			num *= num;
			power /= 2;
		}

		return result;
	}
}
