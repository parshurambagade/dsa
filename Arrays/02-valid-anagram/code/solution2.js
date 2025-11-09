/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isAnagram = function (s, t) {
  // if lengths differ, they can't be anagrams
  if (s.length !== t.length) return false;

  // create a frequency map for characters in s
  let map = {};

  // populate the frequency map
  for (let char of s) {
    map[char] = (map[char] || 0) + 1;
  }

  for (let char of t) {
    // if char not found or frequency is zero, not an anagram
    if (!map[char]) return false;
    // decrement the frequency based on characters in t
    map[char]--;
  }

  // if all frequencies are zero, it's an anagram
  return Object.values(map).every((count) => count === 0);
};
