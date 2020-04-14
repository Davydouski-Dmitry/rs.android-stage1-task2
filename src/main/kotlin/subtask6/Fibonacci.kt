package subtask6

class Fibonacci {

    fun productFibonacciSequenceFor(n: Int): IntArray {

        var smallerFibNumber = 0
        var largerFibNumber = 1

        val outputArray: IntArray = intArrayOf(0, 0 ,0)

        while(smallerFibNumber * largerFibNumber < n){
            val largerValue = largerFibNumber
            largerFibNumber += smallerFibNumber
            smallerFibNumber = largerValue
        }

        outputArray[0] = smallerFibNumber
        outputArray[1] = largerFibNumber

        if (smallerFibNumber * largerFibNumber == n) outputArray[2] = 1
        else outputArray[2] = 0

        return  outputArray

        throw NotImplementedError("Not implemented")
    }
}
