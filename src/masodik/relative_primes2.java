package masodik;
import java.util.*;

public class relative_primes2 {
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int n = read(1,10);
        System.out.println("For loops:");
        printRelativePrimes(10, n);
        System.out.println("Recursive:");
        printRelativePrimesRecursive(10, n);

	}
	
	public static int read(int min, int max) {
        int number = 0;
        do {
            System.out.println("Give me a number between " + min + " and " + max + "!");
            while (!input.hasNextInt()) {
                System.out.println("Bad input format!");
                input.next();
            }
            number = input.nextInt();
        } while (number < min || number > max);
        return number;
    }
    
    public static int GCD(int a, int b) {
        int gcd = 1;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
    
    public static int GCDRecursive(int a, int b) {
        if (b == 0) {
            return a;
        }
        return GCDRecursive(b, a % b);
    }
    
    public static void printRelativePrimes(int first, int n) {
        int rprimeCnt = 0;
        while (rprimeCnt < n) {
            for (int i = 2; i < first; i++) {
                if (GCD(first,i) == 1) {
                    System.out.println("first: " + first + " second: " + i);
                    rprimeCnt++;
                    if (rprimeCnt >= n)
                        break;
                }
            }
            first++;
        }
    }
    
    public static void printRelativePrimesRecursive(int first, int n) {
        int rprimeCnt = 0;
        while (rprimeCnt < n) {
            for (int i = 2; i < first; i++) {
                if (GCDRecursive(first,i) == 1) {
                    System.out.println("first: " + first + " second: " + i);
                    rprimeCnt++;
                    if (rprimeCnt >= n)
                        break;
                }
            }
            first++;
        }
    }

}

