import java.util.Scanner;

public class Money {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double presentValue;
        double rate;
        int month;
        boolean isValid = false;

        do {
            System.out.print("Enter money: ");
            presentValue = scanner.nextDouble();
            System.out.print("Enter interest (in percentage): ");
            rate = scanner.nextDouble();
            System.out.print("Enter month: ");
            month = scanner.nextInt();
            if (presentValue > 0 && rate > 0 && month > 0) {
                isValid = true;
            }
            if (!isValid) {
                System.out.println("Invalid input. Please enter again! \n");
            }
        } while (!isValid);

        double futureValue = presentValue;
        rate = rate / 12;
        System.out.println();
        for (int index = 1; index <= month; index++) {
            futureValue *= (1 + rate / 100);
            System.out.printf("Your money in month %d is %.0f \n", index, futureValue);
        }

        System.out.println();
        System.out.printf("After %d month, your interest money is %.0f \n", month, (futureValue - presentValue));
        System.out.printf("And your money is %.0f", futureValue);

    }
}
