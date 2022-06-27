class TwoSum {

    fun twoSum(nums: IntArray, target: Int): IntArray {
        val complements = HashSet<Int>(nums.size)
        var result = intArrayOf(0,0)
        for ((index, value) in nums.withIndex()) {
            val complement = value - target
            if (complements.contains(complement)){
                result = intArrayOf(index, complements.indexOf(complement))
            }
            complements.add(complement)
        }
        return result
    }

}