import java.util.Random;
import java.util.Scanner;

public class DieRoller {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        boolean playAgain = true;

        while (playAgain) {
            int rollCount = 0;
            int die1, die2, die3;

            System.out.printf("%-10s%-10s%-10s%-10s%-10s%n", "Roll", "Die1", "Die2", "Die3", "Sum");
            System.out.println("-------------------------------------------------");

            do {
                rollCount++;
                die1 = random.nextInt(6) + 1;
                die2 = random.nextInt(6) + 1;
                die3 = random.nextInt(6) + 1;
                int sum = die1 + die2 + die3;
                System.out.printf("%-10d%-10d%-10d%-10d%-10d%n", rollCount, die1, die2, die3, sum);
            } while (!(die1 == die2 && die2 == die3));  // Continue until a triple is rolled

            System.out.print("Do you want to play again? (yes/no): ");
            String response = scanner.next().toLowerCase();
            playAgain = response.equals("yes");
        }

        System.out.println("Thanks for playing!");
        scanner.close();
    }
}