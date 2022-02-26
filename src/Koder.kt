
var tekst: String = ""
var konieckoder: Boolean = false
var menuKodera: Int = 0
var tekstdekoder: String = ""
var dekoder: Char = '\u0000'

fun main (args: Array<String>){
    println("Witaj!")
    while (konieckoder == false) {
        wyswietlMenuKodera()
        sprawdzanieMenuKodera()
    }
}

fun wyswietlMenuKodera (){
    println("1. Kodowanie")
    println("2. Dekodowanie")
    println("3. Koniec")
}

fun sprawdzanieMenuKodera (){

    menuKodera = readLine()!!.toInt()

    when(menuKodera) {
        1 -> {
            wprowadzTekst()
            kodowanie()
        }
        2 -> {
            wprowadzTekstDekoder()
            dekodowanie()
        }
        3 -> {
            println("Opuszczanie programu...")
            konieckoder = true
        }
    }
return
}

fun wprowadzTekst (){
    println("Wprowadź tekst do zakodowania.")
    tekst = readLine()!!
}

fun kodowanie (){
    tekst.forEach {
        println(it.toChar().hashCode())
    }
}

fun wprowadzTekstDekoder (){
    println("Wprowadź tekst do odkodowania.")
    tekstdekoder = readLine()!!
}

fun dekodowanie (){
    tekstdekoder
    dekoder = tekstdekoder.toInt().toChar()
    println(dekoder)
}
