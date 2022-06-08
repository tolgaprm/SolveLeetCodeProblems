fun main() {
    val data = Data()
    val solution = Solution()

    var result = solution.twoSum(data.twoSumArray(), 9)

    println("${result!![0]} ${result[1]}")

    println(solution.isPalindrome(121))

}