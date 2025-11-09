# [49. Group Anagrams](https://leetcode.com/problems/group-anagrams/)

**Difficulty**: Medium  
**Topics**: Array, Hash Table, String, Sorting  
**Companies**: Amazon, Facebook, Google, Microsoft, Bloomberg

---

## 📋 Problem Statement

Given an array of strings `strs`, group the **anagrams** together. You can return the answer in **any order**.

An **anagram** is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

---

## 💡 Examples

### Example 1:

```
Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
Explanation:
- There is no string in strs that can be rearranged to form "bat".
- The strings "nat" and "tan" are anagrams as they can be rearranged to form each other.
- The strings "ate", "eat", and "tea" are anagrams as they can be rearranged to form each other.
```

### Example 2:

```
Input: strs = [""]
Output: [[""]]
Explanation: Single empty string forms one group.
```

### Example 3:

```
Input: strs = ["a"]
Output: [["a"]]
Explanation: Single character forms one group.
```

---

## 🔒 Constraints

- `1 <= strs.length <= 10^4`
- `0 <= strs[i].length <= 100`
- `strs[i]` consists of lowercase English letters.

---

## 🎯 Approach Overview

| Solution                            | Approach                | Time            | Space     | Trade-off                       |
| ----------------------------------- | ----------------------- | --------------- | --------- | ------------------------------- |
| [solution1.js](./code/solution1.js) | Sort Each String as Key | O(n \* k log k) | O(n \* k) | Simple, slower for long strings |
| [solution2.js](./code/solution2.js) | Character Count as Key  | O(n \* k)       | O(n \* k) | Optimal for fixed alphabet      |
| [solution3.js](./code/solution3.js) | Prime Number Hash       | O(n \* k)       | O(n \* k) | Creative but may overflow       |

**Recommended for Interview**: `solution2.js` (character count - most optimal)

Where:

- `n` = number of strings
- `k` = maximum length of a string

---

## 🔍 Key Insights

## 🔍 Key Insights

### Pattern Recognition

- **Problem Type**: Grouping by characteristics, Hash Map categorization
- **Key Insight**: Anagrams share the same "signature" (sorted string or character count)
- **Optimal Data Structure**: Hash Map where key = signature, value = list of anagrams

### Approach Evolution

1. **Brute Force**: Compare each string with every other (O(n² \* k)) → Too slow
2. **Sort as Key**: Sort each string and use as hash key → O(n \* k log k)
3. **Character Count**: Use frequency count as key → O(n \* k) - Optimal!

### Why Character Count Works

- All anagrams have identical character frequencies
- Create a unique signature: `"a1b2c1"` or array `[1,2,1,0,0,...]`
- Use signature as hash map key to group anagrams together
- Faster than sorting for longer strings

---

## 🧪 Test Cases

```javascript
// Basic cases
groupAnagrams(["eat", "tea", "tan", "ate", "nat", "bat"]);
// → [["bat"],["nat","tan"],["ate","eat","tea"]]

groupAnagrams([""]); // → [[""]]
groupAnagrams(["a"]); // → [["a"]]

// Edge cases
groupAnagrams(["a", "a"]); // → [["a","a"]] (duplicates)
groupAnagrams(["abc", "bca", "cab"]); // → [["abc","bca","cab"]] (all anagrams)

// No anagrams
groupAnagrams(["a", "b", "c"]); // → [["a"],["b"],["c"]]

// Mixed lengths
groupAnagrams(["ab", "ba", "abc", "cba"]); // → [["ab","ba"],["abc"],["cba"]]

// Long strings
groupAnagrams(["abcdefghijk", "kjihgfedcba"]);
// → [["abcdefghijk"],["kjihgfedcba"]]
```

---

## 📝 Learning Notes

### What I Learned

- Hash maps can group items by computed keys (signatures)
- For anagrams: sorted string OR character count works as signature
- Character count array is faster than sorting for long strings
- JavaScript: Use `Map` or object for hash map, convert array to string for key
- Trade-off: sorting is simpler code but slower O(k log k) vs count O(k)

### Common Mistakes

- ❌ Forgetting to handle empty strings
- ❌ Not converting array keys to strings in JavaScript (arrays don't work as Map keys directly)
- ❌ Using nested loops to compare strings (O(n²) - too slow)
- ❌ Assuming input is sorted (it's not!)
- ❌ Modifying the original strings

### Interview Tips

1. **Clarify**: Can return groups in any order? Empty strings allowed?
2. **Start simple**: "I'll sort each string and use it as a key" (solution1)
3. **Optimize**: "For longer strings, character count is faster" (solution2)
4. **Explain complexity**: Sort = O(n _ k log k), Count = O(n _ k)
5. **Edge cases**: Empty strings, single character, all same strings

---

## 🔗 Related Problems

- [Valid Anagram](https://leetcode.com/problems/valid-anagram/) - Check if two strings are anagrams
- [Find All Anagrams in a String](https://leetcode.com/problems/find-all-anagrams-in-a-string/) - Find anagram substrings
- [Group Shifted Strings](https://leetcode.com/problems/group-shifted-strings/) - Similar grouping problem
- [Isomorphic Strings](https://leetcode.com/problems/isomorphic-strings/) - String pattern matching

---

## 📚 Tags

`#arrays` `#hash-table` `#strings` `#sorting` `#grouping` `#medium` `#anagrams`

---

## 💡 Key Techniques

### Approach 1: Sort as Key

```javascript
// For each string: sort it → use as map key
let key = str.split("").sort().join("");
map.set(key, [...(map.get(key) || []), str]);
```

### Approach 2: Character Count as Key (Optimal)

```javascript
// Count characters → create signature
let count = new Array(26).fill(0);
for (let char of str) {
  count[char.charCodeAt(0) - 97]++;
}
let key = count.join("#"); // Use delimiter
```

---

[← Back to Arrays](../README.md) | [View Solutions](./code/)
