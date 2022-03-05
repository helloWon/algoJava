import sys

n, m = map(int, sys.stdin.readline().strip().split(" "))
num = list(map(int, sys.stdin.readline().strip().split(" ")))

left, ans, sum = 0, 0, 0
for right in range(n):
    sum += num[right]

    if sum == m:
        ans += 1

    while sum >= m:
        sum -= num[left]
        left += 1
        if sum == m:
            ans += 1

print(ans)
