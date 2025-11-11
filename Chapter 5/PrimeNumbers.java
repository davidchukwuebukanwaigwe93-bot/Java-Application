public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println("Prime numbers less than 10000:");
        int count = 0;
        
        // Test all numbers from 2 to 10000
        for (int number = 2; number < 10000; number++) {
            if (isPrime(number)) {
                System.out.printf("%d ", number);
                count++;
                if (count % 10 == 0) System.out.println();
            }
        }
        
        System.out.printf("%nTotal primes found: %d%n", count);
    }
    
    // Part a - Basic prime check
    public static boolean isPrime(int number) {
        // Part c - Only check up to square root for efficiency
        int limit = (int) Math.sqrt(number);
        
        for (int divisor = 2; divisor <= limit; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}