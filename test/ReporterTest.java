import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class ReporterTest {
    @Test
    public void shouldBeAbleToReactWhenUpdatedAboutAGoal() throws Exception {
        Reporter reporter = new Reporter();

        Assert.assertEquals("Goal",reporter.react("A"));
    }

    @Test
    public void shouldBeAbleToRegisterToFootballGame() throws Exception {
        Reporter reporter = new Reporter();

        FootballGame mockFootballGame = Mockito.mock(FootballGame.class);

        reporter.registerTo(mockFootballGame);

        Mockito.verify(mockFootballGame).register(reporter);

    }
}
