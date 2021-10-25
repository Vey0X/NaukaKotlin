fun LiczbyPażysteIWiększeOd10(args: Array<String>) {

    println("Witaj w programie który sprawdza czy podana liczba jest większa niż 10")
    println("oraz jeżeli liczba jest mniejsza niż 10 sprawdza czy jest parzysta.")
    println("Wprowadź dowolną liczbę: ")
    var liczba: Int = readLine()!!.toInt()

    val stała: Int = 10

    if (liczba > stała) print("Podana liczba jest większa niż $stała")
    else if(liczba%2==0) print("Podana liczba jest mniejsza niż $stała oraz jest parzysta")
    else print("Podana liczba jest mniejsza niż $stała oraz jest nieparzysta")


}