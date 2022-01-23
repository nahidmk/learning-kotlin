class CompanionObject {

    companion object {
//        for Static Function
        @JvmStatic
        fun show() {
            println("hello")
        }
    }
}

fun main(args: Array<String>) {

    CompanionObject.show()

}