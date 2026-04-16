Pattern 2 — Hash Map (Store Value → Index)
Idea

Store information while iterating.

Structure:

value → index
Template
map = {}

for i, num in enumerate(nums):
    complement = target - num

    if complement in map:
        return [map[complement], i]

    map[num] = i
Used in

Two Sum

Key Concept

You solve the problem while scanning once.

Time complexity:

O(n)


8. Important Dictionary Methods
Method	Description
keys()	Returns all keys
values()	Returns values
items()	Returns key-value pairs
get()	Safe value access
pop()	Remove key
popitem()	Remove last item
update()	Merge dictionaries
clear()	Remove all items
copy()	Copy dictionary