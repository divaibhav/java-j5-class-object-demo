import java.util.Scanner;

public class PrintEvenDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your mobile number");
        String numberString = scanner.nextLine();

        for (int i = 0; i < numberString.length(); i++) {
            char digitChar = numberString.charAt(i);
            int digit = Integer.parseInt(digitChar + "");

            if(digit % 2 == 0){
                System.out.println(digit);
            }
        }
    }
}
