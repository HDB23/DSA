A = [9, 3, 2, 5, 10, 1]

for i in range(0, len(A)):
    for j in range(i+1, len(A)):
        if(A[i] > A[j]):
            temp = A[i]
            A[i] = A[j]
            A[j] = temp

for k in range(0, len(A)):
    print(A[k], end=" ")