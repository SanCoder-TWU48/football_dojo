public class FootballGame {
    private Reporter reporter;

    public FootballGame(Reporter reporter) {
        this.reporter = reporter;
    }

    public void goal() {
        reporter.react();
    }
}
