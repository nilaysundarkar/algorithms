package cormen.chapter2

object InsertionSort {
    fun sort(inputArray:Array<Int>):Array<Int>{
        for(j in 1 until inputArray.size){
            var key = inputArray[j]
            // insert A[j] into the sorted sequence A[1...j-1]
            var i = j -1
            while(i>=0 && inputArray[i]>key){
                inputArray[i+1] = inputArray[i]
                i -= 1
            }
            inputArray[i+1] = key
        }
        return inputArray
    }
}