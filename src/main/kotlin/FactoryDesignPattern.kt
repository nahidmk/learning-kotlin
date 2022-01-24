class FactoryDesignPattern {
    companion object {
        fun creatObject(): FactoryDesignPattern {
            return FactoryDesignPattern()
        }
    }


    fun show() {
        println("hello i am show")
    }
}

fun main(args: Array<String>) {
    var factoryDesignPattern = FactoryDesignPattern.creatObject()
    factoryDesignPattern.show()
}