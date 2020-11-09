public class second {

	// 1
	public long returnLowestLong(long a, long b) {
		return Math.min(a, b);
	}

	// 2
	public float returnLowestFloat(float a, float b) {
		return Math.min(a, b);
	}

	// 3
	public int returnLowestInt(int a, int b) {
		return Math.min(a, b);
	}

	// 4
	public double returnLowestDouble(double a, double b) {
		return Math.min(a, b);
	}

	// 5 & 7
	public int returnMaxInt(int a, int b) {
		return Math.max(a, b);
	}

	// 6
	public double returnMaxDouble(double a, double b) {
		return Math.max(a, b);
	}

	// 8
	public long returnMaxLong(long a, long b) {
		return Math.max(a, b);
	}

	// 9
	public double returnPow(double a, double b) {
		return Math.pow(a, b);
	}

	// 10
	public int returnPlusOneInt(int i) {
		if (i < Integer.MAX_VALUE)
			++i;
		return i;
	}

	// 11
	public long returnPlusOneLong(long i) {
		if (i < Long.MAX_VALUE)
			++i;
		return i;
	}

	// 12
	public int returnMinOneInt(int i) {
		if (i > Integer.MIN_VALUE)
			--i;
		return i;
	}

	// 13
	public long returnMinOneLong(long i) {
		if (i > Long.MIN_VALUE)
			--i;
		return i;
	}

	// 14
	public double returnSquareRootDouble(double d) {
		return Math.sqrt(d);
	}

	// 15
	public double returnCubeRootDouble(double d) {
		return Math.cbrt(d);
	}

}