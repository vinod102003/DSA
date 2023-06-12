import java.util.Arrays;

public class BagOfToken {

    public static int bagOfTokenScore(int[] tokens, int power) {
        Arrays.sort(tokens);

        int left = 0, right = tokens.length - 1, score = 0, max_score = 0;

        while (left <= right) {
            if (power >= tokens[left]) {
                power -= tokens[left];
                score++;
                left++;
                max_score = Math.max(max_score, score);
            } else if (score >= 1) {
                power += tokens[right];
                score--;
                right--;
            } else {
                break;
            }
        }

        return max_score;
    }

    public static void main(String[] args) {
        int tokens[] = {100, 200, 300, 400};
        int power = 200;
        int res = bagOfTokenScore(tokens, power);
        System.out.println(res);
    }
}


