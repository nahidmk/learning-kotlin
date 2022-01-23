import java.math.BigInteger

class Alien {

    var id: Int = 0
    var name : String = "Nahid"

    constructor(id: Int, name: String) {
        this.id = id
        this.name = name
    }

    init {
        println("hello i am called init")
    }

    fun calculateAverage(a:Int, b:Int, c:Int): Int {
        return (a+b+c)/3
    }

    fun testRecursion(num : Int) : Int{
        if(num==0){
            return 1
        }
        return num * testRecursion(num-1)
    }

    tailrec fun tailRecursion(num : BigInteger, result: BigInteger) : BigInteger{
//        tailrec is used for compile optimization

        if(num== BigInteger.ZERO){
            return BigInteger.ONE
        }
        return num * tailRecursion(num- BigInteger.ONE, num*result )

    }

}