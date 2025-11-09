/**
 * @param {string[]} strs
 * @return {string[][]}
 */
var groupAnagrams = function (strs) {
  // map to store the anagrams with unique key
  let map = {};

  for (let str of strs) {
    // create a count array for each string
    let count = new Array(26).fill(0);

    for (let char of str) {
      // increment the count for each character, assuming lowercase a-z
      count[char.charCodeAt(0) - 97]++; // charCode of 'a' is 97
    }

    // create a unique key by joining the count array with a separator
    // using '#' to avoid ambiguity in counts
    let key = count.join("#");

    // add the string to the map using the unique key
    if (!map[key]) map[key] = [str];
    else map[key].push(str);
  }

  // return the grouped anagrams
  return Object.values(map);
};

// TIME: O(NK) where N is the number of strings and K is the maximum length of a string.
// SPACE: O(NK) for the map storing the grouped anagrams.