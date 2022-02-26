
var firstname = "asd"
var lastname = "asd"
var menuwyboru: Int = 0
var koniec: Boolean = false

fun main(args: Array<String>){
    println("Witaj!")
    wprowadzDaneUzytkownika()
    while(koniec == false){
        wyswietlmenu()
        sprawdzanieWyboruOpcji(readLine()!!.toInt())
            nacisnijEnterAbyKontynuowac()
    }
}

fun wprowadzDlugosc(): Int{
    println("Wprowadź długość boku nr 1: ")
    val x = readLine()!!.toInt()
    return x;
}

fun liczPoleKwadratu(dlugosc: Int = 0): Int{
    return dlugosc*dlugosc;
}

fun liczPoleProstokata(dlugosc1: Int = 0, dlugosc2: Int = 0): Int {
    return dlugosc1 * dlugosc2
}

fun liczPoleTrojkata(dlugosct1: Int = 0, dlugosct2: Int = 0): Int{
    return dlugosct1*dlugosct2/2
}

fun wyswietlmenu() {
    println("Wybierz czego pole chcesz obliczyć.")
    println("1. Kwadratu")
    println("2. Prostokąta")
    println("3. Trójkąta")
    println("4. Koniec")
}

fun sprawdzanieWyboruOpcji(menuwyboru: Int) {


    when(menuwyboru){
        1->{
            liczPoleKwadratu()
            println("Pole kwadratu to: " + liczPoleKwadratu(wprowadzDlugosc()))
        }
        2->{
            liczPoleProstokata()
            println("Pole prostokąta to: " + liczPoleProstokata(wprowadzDlugosc(), wprowadzDlugosc()))
        }
        3->{
            liczPoleTrojkata()
            println("Pole trójkąta to: " + liczPoleTrojkata(wprowadzDlugosc(),wprowadzDlugosc()))
        }
        4->{
            println("Opuszczanie programu...")
            koniec = true
        }
        else->{
            println("Podano nieprawidłową liczbę.")
            nacisnijEnterAbyKontynuowac()
            wyswietlmenu()
        }
    }
    return
}

fun wprowadzDaneUzytkownika() {
        println("Poniżej podaj swoje dane.")
        println("Imię: ")
        firstname = readLine()!!
        println("Nazwisko: ")
        lastname = readLine()!!
}

fun nacisnijEnterAbyKontynuowac(){
    println("Naciśnij ENTER aby kontynuować.")
    readLine()
        for(x in 1..25){
            println("")
        }
}