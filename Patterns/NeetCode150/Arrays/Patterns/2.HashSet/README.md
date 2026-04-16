Pattern 2 — Hash Set (Detect Duplicates)
Idea

Use a set to track elements you have already seen.

A set lookup is O(1) on average.

Template
seen = set()

for x in nums:
    if x in seen:
        return True
    seen.add(x)

return False
Used in

Contains Duplicate

Longest Consecutive Sequence

Why it works

Instead of checking every pair (O(n²)), we check membership instantly.

Mental Model
Seen elements box

Input → check box → add to box


A set is:

Unordered → elements have no index

Mutable → you can add/remove items

Unique → duplicates are automatically removed

Iterable

Example: