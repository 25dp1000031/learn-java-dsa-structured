def lengthOfLongestSubstring(s: str):
    max_len = 0
    for i in range(len(s)):
        seen = []
        for j in range(i,len(s)):
            if s[j] in seen:
                break
            seen.append(s[j])
            max_len = max(max_len, j-i+1)
    return max_len


s = "abcabcbb"

print(lengthOfLongestSubstring(s))
