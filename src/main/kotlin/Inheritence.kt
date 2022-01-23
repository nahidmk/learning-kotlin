
open class Human(age : Int) {

    var age : Int = 0
    init {
        this.age = age
    }

    open fun hello(){
        println("how do you do : ${this.age}")
    }
}


class Animal(age : Int) : Human (age = age) {

    override fun hello(){
        println("how are you animal")
    }
}
