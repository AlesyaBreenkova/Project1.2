package AdditionalAssignment;

import org.apache.commons.lang3.StringUtils;

public class BoardGame {
    public Integer[] calculateScores(String wins){

        String[] players = {"A", "B", "C"};

        Integer countA = StringUtils.countMatches(wins, "A");
        Integer countB = StringUtils.countMatches(wins, "B");
        Integer countC = StringUtils.countMatches(wins, "C");

//        Integer[] scores = Arrays.stream(players).map(player -> StringUtils.countMatches(wins, player));

        Integer[] scores = {countA, countB, countC};

        return scores;

    }
}



