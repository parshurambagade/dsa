# [217. Contains Duplicate](https://leetcode.com/problems/contains-duplicate/)

**Difficulty**: 🟢 Easy  
**Topics**: Arrays, Hash Table, Sorting  
**Companies**: Amazon, Apple, Microsoft, Google

---

## 📋 Problem Statement

Given an integer array `nums`, return `true` if any value appears **at least twice** in the array, and return `false` if every element is distinct.

---

## 💡 Examples

### Example 1:
```
Input: nums = [1,2,3,1]
Output: true
Explanation: The element 1 occurs at the indices 0 and 3.
```

### Example 2:
```
Input: nums = [1,2,3,4]
Output: false
Explanation: All elements are distinct.
```

### Example 3:
```
Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true
```

---

## 🔒 Constraints

- `1 <= nums.length <= 10^5`
- `-10^9 <= nums[i] <= 10^9`

---

## 🎯 Approach Overview

| Solution | Approach | Time | Space | Trade-off |
|----------|----------|------|-------|-----------|
| [solution1.js](./code/solution1.js) | Sort & Compare Adjacent | O(n log n) | O(1) | In-place but slower |
| [solution2.js](./code/solution2.js) | Hash Set (Loop) | O(n) | O(n) | Faster but uses extra space |
| [solution3.js](./code/solution3.js) | Hash Set (One-liner) | O(n) | O(n) | Most concise & optimal |

**Recommended for Interview**: `solution3.js` (optimal) or `solution2.js` (easier to explain)

---

## 🔍 Key Insights

### Pattern Recognition
- **Problem Type**: Duplicate detection
- **Key Insight**: We need to track "seen" elements efficiently
- **Optimal Data Structure**: Hash Set (O(1) lookup)

### Approach Evolution
1. **Brute Force** (O(n²)): Compare every pair → Too slow
2. **Sort First** (O(n log n)): Adjacent duplicates are easy to spot → Better but modifies input
3. **Hash Set** (O(n)): Track seen elements as we iterate → Optimal!

### Why Hash Set Works
- Sets only store unique values
- If input has duplicates, `Set.size < array.length`
- Single pass through array = O(n) time

---

## 🧪 Test Cases

```javascript
// Basic cases
containsDuplicate([1,2,3,1])           // → true
containsDuplicate([1,2,3,4])           // → false

// Edge cases
containsDuplicate([1])                 // → false (single element)
containsDuplicate([1,1])               // → true (all duplicates)
containsDuplicate([1,2,3,4,5,6,7,8,9]) // → false (no duplicates)

// Large numbers
containsDuplicate([1000000000, -1000000000, 1000000000]) // → true
```

---

## 📝 Learning Notes

### What I Learned
- Hash Sets are powerful for O(1) lookups
- Trading space (O(n)) for time (O(n²) → O(n)) is often worth it
- JavaScript `Set` constructor accepts any iterable (including arrays)
- Sorting modifies the input array (side effect to be aware of)

### Common Mistakes
- ❌ Forgetting that sorting is O(n log n), not O(n)
- ❌ Claiming sorting uses O(n) space (it's usually O(1) or O(log n))
- ❌ Using nested loops (O(n²)) for large inputs → timeout

### Interview Tips
1. **Ask clarifying questions**: Can I modify the input? Space constraints?
2. **Start simple**: Mention brute force, then optimize
3. **Explain trade-offs**: "Sorting uses less space but takes O(n log n) time"
4. **Code the optimal solution**: Hash Set approach (solution3.js)
5. **Test edge cases**: Empty array (though constraint says n ≥ 1)

---

## 🔗 Related Problems

- [Two Sum](https://leetcode.com/problems/two-sum/) - Similar hash map pattern
- [Valid Anagram](https://leetcode.com/problems/valid-anagram/) - Character frequency tracking
- [Contains Duplicate II](https://leetcode.com/problems/contains-duplicate-ii/) - With index distance constraint
- [Contains Duplicate III](https://leetcode.com/problems/contains-duplicate-iii/) - With value difference constraint

---

## 📚 Tags
`#arrays` `#hash-table` `#sorting` `#easy` `#duplicate-detection`

---

[← Back to Arrays](../README.md) | [View Solutions](./code/)
