

class TakeInputFromUser {

    companion object{
        fun createObj():TakeInputFromUser {
            return TakeInputFromUser()
        }
    }

    fun takingInput(){

//        var sc = Scanner(System.`in`)
//        var num = sc.nextInt()
//

        var num = readLine()?.toInt()
        println("result is====>${num?.plus(5)}")


    }

}


fun main(args:Array<String>){

    var takeInputFromUser = TakeInputFromUser.createObj()
    takeInputFromUser.takingInput()
}