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
     * @param message
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



    public String analyseMood() {
        try {
            if (message.toLowerCase().contains("sad")) {
                return "SAD";
            } else {
                return "HAPPY";
            }
        } catch (NullPointerException e) {
            return "HAPPY";
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

        moodAnalyser.setMessage(null);
        System.out.println(moodAnalyser.analyseMood());
    }
}