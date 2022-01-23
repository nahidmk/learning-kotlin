class InfixAndOperatorOverloading {


    fun infixFunctionTest() {
        var infixAndOperatorOverloading = InfixAndOperatorOverloading()

        var res = infixAndOperatorOverloading infixFunctionTest 10

        println(res)
    }

    private infix fun infixFunctionTest(num: Int): Int {
        var sum: Int = 0
        var iterator = num downTo 1
        for (i in iterator) {
            if (i % 2 != 0) {
                sum += i
            }
        }
        return sum
    }


    fun operatorOverloading() {
        var extensionFunction = ExtensionFunction()
        extensionFunction.programmingLanguage = "Ruby"
        extensionFunction.showLanguage()

        var extensionFunction1 = ExtensionFunction()
        extensionFunction1.programmingLanguage = "Django"
        extensionFunction1.showLanguage()

        var extensionFunction2 = extensionFunction  + extensionFunction1
        extensionFunction2.showLanguage()
    }
    infix operator fun ExtensionFunction.plus(obj:ExtensionFunction) :ExtensionFunction{
        var newExtensionFunction = ExtensionFunction()
        newExtensionFunction.programmingLanguage= this.programmingLanguage+" "+obj.programmingLanguage
        return newExtensionFunction
    }


}