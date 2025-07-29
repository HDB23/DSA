A = [12, 7, 8, 3, 9, 1]

print("The original list : ", A)    # Prints original list elements

for i in range(0, len(A)) :
    smallest = i    # Checking all the values of list A
    for j in range(i+1, len(A)):    # pointer to the 2nd element of the list i.e. at index no : 1
        if(A[j] < A[smallest]):     # Comparing 
            smallest = j            # Assigning the smallest value 
    A[i], A[smallest] = A[smallest], A[i]   # Swapping if statement is true

print("The sorted list : ", A)      # Prints the sorted list