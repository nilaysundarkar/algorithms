package cormen.chapter2

import org.junit.Test
import kotlin.test.assertEquals

class InsertionSortTest{

    @Test
    fun testInsertionSort(){
        val sortedArray = InsertionSort.sort(arrayOf(5,3,4,2,1))
        sortedArray.forEach { print(it) }
        assertEquals(true, assertSorted(sortedArray))
    }

    private fun assertSorted(array: Array<Int>):Boolean{
        var result = true
        for(i in 0 until array.size-1){
            if(!(array[i]<array[i+1])){
                result = false
            }
        }
        return result
    }
}