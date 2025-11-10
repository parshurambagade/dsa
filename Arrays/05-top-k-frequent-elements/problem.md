# [347. Top K Frequent Elements](https://leetcode.com/problems/top-k-frequent-elements/)

**Difficulty**: Medium  
**Topics**: Array, Hash Table, Heap (Priority Queue), Bucket Sort, Counting, Quickselect  
**Companies**: Amazon, Facebook, Google, Microsoft, Apple

---

## 📋 Problem Statement

Given an integer array `nums` and an integer `k`, return the `k` **most frequent** elements. You may return the answer in **any order**.

---

## 💡 Examples

### Example 1:

```
Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]
Explanation: 1 appears 3 times, 2 appears 2 times, 3 appears 1 time. Top 2 are [1,2].
```

### Example 2:

```
Input: nums = [1], k = 1
Output: [1]
Explanation: Only one element, so it's the most frequent.
```

### Example 3:

```
Input: nums = [1,2,1,2,1,2,3,1,3,2], k = 2
Output: [1,2]
Explanation: 1 appears 4 times, 2 appears 4 times, 3 appears 2 times. Top 2 are [1,2].
```

---

## 🔒 Constraints

- `1 <= nums.length <= 10^5`
- `-10^4 <= nums[i] <= 10^4`
- `k` is in the range `[1, the number of unique elements in the array]`
- It is **guaranteed** that the answer is **unique**

---

## 🎯 Approach Overview

| Solution                            | Approach               | Time       | Space    | Trade-off                  |
| ----------------------------------- | ---------------------- | ---------- | -------- | -------------------------- |
| [solution1.js](./code/solution1.js) | Hash Map + Sort        | O(n log n) | O(n)     | Simple but slower          |
| [solution2.js](./code/solution2.js) | Hash Map + Min Heap    | O(n log k) | O(n + k) | Good for small k           |
| [solution3.js](./code/solution3.js) | Hash Map + Bucket Sort | O(n)       | O(n)     | Optimal - meets follow-up! |

**Recommended for Interview**: `solution3.js` (bucket sort - O(n) time)

Where:

- `n` = length of array
- `k` = number of top elements needed

---

## 🔍 Key Insights

### Pattern Recognition

- **Problem Type**: Top K elements, Frequency counting
- **Key Insight**: Count frequencies first, then find top K by frequency
- **Optimal Data Structure**: Hash Map for counting + Bucket Sort for O(n)

### Approach Evolution

1. **Sorting** (O(n log n)): Count frequencies → sort by frequency → take top k
2. **Min Heap** (O(n log k)): Count frequencies → maintain heap of size k
3. **Bucket Sort** (O(n)): Count frequencies → group by frequency → collect from highest

### Why Bucket Sort Works (Optimal!)

- Maximum possible frequency = n (all elements are same)
- Create buckets: `bucket[frequency] = [elements with that frequency]`
- Iterate from highest frequency (n) down to 1
- Collect elements until we have k elements
- Time: O(n) for counting + O(n) for bucketing + O(n) for collecting = O(n)!

---

## 🧪 Test Cases

```javascript
// Basic cases
topKFrequent([1, 1, 1, 2, 2, 3], 2); // → [1,2]
topKFrequent([1], 1); // → [1]
topKFrequent([1, 2, 1, 2, 1, 2, 3, 1, 3, 2], 2); // → [1,2]

// Edge cases
topKFrequent([4, 4, 4, 4], 1); // → [4] (all same)
topKFrequent([1, 2, 3, 4, 5], 1); // → [any] (all freq 1)

// Equal frequencies
topKFrequent([1, 1, 2, 2, 3, 3], 2); // → [any 2] (all equal freq)

// Large k
topKFrequent([1, 2, 3, 4, 5], 5); // → [1,2,3,4,5] (k = unique count)

// Negative numbers
topKFrequent([-1, -1, 2, 2, 2, 3], 2); // → [2,-1]
```

---

## 📝 Learning Notes

### What I Learned

- Bucket sort can achieve O(n) when range is bounded (frequency ≤ n)
- Min heap of size k is better than sorting when k << n
- For "top K" problems: consider heap, quickselect, or bucket sort
- JavaScript doesn't have built-in heap, but can implement or use sorting
- Trade-off: Bucket sort uses more space but faster time

### Common Mistakes

- ❌ Forgetting to count frequencies first
- ❌ Sorting entire array instead of just by frequency
- ❌ Not considering O(n) bucket sort solution
- ❌ Using max heap when min heap is more efficient (for top k, keep k smallest in heap)
- ❌ Not handling equal frequencies correctly

### Interview Tips

1. **Clarify**: Can return in any order? Guaranteed unique answer?
2. **Start simple**: "I'll count frequencies then sort" (O(n log n))
3. **Optimize**: "For small k, min heap is O(n log k)"
4. **Follow-up**: "For O(n), I can use bucket sort based on frequency"
5. **Edge cases**: All same frequency, k = 1, k = all unique elements

---

## 🔗 Related Problems

- [Kth Largest Element in an Array](https://leetcode.com/problems/kth-largest-element-in-an-array/) - Similar top K pattern
- [Top K Frequent Words](https://leetcode.com/problems/top-k-frequent-words/) - Same problem with strings
- [Sort Characters By Frequency](https://leetcode.com/problems/sort-characters-by-frequency/) - Sort by frequency
- [K Closest Points to Origin](https://leetcode.com/problems/k-closest-points-to-origin/) - Top K with distance

---

## 📚 Tags

`#arrays` `#hash-table` `#heap` `#bucket-sort` `#top-k` `#medium` `#frequency-counting`

---

## 🎓 Follow-Up Question

**Q**: Your algorithm's time complexity must be better than O(n log n), where n is the array's size.

**A**: Use **Bucket Sort**!

- Create buckets indexed by frequency (0 to n)
- Group elements by their frequency
- Iterate from highest frequency downward
- Collect k elements
- Time: O(n), Space: O(n)

---

## � Key Technique: Bucket Sort

```javascript
// Step 1: Count frequencies
let freqMap = new Map();
for (let num of nums) {
  freqMap.set(num, (freqMap.get(num) || 0) + 1);
}

// Step 2: Create buckets (index = frequency)
let buckets = Array(nums.length + 1)
  .fill(null)
  .map(() => []);
for (let [num, freq] of freqMap) {
  buckets[freq].push(num);
}

// Step 3: Collect top k from highest frequency
let result = [];
for (let i = buckets.length - 1; i >= 0 && result.length < k; i--) {
  result.push(...buckets[i]);
}
return result.slice(0, k);
```

---

[← Back to Arrays](../README.md) | [View Solutions](./code/)
