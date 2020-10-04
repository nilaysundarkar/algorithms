package cormen.chapter2

import org.junit.Test
import kotlin.test.assertEquals

class InsertionSortTest{

    @Test
    fun testInsertionSortAscending(){
        val sortedArray = InsertionSort.sortAscending(arrayOf(5,3,4,2,1))
        sortedArray.forEach { print(it) }
        assertEquals(true, assertSortedAsc(sortedArray))
    }

    @Test
    fun testInsertionSortDescending(){
        val sortedArray = InsertionSort.sortDescending(arrayOf(5,3,4,2,1))
        sortedArray.forEach { print(it) }
        assertEquals(true, assertSortedDesc(sortedArray))
    }

    private fun assertSortedAsc(array: Array<Int>):Boolean{
        for(i in 0 until array.size-1){
            if(!(array[i]<array[i+1])){
                return false
            }
        }
        return true
    }

    private fun assertSortedDesc(array: Array<Int>):Boolean{
        for(i in 0 until array.size-1){
            if(!(array[i]>array[i+1])){
                return false
            }
        }
        return true
    }
}