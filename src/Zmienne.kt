fun main(args: Array<String>) {

    print("Podaj pierwszą liczbę: ")
    var a = readLine()!!.toInt()
    print("Podaj drugą liczbę: ") //Test komentarz
    var b = readLine()!!.toInt()

    fun dodaj() {
        return println("Suma dwóch liczb wynosi: $a + $b = ${a + b}")
    }
    print(dodaj())
}