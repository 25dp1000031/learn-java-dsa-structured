arr = [2,7,11,15]
target = 9
def TwoSum(arr, target):
    for i in range(len(arr)):
        for j in range(i+1,len(arr)):
            if arr[i] + arr[j] == target:
                return [i,j]
    return [-1,-1]

print(TwoSum(arr, target))