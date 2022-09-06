public class ParticipantUtil {

    public static Participant[] participants = null;

    private static Participant prepareParticipant(int i) {
        Participant participant = new Participant();

        participant.setName(InputUtility.askString("What is the name of the " + (i+1) + ". participant: "));
        participant.setSurname(InputUtility.askString("What is the surname of the " + (i+1) + ". participant: "));

        return participant;
    }

    public static void registerParticipants() {
        int registrationCount = InputUtility.askInt("How many participants do you want to register: ");
        participants = new Participant[registrationCount];

        for (int i = 0; i < registrationCount; i++) {
            participants[i] = prepareParticipant(i);
        }
    }

    public static void printAllRegisteredParticipants() {
        if(participants == null){
            return;
        }
        System.out.println("----------------------------------");
        for(int i = 0; i< participants.length; i++) {
            Participant pt = participants[i];
            System.out.println((i+1)+". "+pt.getFullInfo());

        }
    }
}
