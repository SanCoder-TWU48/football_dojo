import java.util.ArrayList;
import java.util.List;

public class FootballGame {
    private List<Spectator> spectators;

    public FootballGame() {
        this.spectators = new ArrayList<>();
    }

    public void goal(String team) {
        for(Spectator spectator : spectators) {
            spectator.react(team);
        }
    }

    public boolean register(Spectator spectator) {
        spectators.add(spectator);
        return true;
    }
}
