public class PrimeCheck {
    public static void main(String[] args) {
        int number = 7919;
        if(number > 1) {
            int countDivisibility = 0;
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    countDivisibility++;
                }
            }
            if (countDivisibility == 2) {
                System.out.println("prime number");
            } else {
                System.out.println("Not a prime number");
            }
        }else {
            System.out.println("prime number check not possible, either number is negative or 0 or 1");
        }

    }
}
