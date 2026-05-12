The Longest Consecutive Sequence problem is a classic Hash Set + Sequence Expansion pattern.

Problem: Longest Consecutive Sequence

Example input:

nums = [100,4,200,1,3,2]

Expected output:

4

Because the longest consecutive sequence is:

1, 2, 3, 4

Length = 4

Important rule:

Numbers must be consecutive

They do NOT need to be in order in the array

Naive Approach (Sorting)

You could sort first.

[1,2,3,4,100,200]

Then count sequences.

But sorting takes:

O(n log n)

The problem requires O(n).

Optimal Pattern: Hash Set
Key Idea

Put all numbers in a set for O(1) lookup.

Only start counting when the number is the start of a sequence.

A number is the start if:

num - 1 NOT in set
Step-by-Step Example

Input:

[100,4,200,1,3,2]

Convert to set:

{100,4,200,1,3,2}
Check each number
num = 100

Check:

99 in set?

No → start sequence

Sequence:

100

Length = 1

num = 4

Check:

3 in set?

Yes → not start → skip

num = 200

Check:

199 in set?

No → start

Sequence:

200

Length = 1

num = 1

Check:

0 in set?

No → start sequence

Now expand:

1 → 2 → 3 → 4

Length = 4

Update longest = 4

Visualization
Set = {1,2,3,4,100,200}

Start only when (num-1) not present

1 → start
2 → skip
3 → skip
4 → skip

Only 1 starts the sequence, which avoids rechecking.

Python Code
def longestConsecutive(nums):
    numSet = set(nums)
    longest = 0

    for num in numSet:
        if num - 1 not in numSet:   # start of sequence
            length = 1

            while num + length in numSet:
                length += 1

            longest = max(longest, length)

    return longest
Time Complexity
O(n)

Why?

Each number is visited at most once in a sequence expansion.

Why This Trick Works

Without the trick:

1 → check 2,3,4
2 → check 3,4
3 → check 4

Too many checks.

With the trick:

Start only at 1

So we scan sequence once.

Key Interview Insight

Always remember this rule:

Only start when (num - 1) is NOT in the set

This avoids duplicate work and makes it O(n).

✅ One-line intuition

Only expand sequences from the smallest number in that sequence.

If you want, I can also show you a visual trick that helps solve this problem in 10 seconds during interviews (the way engineers at **Google and **Meta often explain it).

yes please

Here is the visual trick that makes Longest Consecutive Sequence very easy to understand and solve quickly in interviews.

The Visual Trick

Take the array:

[100, 4, 200, 1, 3, 2]

First imagine the numbers on a number line.

1   2   3   4        100        200

You can clearly see the consecutive block:

1 → 2 → 3 → 4

Length = 4

So the problem becomes:

Find the largest consecutive block of numbers.

The Key Observation

Every consecutive block has one starting number.

Example:

1 → 2 → 3 → 4

The start is 1 because:

0 does NOT exist

But:

2 is not a start (because 1 exists)
3 is not a start (because 2 exists)
4 is not a start (because 3 exists)

So we only start counting from numbers that have no previous number.

Rule:

num - 1 not in set → start sequence
Visual Walkthrough

Set:

{1,2,3,4,100,200}

Check each number:

num	num-1 exists?	Action
1	0 ❌	Start sequence
2	1 ✅	Skip
3	2 ✅	Skip
4	3 ✅	Skip
100	99 ❌	Start sequence
200	199 ❌	Start sequence
Expand the sequence

Starting at 1

1 → 2 → 3 → 4

Length = 4

Starting at 100

100

Length = 1

Starting at 200

200

Length = 1

Longest = 4

Why This Makes It O(n)

Without the trick:

1 → check 2,3,4
2 → check 3,4
3 → check 4

Too many checks.

With the trick:

Only start at 1

So each number is processed once.

Interview Memory Trick

Just remember this:

Step 1 → Put numbers in a set
Step 2 → Start only if (num-1) not present
Step 3 → Expand forward
Clean Code
def longestConsecutive(nums):
    numSet = set(nums)
    longest = 0

    for num in numSet:
        if num - 1 not in numSet:
            length = 1
            
            while num + length in numSet:
                length += 1

            longest = max(longest, length)

    return longest
One-Line Interview Explanation

If an interviewer asks:

"Why check num-1?"

You answer:

"To ensure we only start counting from the beginning of a sequence, preventing duplicate work and keeping the algorithm O(n)."

If you want, I can also show you the 5 most important patterns used in 80% of problems on LeetCode. This drastically speeds up interview preparation.