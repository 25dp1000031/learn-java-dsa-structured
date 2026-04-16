# creating a hashmap :
#method1: using curly braces
hashmaps = {} # -----> preferred then dict()

#method2: using dict()
maps = dict()

# how to add or append values to hashmap --> since hashmap stores values as key, value (ensure you have both)
#method1: adding while creating like
maps2 = dict(name = "aayush", age= 25)
#or
hashmaps2 = {"name" : "aayush", "age" : 25}  # here name is a key and aayush is its value 

# accessing values
#method1:
print(hashmaps2["name"])
print(hashmaps2["age"])

#method2:
print(hashmaps2.get("name")) #---> preferred

#updating elements
hashmaps2["name"] = "aditya"
hashmaps2["age"] = 24

#iterating through hashmaps
for keys in hashmaps2.keys():
    print(keys)
for values in hashmaps2.values():
    print(values)
#printing both
for k, v in hashmaps2.items():
    print(k, v)
    
# check if a key exists: mostly O(1)
if "name" in hashmaps2:
    print("true")

#lastly dictionary comprehension --> not required but yes it makes you a 10x engineer T_T
squares = {x: x*x for x in range(5)}
print(squares)

#practical use case
map = {}

target = 9
nums = [1,2,7,9]
def TwoSum(nums, target):
    for i, num in enumerate(nums):
        complement = target - num
        if complement in map:
            return [map[complement], i]
        
        map[num] = i