class Solution {

    // [2, 7, 11, 15]
    fun twoSum(nums: IntArray, target: Int): IntArray? {
        val map: HashMap<Int, Int> = hashMapOf()

        for (i in nums.indices) {
            val complement = target - nums[i]

            if (map.containsKey(complement)) {
                return intArrayOf(i, map[complement]!!)
            }
            map[nums[i]] = i

        }

        return null
    }

}