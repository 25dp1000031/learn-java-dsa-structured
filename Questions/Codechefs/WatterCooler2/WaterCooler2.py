# cook your dish here
T = int(input())
for _ in range(T):
    x,y = map(int, input().split())
    print((y-1)//x)