import java.util.Scanner;

public class Login {
    public static void login() {
        int count = 1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("----------------------------------");
        System.out.println("Welcome to our game! Please log in.");
        System.out.println("----------------------------------");

        while (count <= 3) {
            System.out.print("Enter your username: ");
            String user = scanner.nextLine();

            System.out.print("Enter your password: ");
            String pass = scanner.nextLine();
            if (!user.equals("Liam") || (!pass.equals("12"))) {
                System.out.println(count + ". Wrong entry. please try again!");
            } else {
                System.out.println("----------------------------------");
                System.out.println("Successfully login!");
                break;
            }
            count++;
        }
        if (count > 3) {
            System.out.println("----------------------------------");
            System.out.println("You have entered wrong three times. You banned!");

            System.exit(0);
        }
    }
}
