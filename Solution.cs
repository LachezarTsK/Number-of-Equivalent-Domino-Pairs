
using System;

public class Solution
{
    private static readonly int[] RANGE_OF_VALUES = { 1, 9 };

    public int NumEquivDominoPairs(int[][] dominoes)
    {
        int[,] frequencyDominoes = new int[RANGE_OF_VALUES[1] + 1, RANGE_OF_VALUES[1] + 1];
        int countEquivalentDominoPairs = 0;

        foreach (int[] domino in dominoes)
        {
            int minValue = Math.Min(domino[0], domino[1]);
            int maxValue = Math.Max(domino[0], domino[1]);
            countEquivalentDominoPairs += frequencyDominoes[minValue, maxValue];
            ++frequencyDominoes[minValue, maxValue];
        }

        return countEquivalentDominoPairs;
    }
}
