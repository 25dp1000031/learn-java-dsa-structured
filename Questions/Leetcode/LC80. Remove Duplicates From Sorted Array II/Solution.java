class Solution {
    public int removeDuplicates(int[] nums) {
        int l = 0, r = 0;

        while (r < nums.length) {
            int count = 1;
            while (r + 1 < nums.length && nums[r] == nums[r + 1]) {
                count++;
                r++;
            }
            int i = 0;
            while (i < Math.min(2, count)) {
                nums[l] = nums[r];
                l++;
                i++;
            }
            r++;
        }
        return l;
    }
}

// what this algo is doing is just basically it is keeping left pointer at a
// fixed state and using right pointer to just manipulate like replace the data
// we need so its more like r is at 3 then it will copy nums[3] into nums[0] and
// nums[1] then go next so its not simply finding 2 same index and replacing its
// actually replacing 2 same index with one index

/*
 * The algorithm does not just remove all duplicates beyond the second. Instead,
 * it copies up to two duplicates (if available) of each number to the front of
 * the array, using the l pointer. It's a controlled overwrite, not a simple
 * replace of one value.
 */