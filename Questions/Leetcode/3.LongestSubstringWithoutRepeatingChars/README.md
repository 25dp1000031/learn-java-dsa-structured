# Length of Longest Substring Without Repeating Characters

## Problem Description

Given a string `s`, find the length of the longest substring without repeating characters.

---

### Example

```python
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
```

Approach
Brute Force (O(n³))
Generate all substrings.

Check if each substring has unique characters.

Track the maximum length of unique substrings.

This approach is inefficient for large strings.

Improved Brute Force (O(n²))
Use two nested loops to define the start and end of substrings.

Use a set to check if the substring contains duplicates.

Still inefficient but better than O(n³).

Optimized Sliding Window Approach (O(n))
We use a sliding window technique with two pointers:

left and right define the current window boundaries.

Expand the window by moving right forward.

If a duplicate character is found within the window, move left forward to remove it.

Use a hashmap/dictionary (map) to store the last seen index of each character.

Update max_len whenever the current window length exceeds it.

---

Explanation of the Optimized Algorithm
We keep track of characters in the current substring window using a dictionary:

Keys: Characters in the string.

Values: The index of their most recent appearance.

When we move the right pointer and encounter a character already inside the window (i.e., its last seen index is ≥ left), we move the left pointer to one index after the last occurrence of that character, effectively removing the duplicate.


This ensures the window always contains unique characters.

```
Time and Space Complexity
Complexity Type	Explanation	Value
Time	Each character visited at most twice	O(n)
Space	Hashmap stores last occurrence of chars	O(min(n, m)) where m is charset size
```

---

Further Improvements
If input is limited to ASCII, use a fixed-size array instead of a hashmap for constant space.

The algorithm works well for any Unicode string by using a dictionary.

References
LeetCode Problem 3: Longest Substring Without Repeating Characters

Sliding Window Technique
