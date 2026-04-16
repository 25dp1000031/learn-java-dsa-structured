strs = ["eat","tea","tan","ate","nat","bat"]

def groupAnagrams(strs):
    map = dict()
    for word in strs:
        key = ''.join(sorted(word))
        if key not in map:
            map[key] = []
        map[key].append(word)
        
    return list(map.values())


# since we require nested lists we use the defaultdict library of python
from collections import defaultdict
def groupAnagrams2(strs):
    map = defaultdict(list)
    for word in strs:
        key = ''.join(sorted(word))
        map[key].append(word)
    
    return list(map.values())

print(groupAnagrams(strs))
print(groupAnagrams2(strs))