input1 = list(input())

stack = []
rememberIdx = dict()
for i, item in enumerate(input1):
    if item.isalpha():
        stack.append(item)
    else:
        rememberIdx[i] = item

ans = ""
for i in range(len(input1)):
    if rememberIdx.get(i):
        ans += rememberIdx.get(i)
    else:
        ans += stack.pop()

print(ans)
