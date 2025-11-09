# [1. Two Sum](https://leetcode.com/problems/two-sum/)

**Difficulty**: 🟢 Easy  
**Topics**: Array, Hash Table  
**Companies**: Amazon, Apple, Microsoft, Google, Facebook

---

## 📋 Problem Statement

Given an array of integers `nums` and an integer `target`, return **indices** of the two numbers such that they add up to `target`.

You may assume that each input would have **exactly one solution**, and you may not use the same element twice.

You can return the answer in any order.

---

## 💡 Examples

### Example 1:

```
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
```

### Example 2:

```
Input: nums = [3,2,4], target = 6
Output: [1,2]
Explanation: nums[1] + nums[2] == 6, so we return [1, 2].
```

### Example 3:

```
Input: nums = [3,3], target = 6
Output: [0,1]
Explanation: nums[0] + nums[1] == 6, so we return [0, 1].
```

---

## 🔒 Constraints

- `2 <= nums.length <= 10^4`
- `-10^9 <= nums[i] <= 10^9`
- `-10^9 <= target <= 10^9`
- **Only one valid answer exists.**

---

## 🎯 Approach Overview

| Solution                            | Approach                   | Time  | Space | Trade-off           |
| ----------------------------------- | -------------------------- | ----- | ----- | ------------------- |
| [solution1.js](./code/solution1.js) | Brute Force (Nested Loops) | O(n²) | O(1)  | Simple but slow     |
| [solution2.js](./code/solution2.js) | Hash Map (Two Pass)        | O(n)  | O(n)  | Better but 2 passes |
| [solution3.js](./code/solution3.js) | Hash Map (One Pass)        | O(n)  | O(n)  | Optimal solution    |

**Recommended for Interview**: `solution3.js` (one-pass hash map)

---

## 🔍 Key Insights

### Pattern Recognition

- **Problem Type**: Two-element search, complement finding
- **Key Insight**: For each number `x`, we need to find `target - x`
- **Optimal Data Structure**: Hash Map for O(1) lookups

### Approach Evolution

1. **Brute Force** (O(n²)): Check every pair → Too slow for large inputs
2. **Two-Pass Hash Map** (O(n)): Store all, then search → Better but extra pass
3. **One-Pass Hash Map** (O(n)): Check and store simultaneously → Optimal!

### Why One-Pass Hash Map Works

- As we iterate, we check if complement `(target - current)` exists in map
- If yes → return indices immediately
- If no → store current number with its index for future lookups
- Guarantees we find the pair in single pass

---

## 🧪 Test Cases

```javascript
// Basic cases
twoSum([2, 7, 11, 15], 9); // → [0,1]
twoSum([3, 2, 4], 6); // → [1,2]
twoSum([3, 3], 6); // → [0,1]

// Edge cases
twoSum([1, 2], 3); // → [0,1] (minimum length)
twoSum([0, 4, 3, 0], 0); // → [0,3] (zeros)

// Negative numbers
twoSum([-1, -2, -3, -4], -6); // → [1,3] (negatives)
twoSum([-3, 4, 3, 90], 0); // → [0,2] (negative + positive)

// Large numbers
twoSum([1000000000, 2000000000, -1000000000], 0); // → [0,2]

// Order doesn't matter
twoSum([1, 5, 3, 7], 8); // → [1,3] or [3,1] both valid
```

---

## 📝 Learning Notes

### What I Learned

- Hash maps are perfect for "find complement" problems
- One-pass is always better than two-pass when possible
- Storing index as value in hash map is the key technique
- Return early when solution found (no need to continue)

### Common Mistakes

- ❌ Returning values instead of indices
- ❌ Using same element twice: `nums[i] + nums[i]`
- ❌ Not handling negative numbers properly
- ❌ Sorting the array (loses original indices)
- ❌ Assuming sorted input (it's not!)

### Interview Tips

1. **Clarify**: Indices or values? Can use same element twice? Exactly one solution?
2. **Start simple**: Mention brute force O(n²) approach
3. **Optimize**: "We can use a hash map to get O(n)"
4. **Explain one-pass**: Check complement first, then store current
5. **Edge cases**: Duplicate numbers, negative numbers, zeros

---

## 🔗 Related Problems

- [3Sum](https://leetcode.com/problems/3sum/) - Three numbers that sum to target
- [4Sum](https://leetcode.com/problems/4sum/) - Four numbers that sum to target
- [Two Sum II](https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/) - Input array is sorted (use two pointers)
- [Two Sum IV - BST](https://leetcode.com/problems/two-sum-iv-input-is-a-bst/) - Find in Binary Search Tree
- [Max Number of K-Sum Pairs](https://leetcode.com/problems/max-number-of-k-sum-pairs/) - Count pairs with sum K

---

## 📚 Tags

`#arrays` `#hash-table` `#two-sum-pattern` `#easy` `#complement-search`

---

## 🎓 Follow-Up Question

**Q**: Can you come up with an algorithm that is less than O(n²) time complexity?

**A**: Yes! Use a hash map:

- Store numbers and indices as we iterate
- For each number, check if `target - number` exists in map
- Time: O(n), Space: O(n)
- This is the optimal solution!

---

[← Back to Arrays](../README.md) | [View Solutions](./code/)
