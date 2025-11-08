/**
 * @param {number[]} nums
 * @return {boolean}
 */
var containsDuplicate = function(nums) {
    // sort the array
    nums = nums.sort((a,b) => a-b);

    let i=0;

    // loop through the array 
    while(i<nums.length){

        // check if two contigious nums are equal
        if(nums[i]===nums[i+1]){
            return true;
        }

        // increment i 
        i++;
    }
    return false;
};

// TIME: O(n log n)
// SPACE: O(1) or O(log n) - sorting is in-place; some engines use O(log n) auxiliary stack