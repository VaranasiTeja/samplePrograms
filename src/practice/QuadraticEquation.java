package practice;

public class QuadraticEquation {

	public double[] getRootsOfEquation(double a, double b, double c) {
		double delta = b * b - 4 * a * c;
		double[] result = new double[2];
		if (delta < 0)
			throw new RuntimeException("No roots are possible for given Inputs");
		else {
			double deltaSquareRoot = Math.sqrt(delta);
			double firstRoot = (-b + deltaSquareRoot) / (2 * a);
			double secondRoot = (-b - deltaSquareRoot) / (2 * a);
			result[0] = firstRoot;
			result[1] = secondRoot;
		}
		return result;
	}

}
