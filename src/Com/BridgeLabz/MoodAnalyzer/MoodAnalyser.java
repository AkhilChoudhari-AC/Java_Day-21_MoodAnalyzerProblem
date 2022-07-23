package Com.BridgeLabz.MoodAnalyzer;

public class MoodAnalyser {
    private String message;

    /**
     * create default constructor of MoodAnalyser
     */
    public MoodAnalyser() {
        this.message = null;
    }

    /**
     * create parameterized constructor by passing string message
     *
     * @param message -passing string message
     */
    public MoodAnalyser(String message) {
        this.message = message;
    }

    /**
     * creating getter setter method
     *
     * @return -return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * this method will compute if the mood is happy or sad. 1. We will convert the
     * message to lower case and check it the string contains happy or sad word in
     * it. Accordingly we will return Happy or Sad mood
     *
     * @return -return to the method created
     */

    public String analyseMood() {
        if (message.toLowerCase().contains("happy") || message.toLowerCase().contains("any")) {
            return "HAPPY";
        } else if (message.toLowerCase().contains("sad")) {
            return "SAD";
        } else {
            return null;
        }
    }

    /**
     * Main method for manipulation Of MoodAnalyser
     *
     * @param args - Default Java param (Not used)
     */
    public static void main(String args[]) {
        System.out.println("Mood Analyser");

        /**
         * created object of moodAnalyser class
         */
        MoodAnalyser moodAnalyser = new MoodAnalyser();

        moodAnalyser.setMessage("I am Happy");
        System.out.println(moodAnalyser.analyseMood());

        moodAnalyser.setMessage("I am Sad");
        System.out.println(moodAnalyser.analyseMood());

    }
}