import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;


public class FootballGameTest {
    @Test
    public void shouldBeAbleToNotifyReportWhenGoalIsScored() {
        Reporter mockReporter = Mockito.mock(Reporter.class);
        FootballGame footballGame = new FootballGame();
        footballGame.register(mockReporter);
        footballGame.goal("A");

        Mockito.verify(mockReporter).react("A");
    }

    @Test
    public void shouldBeAbleToRegisterReporter() throws Exception {
        Reporter mockReporter = Mockito.mock(Reporter.class);
        FootballGame footballGame = new FootballGame();

        Assert.assertTrue(footballGame.register(mockReporter));
    }


    @Test
    public void shouldBeAbleToNotifyFanWhenGoalIsScored() {
        Spectator mockFan = Mockito.mock(Fan.class);
        FootballGame footballGame = new FootballGame();
        footballGame.register(mockFan);
        footballGame.goal("A");

        Mockito.verify(mockFan).react("A");
    }

    @Test
    public void shouldBeAbleToRegisterFan() throws Exception {
        Spectator mockFan = Mockito.mock(Fan.class);
        FootballGame footballGame = new FootballGame();

        Assert.assertTrue(footballGame.register(mockFan));
    }
}
