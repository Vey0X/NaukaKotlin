import kotlin.random.Random

var tekst: String = ""
var konieckoder: Boolean = false

fun main (args: Array<String>){
    println("Witaj!")
    while (konieckoder == false) {
        wyswietlMenuKodera()
        sprawdzanieMenuKodera()
    }
}

fun wyswietlMenuKodera (){
    println("")
    println("")
    println("1. Kodowanie")
    println("2. Dekodowanie")
    println("3. Koniec")
}

fun sprawdzanieMenuKodera () {
    var menuKodera: Int = 0

    try {
        menuKodera =
            readLine()!!.toInt() // ZADANIE dla Ciebie. zabezpiecz, by po wpisaniu litery np: a(w menu), nie wysypało programu

        when (menuKodera) {
            1 -> {
                wprowadzTekst()
                kodowanie()
            }
            2 -> {
                wprowadzTekst()
                dekodowanie()
            }
            3 -> {
                println("Opuszczanie programu...")
                konieckoder = true
            }
            else -> {
                println("")
                println("Wprowadzono nie prawidłową liczbe.")
            }
        }
        return
    }catch (e: NumberFormatException){
        println("")
        println("Wprowadzono nie prawidłowy znak.")
    }
}

fun wprowadzTekst (){
    println("Wprowadź tekst")
    tekst = readLine()!!
    println("")
}

fun kodowanie (){
    var rotacja = ""

    val charPool : List<Char> = ('a'..'z') + ('A'..'Z')
    tekst.forEach {
        // print( (it.toChar().hashCode()).toString().length )
        rotacja = rotacja.plus((it.toChar().hashCode()).toString().length)
        //  print(it.toChar().hashCode())
        rotacja = rotacja.plus(it.toChar().hashCode())
        val randomString = (1..Random.nextInt(0,3))
            .map { i -> kotlin.random.Random.nextInt(0, charPool.size) }
            .map(charPool::get)
            .joinToString("");
        rotacja = rotacja.plus(randomString)
    }
    rotacja = rotacja.reversed()
    println(rotacja)
}

fun dekodowanie () {
    var licznik = 0
    tekst = tekst.reversed()
    while ( (licznik != tekst.length)){
        try {
            when (tekst[licznik].toString()) {
                "1" -> {
                    print((tekst[licznik + 1]).toInt().toChar())
                    licznik = licznik + 2
                }
                "2" -> {
                    print((tekst[licznik + 1] + "" + tekst[licznik + 2]).toInt().toChar())
                    licznik = licznik + 3
                }
                "3" -> {
                    print((tekst[licznik + 1] + "" + tekst[licznik + 2] + "" + tekst[licznik + 3]).toInt().toChar())
                    licznik = licznik + 4
                }
                else -> {
                    licznik = licznik + 1
                }
            }

        }catch(e: Exception) {
                when(e) {
                    is NumberFormatException->{
                        println("Kod uległ uszkodzeniu")
                    }
                    is StringIndexOutOfBoundsException -> {
                        println("Nie można przetworzyć kodu")
                    }
                    else -> throw e
                }
            break
            }
    }
}