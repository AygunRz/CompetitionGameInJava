import java.util.InputMismatchException;
import java.util.Scanner;

public class InputUtility {

    public static Integer askInt(String title) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(title);
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {

        }
        return -1;
    }

    public static String askString(String title) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(title);

        return scanner.nextLine();
    }
}
