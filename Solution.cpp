
#include <array>
#include <vector>
#include <algorithm>
using namespace std;

class Solution {

    static constexpr array<int, 2> RANGE_OF_VALUES{ { 1, 9 } };

public:
    int numEquivDominoPairs(const vector<vector<int>>& dominoes)const {
        array<array<int, RANGE_OF_VALUES[1] + 1>, RANGE_OF_VALUES[1] + 1> frequencyDominoes{};
        int countEquivalentDominoPairs = 0;

        for (const auto& domino : dominoes) {
            int minValue = min(domino[0], domino[1]);
            int maxValue = max(domino[0], domino[1]);
            countEquivalentDominoPairs += frequencyDominoes[minValue][maxValue];
            ++frequencyDominoes[minValue][maxValue];
        }

        return countEquivalentDominoPairs;
    }
};
