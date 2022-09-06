import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Game {
    public static void play() {
        if (ParticipantUtil.participants == null || ParticipantUtil.participants.length <= 1) {
            System.out.println("You do not have enough players registered");
            return;
        }

        System.out.println("The game has started");
        Scanner scanner = new Scanner(System.in);
        int randomNum = ThreadLocalRandom.current().nextInt(0, ParticipantUtil.participants.length);
        int life = ParticipantUtil.participants.length / 2;
        int maxLives = 3;
        if (life > maxLives) {
            life = maxLives;
        }

        while (life > 0) {
            System.out.print("Which player was selected? ");
            int answer = scanner.nextInt();
            if (answer == (randomNum + 1)) {
                System.out.println("----------------------------------");
                System.out.println("Congratulations you won!");
                System.out.println("The selected player is " + ParticipantUtil.participants[randomNum].getFullInfo());
                return;
            } else {
                System.out.println("----------------------------------");
                life--;
                if (life > 0) {
                    System.out.println("Wrong guess, try again!");
                }
            }
        }

        System.out.println("----------------------------------");
        System.out.println("No lives left. You failed!");
        System.out.println("The selected player was " + (randomNum + 1) + ". " + ParticipantUtil.participants[randomNum].getFullInfo());
    }
}
