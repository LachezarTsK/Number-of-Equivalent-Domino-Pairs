
public class Solution {

    private static final int[] RANGE_OF_VALUES = {1, 9};

    public int numEquivDominoPairs(int[][] dominoes) {
        int[][] frequencyDominoes = new int[RANGE_OF_VALUES[1] + 1][RANGE_OF_VALUES[1] + 1];
        int countEquivalentDominoPairs = 0;

        for (int[] domino : dominoes) {
            int minValue = Math.min(domino[0], domino[1]);
            int maxValue = Math.max(domino[0], domino[1]);
            countEquivalentDominoPairs += frequencyDominoes[minValue][maxValue];
            ++frequencyDominoes[minValue][maxValue];
        }

        return countEquivalentDominoPairs;
    }
}
