package easy

/*
 * [1] Two Sum
 *
 *
 */

class Solution {
    fun twoSum (nums: IntArray, target: Int): IntArray? {
        for (i in nums.indices) {
            for (j in nums.indices.drop(i + 1)) {
                if (nums[i] + nums[j] == target) {
                    return intArrayOf(i, j)
                }
            }
        }
        return null
    }
}

fun main() {
    val numbers: IntArray = intArrayOf(9,3,2,5,1,12)
    val target: Int = 6

    var solution = Solution()
    val nums = solution.twoSum(numbers, target)

    nums?.forEach {
        println(it)
    }
}