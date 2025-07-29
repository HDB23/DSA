A = [9, 3, 2, 5, 10, 1]
print("The Original list : ", A)    # Printing Original List
for i in range(0, len(A)):  # Points to index no : 0 of list A
    for j in range(i+1, len(A)):    # Points to index next to pointer of i
        # Swapping if the condition(comparison) is true
        if(A[i] > A[j]):
            temp = A[i]
            A[i] = A[j]
            A[j] = temp
# Printing Sorted list
print("The Sorted List : ", A)