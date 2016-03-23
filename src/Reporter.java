public class Reporter implements Spectator{

    @Override
    public void registerTo(FootballGame footballGame) {
        footballGame.register(this);
    }

    @Override
    public String react(String team) {
        return "Goal";
    }
}
