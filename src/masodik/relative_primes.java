package masodik;

public class relative_primes {

	public static void main(String[] args) {
		System.out.println(GCD(6,12));
		
	}
	
	public static int GCD(int a, int b) {
		if (b==0) {
			return a;
		}
		return GCD(b, a % b);
	}

}
