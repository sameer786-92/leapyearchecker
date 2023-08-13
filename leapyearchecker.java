import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continueloop = true;

        while (continueloop) {
            System.out.println("Enter a year: ");

            int year = sc.nextInt();

            if (year == 0) {
                continueloop = false;
            } else if (year >= 1000 && year <= 9999) {
                if (year % 4 == 0) {
                    System.out.println(year + " is a leap year!");
                } else {
                    System.out.println(year + " is not a leap year!");
                }
            } else {
                System.out.println("Enter four digits!");
            }
            System.out.println("enter 0 for exit loop: ");
        }
        System.out.println("Program Exited!!...");
        sc.close();
    }
}
