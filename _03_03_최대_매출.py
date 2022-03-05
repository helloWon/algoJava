import sys

n, k = map(int, sys.stdin.readline().strip().split(" "))
num = list(map(int, sys.stdin.readline().strip().split(" ")))

maxSum = sum(num[0:k])
localSum = maxSum
for i in range(k, len(num)):
    localSum = localSum - num[i - k] + num[i]
    maxSum = max(maxSum, localSum)

print(maxSum)
