arr = [2,7,11,15]
target = 9
def TwoSum(arr, target):
    TempMap = {}
    for i in range(len(arr)):
        complement = target - arr[i]
        if complement in TempMap:
            return [TempMap[complement], i]
        TempMap[arr[i]]=i
    return [-1,-1]

print(TwoSum(arr, target))