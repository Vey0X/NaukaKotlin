
var tekst: String = ""
var konieckoder: Boolean = false
var menuKodera: Int = 0
var tekstdekoder: String = ""
var dekoder: Char = '\u0000'
var dekoderPetla = 1
var iloscznakow = 0
var iloscpetli = 0
var licznik = 0

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
    println("")
}

fun kodowanie (){
    tekst.forEach {
        print(it.toChar().hashCode())
    }
}

fun wprowadzTekstDekoder (){
    println("Wprowadź tekst do odkodowania.")
    tekstdekoder = readLine()!!
    println("")
}

fun dekodowanie () {
    tekstdekoder

    iloscznakow = tekstdekoder.length
    iloscpetli = iloscznakow / 2

    for(x in 0..iloscpetli)
    print((tekstdekoder[licznik+2] + "" + tekstdekoder[licznik+2]).toInt().toChar())
    println("")
}



