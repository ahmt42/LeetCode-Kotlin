package easy

fun twoSum(nums: IntArray, target: Int): IntArray {
    val map = mutableMapOf<Int, Int>()
    for (i in nums.indices) {
        val complement = target - nums[i]
        if (complement in map) {
            return intArrayOf(map[complement]!!, i)
        }
        map[nums[i]] = i
    }

    return intArrayOf()
}

fun main() {
    val nums = intArrayOf(34, 12, 21, 79, 67, 89, 90, 45, 1, 56)
    val target = 112
    val indices = twoSum(nums, target)
    if(indices.size == 0) {
        println("SONUÇ YOK")
    } else {
        println(indices[0])
        println(indices[1])
    }
}