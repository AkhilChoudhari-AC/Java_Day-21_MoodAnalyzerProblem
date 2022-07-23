package Com.BridgeLabz.MoodAnalyzer;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    @Test
    /**
     * created method analyseSadMood() for getting mood as sad
     */
    public void analyseSadMood() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        moodAnalyser.setMessage("I am in Sad Mood");
        String actualResult = moodAnalyser.analyseMood();
        Assert.assertEquals("SAD", actualResult);
    }

    @Test
    /**
     * created method analyseHappyMood() for getting mood as Happy
     */
    public void analyseHappyMood() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        moodAnalyser.setMessage("I am in Happy Mood");
        String actualResult = moodAnalyser.analyseMood();
        Assert.assertEquals("HAPPY", actualResult);
    }

    @Test
    /**
     * created method analyseNull() if value is null getting mood as Happy
     */
    public void analyseNull() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        moodAnalyser.setMessage(null);
        String actualResult = moodAnalyser.analyseMood();
        Assert.assertEquals("HAPPY", actualResult);
    }
}


