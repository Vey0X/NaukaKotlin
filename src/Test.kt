fun main(args:Array<String>)
{
    var p1 = person(name="Kamil", age=13)
    p1.print()
    var p2 = person(name= "Kamil")
    p2.print()
}

class person
{
    constructor(name: String, age: Int)
    {
        this.name = name
        this.age = age
    }

    constructor(name: String)
    {
        this.name = name
    }

    var name : String
    var age : Int = 0

    fun print()
    {
        println("Imię: $name, wiek: $age")
    }
}