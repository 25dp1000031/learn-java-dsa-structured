def lengthOfLongestSubstring(s: str):
    max_len = 0
    map = {}
    left = 0
    for right in range(len(s)):
        while s[right] in map and map[s[right]] >= left:
            left = map[s[right]] + 1
        map[s[right]] = right
        max_len = max(max_len, right - left + 1)
    return max_len

s = "abcabcbb"

print(lengthOfLongestSubstring(s))
