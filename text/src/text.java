/**
 * @description:
 * @author:
 * @time: 2020/4/16 3:06
 */
public class text {
    public static void main(String[] args) {
        int[] scores = new int[] { 88, 77, 51, 66 };
        Score s = new Score(scores);
        s.printScores();
        scores[2] = 99;
        s.printScores();
        //4月17日
        //？？？
    }
}
