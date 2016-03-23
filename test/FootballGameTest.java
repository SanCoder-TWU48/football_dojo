import org.junit.Test;
import org.mockito.Mockito;


public class FootballGameTest {
    @Test
    public void shouldBeAbleToNotifyReportWhenGoalIsScored() {
        Reporter mockReporter = Mockito.mock(Reporter.class);
        FootballGame footballGame = new FootballGame(mockReporter);
        footballGame.goal();

        Mockito.verify(mockReporter).react();
    }
}
