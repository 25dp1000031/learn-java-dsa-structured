4️⃣ Sorting / Key Transformation Pattern
Idea

Convert each item into a standard (canonical) form and use that as the key in a hashmap.

If two items produce the same key, they belong to the same group.

Example Problem: Group Anagrams

Input:

["eat","tea","tan","ate","nat","bat"]

Expected Output:

[["eat","tea","ate"],["tan","nat"],["bat"]]

Words that are anagrams contain the same letters with same frequency.

Examples:

eat
tea
ate

All contain:

a, e, t
Step 1 — Convert Word into a Key

Sort the letters.

eat → aet
tea → aet
ate → aet
tan → ant
nat → ant
bat → abt

Sorted string becomes the key.

Step 2 — Store in HashMap
key       value
-------------------------
"aet"  →  ["eat","tea","ate"]
"ant"  →  ["tan","nat"]
"abt"  →  ["bat"]
Step 3 — Return hashmap values

Final answer:

[["eat","tea","ate"],["tan","nat"],["bat"]]
Python Code
from collections import defaultdict

def groupAnagrams(strs):
    groups = defaultdict(list)

    for word in strs:
        key = ''.join(sorted(word))
        groups[key].append(word)

    return list(groups.values())

Time Complexity:

O(n * k log k)

n = number of words
k = length of each word

Sorting takes k log k.

Visual Flow
Input
["eat","tea","tan","ate","nat","bat"]

↓

Transform Key
eat → aet
tea → aet
tan → ant
ate → aet
nat → ant
bat → abt

↓

HashMap

aet → ["eat","tea","ate"]
ant → ["tan","nat"]
abt → ["bat"]

↓

Return values
More Optimal Version (Better Pattern)

Instead of sorting, use character frequency as key.

Example for "eat":

[1,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0...]

Code:

def groupAnagrams(strs):
    res = {}

    for s in strs:
        count = [0]*26

        for c in s:
            count[ord(c)-ord('a')] += 1

        key = tuple(count)

        if key not in res:
            res[key] = []

        res[key].append(s)

    return res.values()

Time Complexity:

O(n * k)

Better than sorting.

When To Use This Pattern

Use Key Transformation Pattern when:

You need to group similar elements

Items can be converted into a unique representation

Example problems:

Group Anagrams

Detect duplicates by pattern

Pattern matching

✅ Short rule to remember

Transform each element into a canonical key, then group using hashmap.