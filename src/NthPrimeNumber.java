import java.util.Scanner;
/*
1. take user input
2. call nthPrime method and pass the user input
3. repeat the process of finding prime number till nth prime by calling
 isPrime method and count the prime numbers
4. return the nth prime
5. print the nth prime from the main
 */
public class NthPrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long nthNumber = scanner.nextLong();
        long nthPrimeNumber = nthPrime(nthNumber);
        System.out.println("nthPrimeNumber = " + nthPrimeNumber);

    }
    public static long nthPrime(long nthNumber){
        long response = 0;
        int countNthPrime = 0;
        long numberToCheckForPrime = 2;
        while (countNthPrime != nthNumber){
            if(isPrime(numberToCheckForPrime)){
                countNthPrime ++;
            }
            numberToCheckForPrime++;
        }
        response = numberToCheckForPrime - 1;
        return response;
    }

    public static boolean isPrime(long number){
        boolean isPrime = true;
        for (int i = 2; i < number ; i++) {
            if(number % i == 0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}
