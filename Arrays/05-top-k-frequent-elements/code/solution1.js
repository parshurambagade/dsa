function topKFrequent_sort(nums, k) {
  const freq = new Map();
  for (let x of nums) freq.set(x, (freq.get(x) || 0) + 1);

  const uniq = Array.from(freq.keys());
  uniq.sort((a, b) => freq.get(b) - freq.get(a)); // sort by freq desc
  return uniq.slice(0, k);
}

// TIME: O(n + k log k) where k is the number of top elements to return; worst-case k = n → O(n log n).
// SPACE: O(k).
