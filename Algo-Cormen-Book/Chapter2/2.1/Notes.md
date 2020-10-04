# 2.1 Insertion Sort

###### Pseudo code
````
for j = 2 to A.length
    key = A[j]
    // insert A[j] into the sorted sequence A[1...j-1]
    i = j -1
    while i > 0 and A[i] > key
        A[i+1] = A[i]
        i = i-1
    A[i+1] key
````
# 2.1 Exercises

###### Reverse Order Pseudo Code
````
for j = 2 to A.length
    key = A[j]
    // insert A[j] into the sorted sequence A[1...j-1]
    i = j -1
    while i > 0 and A[i] < key
        A[i+1] = A[i]
        i = i-1
    A[i+1] key
````
###### Linear Search Pseudo Code
````
for i = 1 to A.length
    if A[i] = value
        return i
    i = i + 1
return NULL
````
###### Linear Search Loop Invariant

If A[i] matches the value being searched, return and exit, else increase i by 1. Return NULL if no match is found after scanning all items.

**Initialization** - At i =0, if the value matches program exits

**Maintenance** - For values 0 to i-1, the values dont match that being searched and we only proceed to the next iteration if the current value doesnt match that being searched.

**Termination** - If the loop terminates, either when it finds a match or if it doesnt, it gives us a useful return type - either the index that matched or a NULL

###### Add 2 n-bit binary integers

Input - 2 Integer Arrays of size n - each element representing individual bytes of a given integer. 
    Assumption - the input arrays are always of the same size, i.e, we dont account for left padding one of the inputs
    
Output - Array of size (n+1) containing the bytes of the integer that is the result of summation of the 2 inpur integers

Pseudo code - 

````
carry = 0
for i = A.length to 1
    if A[i] = B[i] = 0
        C[i+1] = carry
        carry = 0
    if A[i] = B[i] = 1
        if carry = 1
            C[i+1] = 1
        if carry = 0
            C[i+1] = 0
            carry = 1
    if A[i] != B[i]
        if carry = 1
            C[i+1] = 0
        if carry = 0
            C[i+1] = 1
    i = i - 1
return C   
````
