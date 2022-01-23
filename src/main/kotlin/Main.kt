fun main(args: Array<String>) {

   var animal : Human = Animal(20)
   animal.hello()

}


fun extensionFunctionTest() {

    var extensionFunction = ExtensionFunction()
    extensionFunction.skills = "Java"
    extensionFunction.showSkills()

    var extensionFunction1 = ExtensionFunction()
    extensionFunction1.skills = "python"
    extensionFunction1.showSkills()

    var extensionFunction2 = extensionFunction.add(extensionFunction1)
    extensionFunction2.showSkills()
}


fun ExtensionFunction.add(obj: ExtensionFunction): ExtensionFunction {

    var extensionFunction = ExtensionFunction()
    extensionFunction.skills = this.skills + " " + obj.skills
    return extensionFunction
}



