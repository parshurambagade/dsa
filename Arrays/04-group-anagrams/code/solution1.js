/**
 * @param {string[]} strs
 * @return {string[][]}
 */
var groupAnagrams = function (strs) {
  let map = {};

  for (let str of strs) {
    // sort the string to create a unique key for anagrams
    let sorted = str.split("").sort().join("");

    // use the sorted string as a key in the map
    if (map[sorted]) map[sorted].push(str);
    else map[sorted] = [str];
  }

  // return the grouped anagrams
  return Object.values(map);
};

// TIME: O(N.KlogK) where N is the number of strings and K is the maximum length of a string (due to sorting).
// SPACE: O(NK) for the map storing the grouped anagrams.
