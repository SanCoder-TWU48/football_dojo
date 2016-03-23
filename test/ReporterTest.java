import org.junit.Assert;
import org.junit.Test;

public class ReporterTest {
    @Test
    public void shouldBeAbleToReactWhenUpdatedAboutAGoal() throws Exception {
        Reporter reporter = new Reporter();

        Assert.assertEquals("Goal",reporter.react());
    }
}
