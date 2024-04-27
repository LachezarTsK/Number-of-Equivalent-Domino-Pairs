
function numEquivDominoPairs(dominoes: number[][]): number {
    const RANGE_OF_VALUES = [1, 9];
    const frequencyDominoes: number[][] =
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
