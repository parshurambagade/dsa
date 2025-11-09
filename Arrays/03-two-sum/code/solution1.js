/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function (nums, target) {
  // outer loop to pick the first number
  for (let i = 0; i < nums.length - 1; i++) {
    // inner loop to pick the second number, here j starts from i+1 to avoid reusing the same element
    for (let j = i + 1; j < nums.length; j++) {
      // check if the sum matches the target and return indices if found
      if (nums[i] + nums[j] === target) return [i, j];
    }
  }
  // If no pair is found, return an empty array
  return [];
};

// TIME: O(n^2) - We have a nested loop where for each element we potentially check every other element.
// SPACE: O(1) - We are using a constant amount of space regardless of input size.
