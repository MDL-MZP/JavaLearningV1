import java.util.Arrays;

/**
 * @description:
 * @author:
 * @time: 2020/4/17 2:17
 */
public class Score {
    private int[] scores;
    public Score(int[] scores) {
        this.scores = scores.clone();
    }

    public void printScores() {
        System.out.println(Arrays.toString(scores));
    }
}
