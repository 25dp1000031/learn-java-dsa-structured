# creating hashSet
#method 2: with set() constructor
seen = set()

#method 1 : with curly braces
seen1 = {1,2,3,4,5,6} # i mean in a way its a dictionary so thats why we mostly just prefer set()

# how to add elements to the set
seen.add(2)
seen.add(3)

# how to delete the elements
seen.remove(2) #--> removes the elements
seen.pop() #--> removes random element since sets are actually unordered

# how to access the elements : short answer you cant since sets do not support indexing but you can use a loop to print them
for s in seen1:
    print(s)

# how to check if element is already in set
def check():
    if 2 in seen:
        return True
    
# usage in practical questions
nums = [1,2,2,3,4,5,6]
def check_duplicates(nums):
    hashset = set()
    for n in nums:
        if n in hashset:
            return True
        hashset.add(n)
    return False