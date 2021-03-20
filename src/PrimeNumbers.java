public class PrimeNumbers {
    public static void main(String[] args) {
        for (int i=2; i<=100; i++){
            if(isPrime(i)){ System.out.println(i); }
        }
    }
    private static boolean isPrime(int num) {
        for(int m=2; m<=Math.sqrt(num); m++){
            if(num % m == 0) { return false; }
        }
        return true;
    };
}