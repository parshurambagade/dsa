/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function (nums, target) {
  // map to store index of each number
  let map = {};

  // populate the map with numbers and their indices
  for (let i = 0; i < nums.length; i++) {
    map[nums[i]] = i;
  }
  // check for each number if the complement (target - number) exists in the map
  for (let i = 0; i < nums.length; i++) {
    // ensure we are not using the same element twice
    if (map[target - nums[i]] && i !== map[target - nums[i]]) {
      // if found, return the indices
      return [i, map[target - nums[i]]];
    }
  }

  // If no pair is found, return an empty array
  return [];
};

// TIME: O(n) - We traverse the list of numbers twice, but each traversal is O(n).
// SPACE: O(n) - We use a map to store the indices of the numbers, which in the worst case can store all n numbers.
