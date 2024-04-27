
/**
 * @param {number[][]} dominoes
 * @return {number}
 */
var numEquivDominoPairs = function (dominoes) {
    const RANGE_OF_VALUES = [1, 9];
    const frequencyDominoes =
            Array.from(new Array(RANGE_OF_VALUES[1] + 1), () => new Array(RANGE_OF_VALUES[1] + 1).fill(0));
    let countEquivalentDominoPairs = 0;

    for (let domino of dominoes) {
        let minValue = Math.min(domino[0], domino[1]);
        let maxValue = Math.max(domino[0], domino[1]);
        countEquivalentDominoPairs += frequencyDominoes[minValue][maxValue];
        ++frequencyDominoes[minValue][maxValue];
    }

    return countEquivalentDominoPairs;
};
