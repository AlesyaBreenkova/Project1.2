package FileManager;

public class Main {
    public static void main(String[] args) {

        Game.writeNumOfPlayersPerTeam(Game.GameType.HOCKEY);
        Game.writeNumOfPlayersPerTeam(Game.GameType.RUGBY);
        Game.writeNumOfPlayersPerTeam(Game.GameType.SOCCER);

    }
}
