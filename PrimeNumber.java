import java.util.Scanner;
public class PrimeNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("PLEASE INSERT ANY NUMBER:");
        int num = input.nextInt();

        boolean isPrime = true;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
            if (num == 0|| num == 1 || isPrime == false)  {
                System.out.println(num + " is not prime number");
            }
            else {
                if (isPrime == true)
                    System.out.println(num + " is a prime number");
            }
    }
}
