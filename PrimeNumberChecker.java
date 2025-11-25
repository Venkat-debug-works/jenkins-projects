import java.util.Scanner;

public class PrimeNumberChecker {

    /**
     * Checks if a given integer is a prime number.
     * A prime number is a natural number greater than 1 that has no positive divisors other than 1 and itself.
     * 
     * @param number The integer to check for primality.
     * @return true if the number is prime, false otherwise.
     */
    public static boolean isPrime(int number) {
        // Numbers less than or equal to 1 are not prime.
        if (number <= 1) {
            return false;
        }

        // Check for factors from 2 up to the square root of the number.
        // If a number 'n' has a factor greater than its square root, it must also have a smaller factor.
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                // If a factor is found, the number is not prime.
                return false;
            }
        }

        // If no factors were found in the loop, the number is prime.
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check for primality: ");
        
        if (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            if (isPrime(num)) {
                System.out.println(num + " is a prime number.");
            } else {
                System.out.println(num + " is not a prime number.");
            }
        } else {
            System.out.println("Invalid input. Please enter an integer.");
        }

        scanner.close(); // Close the scanner to prevent resource leaks.
    }
}

