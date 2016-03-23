public class Fan implements Spectator {
    private String team;

    public Fan(String team) {

        this.team = team;
    }

    @Override
    public void registerTo(FootballGame footballGame) {
        footballGame.register(this);
    }

    @Override
    public String react(String team) {
        if(this.team.equals(team))
            return "Yeah!";

        return "Sh**";
    }
}
