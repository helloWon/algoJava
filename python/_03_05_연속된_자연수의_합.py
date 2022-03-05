n = int(input())

arr = [_ for _ in range(1, n + 1)]

m = n // 2 + 1
left, sum, ans = 0, 0, 0
for right in range(m):
    sum += arr[right]

    if sum == n:
        ans += 1
    while sum >= n:
        sum -= arr[left]
        left += 1
        if sum == n:
            ans += 1

print(ans)
