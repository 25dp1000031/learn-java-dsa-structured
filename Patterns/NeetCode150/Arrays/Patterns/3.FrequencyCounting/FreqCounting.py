# i mean its just like frequency counting more like key --> freq
count = {}

s = "anagram"
for c in s:
    if c in count:
        count[c] += 1
    else:
        count[c] = 1
    
for keys, values in count.items():
    print(keys, values)
    
    
max_char = max(count, key=count.get)
print(max_char, count.get(max_char))