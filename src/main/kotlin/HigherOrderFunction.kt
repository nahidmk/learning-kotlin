class HigherOrderFunction {

    companion object {
        fun createObj(): HigherOrderFunction = HigherOrderFunction()
    }

    fun listTest() {

        var nums: List<Int> = listOf(10, 8, 6, 4, 2, 3)

        val toList = nums.filter { it > 5 }.map { it * 2 }

        toList.forEach(::println)

    }
}

fun main(args: Array<String>) {
    var higherOrderFunction = HigherOrderFunction.createObj()
    higherOrderFunction.listTest()
}