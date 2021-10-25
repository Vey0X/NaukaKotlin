fun minutnik(args: Array<String>) {

    println("Witaj w programie odliczającym czas")
    print("Wpisz ile sekund chcesz odmierzać: ")

    var czas: Int = readLine()!!.toInt()

    for(i in czas downTo 0) {

        if (i != 0) {
            println(i)
            Thread.sleep(1000)
        } else
        {
            println("Koniec czasu!")
        }
    }
}
