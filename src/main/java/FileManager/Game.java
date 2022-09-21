package FileManager;

import java.io.FileWriter;

public class Game {

    enum GameType {

        SOCCER, HOCKEY, RUGBY


    }

    public static void writeNumOfPlayersPerTeam(GameType game) {
        int playersPerGame = 0;
        String fileName = "";

        try {
            switch (game) {
                case SOCCER:
                    fileName = "Soccer.txt";
                    playersPerGame = 11;
                    break;

                case HOCKEY:
                    fileName = "Hockey.txt";
                    playersPerGame = 5;
                    break;

                case RUGBY:
                    fileName = "Rugby.txt";
                    playersPerGame = 15;
                    break;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        FileManager fileManager = new FileManager();
        fileManager.writeToFile(fileName, Integer.toString(playersPerGame));

    }

}
