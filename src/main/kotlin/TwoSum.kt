class TwoSum {

    fun twoSum(nums: IntArray, target: Int): IntArray {
        var result = intArrayOf(0, 0)
        // will store at index i the complement of the value at index i in nums
        val complements = hashSetOf<Int>()
        for ((i, iValue) in nums.withIndex()) {
            val complement = target - iValue
            println("Complements: $complements, Value: $iValue")
            if (complements.contains(iValue))
                result = intArrayOf(complements.indexOf(iValue), i)
            complements.add(complement)
        }
        println(complements)
        return result
    }


}