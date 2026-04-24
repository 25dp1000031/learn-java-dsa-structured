def lengthOfLongestSubstring(s: str):
    max_len = 0
    left = 0
    map = set()
    for right in range(len(s)):
        while s[right] in map:
            map.remove(s[left])
            left+=1
            max_len = max(max_len, right-left + 1)
        map.add(s[right])
    return max_len


s = "abcabcbb"

print(lengthOfLongestSubstring(s))
