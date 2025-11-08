/**
 * @param {number[]} nums
 * @return {boolean}
 */
var containsDuplicate = function(nums) {
    // check if the set size is less than original arrays length and return result (set only contains unique numbers)
    return new Set(nums).size < nums.length;
};

// TIME: O(n)
// SPACE: O(n)