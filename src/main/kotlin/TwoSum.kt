class TwoSum {

    fun twoSum(nums: IntArray, target: Int): IntArray {
        // will store at index i the complement of the value at index i in nums
        val complements = hashMapOf<Int, Int>()
        for ((i, iValue) in nums.withIndex()) {
            val complement = target - iValue
            if (complements.contains(iValue))
                return intArrayOf(complements[iValue]!!, i)
            complements[complement] = i
        }
        return intArrayOf(0, 0)
    }

}