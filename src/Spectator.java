public interface Spectator {
    void registerTo(FootballGame footballGame);

    String react(String team);
}
