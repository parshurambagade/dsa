# [242. Valid Anagram](https://leetcode.com/problems/valid-anagram/)

**Difficulty**: 🟢 Easy  
**Topics**: Hash Table, String, Sorting  
**Companies**: Amazon, Microsoft, Google, Facebook

---

## 📋 Problem Statement

Given two strings `s` and `t`, return `true` if `t` is an **anagram** of `s`, and `false` otherwise.

An **anagram** is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

---

## 💡 Examples

### Example 1:

```
Input: s = "anagram", t = "nagaram"
Output: true
Explanation: Both strings have the same characters with same frequencies.
```

### Example 2:

```
Input: s = "rat", t = "car"
Output: false
Explanation: Different characters ('t' vs 'c').
```

---

## 🔒 Constraints

- `1 <= s.length, t.length <= 5 * 10^4`
- `s` and `t` consist of lowercase English letters.

---

## 🎯 Approach Overview

| Solution                            | Approach                   | Time       | Space        | Trade-off                |
| ----------------------------------- | -------------------------- | ---------- | ------------ | ------------------------ |
| [solution1.js](./code/solution1.js) | Sort Both Strings          | O(n log n) | O(1) or O(n) | Simple but slower        |
| [solution2.js](./code/solution2.js) | Hash Map (Frequency Count) | O(n)       | O(1)         | Optimal - 26 letters max |
| [solution3.js](./code/solution3.js) | Single Array Counter       | O(n)       | O(1)         | Most efficient           |

**Recommended for Interview**: `solution2.js` or `solution3.js` (optimal)

---

## 🔍 Key Insights

### Pattern Recognition

- **Problem Type**: String comparison, character frequency
- **Key Insight**: Anagrams have identical character frequencies
- **Optimal Data Structure**: Hash Map or Array (for fixed alphabet)

### Approach Evolution

1. **Brute Force**: Generate all permutations of one string → Too slow O(n!)
2. **Sorting** (O(n log n)): Sort both strings and compare → Better but not optimal
3. **Hash Map** (O(n)): Count character frequencies → Optimal!

### Why Hash Map/Array Works

- Anagrams must have exact same character counts
- Build frequency map for one string, decrement for other
- If all counts are zero → anagram
- For lowercase letters only: array of size 26 is enough

---

## 🧪 Test Cases

```javascript
// Basic cases
isAnagram("anagram", "nagaram"); // → true
isAnagram("rat", "car"); // → false

// Edge cases
isAnagram("a", "a"); // → true (single character)
isAnagram("a", "b"); // → false (different single char)
isAnagram("", ""); // → true (both empty)

// Different lengths
isAnagram("abc", "abcd"); // → false (different lengths)

// Same characters, different frequency
isAnagram("aab", "abb"); // → false
isAnagram("aabbcc", "abcabc"); // → true

// Unicode follow-up (if asked)
isAnagram("café", "éfac"); // → true (with Unicode support)
```

---

## 📝 Learning Notes

### What I Learned

- Hash maps are perfect for frequency counting problems
- Sorting can be a simple first approach but not always optimal
- For fixed alphabet (26 letters), array is more efficient than hash map
- Early exit: if lengths differ, return false immediately

### Common Mistakes

- ❌ Forgetting to check if lengths are equal first
- ❌ Not handling empty strings correctly
- ❌ Using O(n²) nested loops instead of hash map
- ❌ Claiming hash map uses O(n) space when alphabet is fixed (it's O(1) for 26 letters)

### Interview Tips

1. **Ask clarifications**: Case-sensitive? Spaces? Unicode characters?
2. **Start simple**: Mention sorting approach first
3. **Optimize**: "We can do better with a hash map in O(n)"
4. **Follow-up ready**: For Unicode, use Map instead of fixed array
5. **Edge cases**: Test with empty strings, single characters, different lengths

---

## 🔗 Related Problems

- [Group Anagrams](https://leetcode.com/problems/group-anagrams/) - Group strings that are anagrams
- [Find All Anagrams in a String](https://leetcode.com/problems/find-all-anagrams-in-a-string/) - Sliding window variation
- [Palindrome Permutation](https://leetcode.com/problems/palindrome-permutation/) - Similar frequency counting
- [Permutation in String](https://leetcode.com/problems/permutation-in-string/) - Check if permutation exists

---

## 📚 Tags

`#strings` `#hash-table` `#frequency-counting` `#sorting` `#easy` `#anagram`

---

## 🎓 Follow-Up Question

**Q**: What if the inputs contain Unicode characters? How would you adapt your solution?

**A**: Use JavaScript `Map` instead of array:

- Map can handle any Unicode character as key
- Time complexity stays O(n)
- Space complexity becomes O(k) where k is number of unique characters

---

[← Back to Arrays](../README.md) | [View Solutions](./code/)
