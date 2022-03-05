input()
arr1 = [int(i) for i in input().split()]

input()
arr2 = [int(i) for i in input().split()]

temp = dict()
ans = []

for _ in arr1:
    temp[_] = 1

for _ in arr2:
    if temp.get(_):
        ans.append(_)
ans.sort()
print(*ans)  # print the list separated by spaces
