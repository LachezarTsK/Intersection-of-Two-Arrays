
/**
 * @param {number[]} firstInput
 * @param {number[]} secondInput
 * @return {number[]}
 */
var intersection = function (firstInput, secondInput) {
    const presentInFirstInput = new Set(firstInput);
    const intersection = [];
    for (let num of secondInput) {
        if (presentInFirstInput.delete(num)) {
            intersection.push(num);
        }
    }
    return intersection;
};
