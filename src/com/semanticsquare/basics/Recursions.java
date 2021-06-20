class Recursions {
	static int factorial(int n) {
		if(n == 0){
			return 1;
		}
		return n * factorial(n - 1);
	}
	
	static int biSearch(double[] a, int low, int high, double value) {
		if(low == high){
			if(a[low] == value) return low;
			else return -1;
		}
		int mid = (low + high) / 2;
		if(a[mid] < value) {
			low = mid + 1;
			return biSearch(a, low, high, value);
		} else if(a[mid] > value) {
			high = mid - 1;
			return biSearch(a, low, high, value);
		} else return mid;
	}
	public static void main(String[] args) {
		System.out.println(factorial(7));
		double[] a = {4,7,45,56,79, 100};
		double key = 56;
		System.out.println(biSearch(a, 0, a.length - 1, key));
	}
}