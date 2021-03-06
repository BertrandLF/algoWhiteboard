import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe
import kotlin.test.assertContentEquals

object TwoSumSpek : Spek({

    describe("the exercise examples") {
        val twoSum by memoized { TwoSum() }
        val nums = intArrayOf(2, 7, 11, 15)
        val nums2 = intArrayOf(3, 2, 4)
        val nums3 = intArrayOf(2, 5, 5, 11)
        val target = 9
        val target2 = 6
        val target3 = 10

        it("should return the first two elements of the list") {
            assertContentEquals(expected = intArrayOf(0, 1), actual = twoSum.twoSum(nums, target))
        }

        it("should return the second two elements of the list") {
            assertContentEquals(expected = intArrayOf(1, 2), actual = twoSum.twoSum(nums2, target2))
        }

        it("should return the second two elements of the list") {
            assertContentEquals(expected = intArrayOf(1, 2), actual = twoSum.twoSum(nums3, target3))
        }

    }

})