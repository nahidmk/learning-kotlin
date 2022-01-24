class ArrayTest {

    companion object{
        fun createObj():ArrayTest = ArrayTest()
    }
    fun intArrayOfTest(){
        var num = intArrayOf(10,20,30,40)  //floatArrayOf()/
        num[2] = 5
        println(num[2])

        for(i in num)
            println(i)
    }

    fun testArray(){
        var num = IntArray(4) // FloatArray(4) / DoubleArray(4)
        var aliens = arrayOfNulls<Alien>(5) //arrayOfNulls<String>(5)
    }

    fun listTest(){

//        var nums : List<Int> = listOf(10,8,6) //immutable List

        var nums : MutableList<Int> = mutableListOf<Int>()  //mutable List

        nums.add(5)
        nums.addAll(1, listOf(5,7,8))

        for (i in nums)
            println(i)
    }


}

fun main(args:Array<String>){
    var arrayTest  = ArrayTest.createObj()
    arrayTest.listTest()
}