import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class FanTest {
    @Test
    public void shouldBeAbleToReactPositivelyWhenUpdatedAboutAGoal() throws Exception {
        Spectator fan = new Fan("A");

        Assert.assertEquals("Yeah!",  fan.react("A"));
    }

    @Test
    public void shouldBeAbleToReactNegativelyWhenUpdatedAboutAGoal() throws Exception {
        Spectator fan = new Fan("B");

        Assert.assertEquals("Sh**", fan.react("A"));
    }

    @Test
    public void shouldBeAbleToRegisterToFootballGame() throws Exception {
        Spectator fan = new Fan("A");

        FootballGame mockFootballGame = Mockito.mock(FootballGame.class);

        fan.registerTo(mockFootballGame);

        Mockito.verify(mockFootballGame).register(fan);
    }
}
