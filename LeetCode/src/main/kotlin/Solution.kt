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

    // 121 is palindrom , 214 is not palindrom
    fun isPalindrome(x: Int): Boolean {
        if (x < 0) {
            return false
        }

        var num = x
        var reversed = 0

        while (num != 0) {
            val digit = num % 10
            reversed = reversed * 10 + digit
            num /= 10
        }


        return reversed == x
    }

}