
import kotlin.math.min
import kotlin.math.max

class Solution {

    companion object {
        val RANGE_OF_VALUES = intArrayOf(1, 9)
    }

    fun numEquivDominoPairs(dominoes: Array<IntArray>): Int {
        val frequencyDominoes = ArrayList<IntArray>(RANGE_OF_VALUES[1] + 1)
        for (i in 0..<RANGE_OF_VALUES[1] + 1) {
            frequencyDominoes.add(IntArray(RANGE_OF_VALUES[1] + 1))
        }
        var countEquivalentDominoPairs = 0

        for (domino in dominoes) {
            val minValue = min(domino[0], domino[1])
            val maxValue = max(domino[0], domino[1])
            countEquivalentDominoPairs += frequencyDominoes[minValue][maxValue]
            ++frequencyDominoes[minValue][maxValue]
        }

        return countEquivalentDominoPairs
    }
}
