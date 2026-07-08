# Product of All Non-Empty Subsets

## Problem Statement

Given an array of distinct integers, generate the product of every possible **non-empty subset** of the array.

### Example

**Input**

```text
[30, 60, 90]
```

**Output**

```text
30
60
90
1800
2700
5400
162000
```

### Explanation

The products correspond to all non-empty subsets of the array.

| Subset       | Product |
| ------------ | ------: |
| {30}         |      30 |
| {60}         |      60 |
| {90}         |      90 |
| {30, 60}     |    1800 |
| {30, 90}     |    2700 |
| {60, 90}     |    5400 |
| {30, 60, 90} |  162000 |

---

## Approach

This problem can be solved using **Backtracking (DFS)**.

1. Start with an empty subset.
2. Pick an element.
3. Multiply it with the current product.
4. Store the new product.
5. Recursively continue with the remaining elements.
6. Backtrack and explore other combinations.

Since every non-empty subset is visited exactly once, all required products are generated.

---

## Algorithm

1. Initialize an empty result list.
2. Traverse the array using recursion.
3. For each element:

   * Include it in the current subset.
   * Update the running product.
   * Store the product.
   * Recurse for the remaining elements.
   * Backtrack.
4. Return the collected products.

---

## Complexity Analysis

* **Time Complexity:** `O(n × 2^n)`

  * There are `2^n - 1` non-empty subsets.
  * Computing or maintaining products across recursion leads to the overall complexity.

* **Space Complexity:** `O(n)`

  * Due to the recursion stack.

---

## Concepts Used

* Backtracking
* Depth-First Search (DFS)
* Recursion
* Subset Generation
* Combinatorics

---

## Similar Interview Problems

* Generate All Subsets
* Subsets with Duplicates
* Combination Generation
* Power Set Generation

---

## Interview Tip

This problem is essentially a variation of the classic **Generate All Subsets (Power Set)** problem. Instead of returning each subset, compute and store the **product of its elements**.
