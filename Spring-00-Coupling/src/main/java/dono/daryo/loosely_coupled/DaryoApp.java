package dono.daryo.loosely_coupled;

public class DaryoApp {
    public static void main(String[] args) {

        FullTimeMentor fullTime = new FullTimeMentor();
        // PartTimeMentor partTime = new PartTimeMentor();

        MentorAccount mentor = new MentorAccount(fullTime);

        mentor.manageAccount();

    }
}
