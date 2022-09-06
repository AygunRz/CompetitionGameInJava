public class Main {

    public static void main(String[] args) {
        while(true) {
            Login.login();

            while (true) {
                System.out.println("---------------------------------- \n" +
                        "1. Register the participants \n" +
                        "2. Start the game \n" +
                        "3. Logout \n" +
                        "4. Exit");
                System.out.println("----------------------------------");
                Integer menu = InputUtility.askInt("Which operation would you like to perform: ");

                if (menu == 1) {
                    ParticipantUtil.registerParticipants();
                    ParticipantUtil.printAllRegisteredParticipants();
                } else if (menu == 2) {
                    System.out.println("----------------------------------");
                    Game.play();
                    System.out.println("----------------------------------");
                } else if (menu == 3) {
                    System.out.println("----------------------------------");
                    System.out.println("You are logged out");
                    System.out.println("----------------------------------");
                    break;
                } else if (menu == 4) {
                    System.exit(0);
                } else {
                    System.out.println("----------------------------------");
                    System.out.println("Wrong entry");
                }
            }
        }
    }
}
