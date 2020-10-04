# Insertion Sort

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
for i = 0 to A.length
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

