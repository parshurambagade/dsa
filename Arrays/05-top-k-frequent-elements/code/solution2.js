/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number[]}
 */
var topKFrequent = function (nums, k) {
  let freqMap = new Map();

  // Step 1: Build frequency map
  nums.forEach((num) => freqMap.set(num, (freqMap.get(num) || 0) + 1));

  let bucket = [];

  // Step 2: Build the bucket array where index represents frequency
  for (let [num, freq] of freqMap) {
    if (!bucket[freq]) bucket[freq] = [];
    bucket[freq].push(num);
  }

  let result = [];

  // Step 3: Gather the top k frequent elements from the bucket
  for (let i = bucket.length - 1; i >= 0; i--) {
    if (Array.isArray(bucket[i])) result.push(...bucket[i]);
    if (result.length === k) return result;
  }

  return result;
};
