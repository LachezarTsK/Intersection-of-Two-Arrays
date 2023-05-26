
#include <vector>
#include <unordered_set>
using namespace std;

class Solution {
    
public:
    vector<int> intersection(const vector<int>& firstInput, const vector<int>& secondInput) const {
        unordered_set<int> presentInFirstInput(firstInput.begin(), firstInput.end());
        vector<int> intersection;
        for (const auto& num : secondInput) {
            if (presentInFirstInput.erase(num)) {
                intersection.push_back(num);
            }
        }
        return intersection;
    }
};
