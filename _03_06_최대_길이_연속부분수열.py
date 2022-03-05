import sys

n, m = map(int, sys.stdin.readline().strip().split(" "))
arr = list(map(int, sys.stdin.readline().strip().split(" ")))

cnt, left, right, ans = m, 0, 0, 0
while right < n:
    if cnt == 0 and arr[right] == 0:
        ans = max(ans, right - left)
        left += 1
        right = left
        cnt = m
        continue

    if arr[right] == 0:
        cnt -= 1
        right += 1
    else:
        right += 1

print(ans)
