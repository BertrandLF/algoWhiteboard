import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe
import kotlin.test.assertEquals

object TwoSumSpek: Spek({

    describe("the exercise example") {
        val twoSum by memoized { TwoSum() }
        val nums = intArrayOf(2,7,11,15)
        val target = 9

        it("should return the first two elements of the list") {
            assertEquals(expected = intArrayOf(0,1), actual = twoSum.twoSum(nums, target))
        }
    }

})