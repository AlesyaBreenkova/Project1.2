package AdditionalAssignment;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String example_wins = "ABBBCCBBBAAABBBCCC";
        BoardGame boardGame = new BoardGame();

        Integer[] scores = boardGame.calculateScores(example_wins);

        System.out.println(Arrays.toString(scores));
//

//        BoardGame player1 = new BoardGame(BoardGame.Player.A);
//        BoardGame player2= new  BoardGame(BoardGame.Player.B);
//        BoardGame player3 = new  BoardGame(BoardGame.Player.C);


    }
}
