/**
 * @param {number[]} nums
 * @return {boolean}
 */
var containsDuplicate = function (nums) {
  // create new set
  let set = new Set();

  // loop through the array and add each num in the set
  for (let i = 0; i < nums.length; i++) {
    // if set already has num, that num present twice in the array, return true
    if (set.has(nums[i])) return true;
    // else add that num in the set
    else set.add(nums[i]);
  }

  // if loop is finished and no duplicate found, return false
  return false;
};

// TIME: O(n)
// SPACE: O(n)