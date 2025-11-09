/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isAnagram = function (s, t) {
  if (s.length !== t.length) return false;
  // as we can't directly sort strings, we convert them to arrays, sort them and convert back to strings
  s = s.split("").sort().join("");
  t = t.split("").sort().join("");

  // Compare the sorted strings
  for (let i = 0; i < s.length; i++) {
    if (s[i] !== t[i]) return false;
  }

  return true;
};

// TIME: O(n log n) due to sorting
// SPACE: O(n) for the arrays created during sorting
