interface A {
    fun show()
    fun displayShow() {
        println("hello i ama from A")
    }
}

interface B {
    fun think()
    fun displayThink() {
        println("hello i ama from A")
    }
}

class C : A, B {

    override fun show() {
        println("i am show")
    }

    override fun think() {

        println("i am think ")

    }

    override fun displayThink() {
        super.displayThink()
    }

}