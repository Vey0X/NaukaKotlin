
/*
Zadanie

Program zgodnie ze specyfikacją:

1 - proszenie usera o dane do zadania
2 - menu wyboru (1 do 3)
3 - liczenie pola kwadratu
4 - liczenie pola trójkąta
5 - liczenie pola prostokąta

Funkcja wyświetlająca komunikaty wyswietl()
Funkcja pobierzDane()

Wraz z pisaniem dodajemy kolejne funkcje
Kolejne kroki: logowanie/rejestracja, interfejs graficzny.

Kod programu poniżej tego komentarza
 */

var firstname = "asd"
var lastname = "asd"
var koniec = false
//var wylFunWProg = true

fun main(args: Array<String>){
    println("Witaj!")
    wprowadzDaneUzytkownika()
    while(koniec == false) {            //to samo 1
      //  witaj()
        wyswietlmenu()
        sprawdzanieWyboruOpcji(readLine()!!.toInt())
     //   wylFunWProg()
   //     if(koniec == false) {           //to samo 2. Wiec po co ten if ?
            nacisnijenterabykontynuowac()
   //     }
    }
}
//
//fun witaj(): String{
//    if(wylFunWProg == true){        //funkcja nic nie robi
//        println("Witaj!")
//    }
//    return "Witaj!"
//}


fun wprowadzDlugosc(): Int{
    println("Wprowadź długość boku nr 1: ")
    val x = readLine()!!.toInt()
    return x;
}

fun liczPoleKwadratu(dlugosc: Int = 0): Int{
    return dlugosc*dlugosc;
}

fun liczPoleProstokata(dlugosc1: Int = 0, dlugosc2: Int = 0): Int{
  return dlugosc1*dlugosc2
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

fun sprawdzanieWyboruOpcji(menuwyboru: Int = 0): Int{
    if(menuwyboru > 0) {        //po co ten if ?
        if (menuwyboru == 1) {
            liczPoleKwadratu()
            println("Pole kwadratu to: " + liczPoleKwadratu(wprowadzDlugosc()))
        } else if (menuwyboru == 2) {
            liczPoleProstokata()
            println("Pole prostokąta to: " + liczPoleProstokata(wprowadzDlugosc(), wprowadzDlugosc()))
        } else if (menuwyboru == 3){
            liczPoleTrojkata()
            println("Pole trójkąta to: " + liczPoleTrojkata(wprowadzDlugosc(),wprowadzDlugosc()))
        } else if (menuwyboru == 4){
            println("Opuszczanie programu...")
            koniec = true
        }
    }
    return menuwyboru
}

fun wprowadzDaneUzytkownika() {

 //   if(wylFunWProg == true){
        println("Poniżej podaj swoje dane.")
        println("Imię: ")
        firstname = readLine()!!
        println("Nazwisko: ")
        lastname = readLine()!!
  //  }

 //   return firstname
}
//                                  ta funkcja tez nic nie robi
//fun wprowadzOpcjeMenu(): Int {
//    val menuwyboru = readLine()!!.toInt()
//    return menuwyboru
//}

//fun wylFunWProg(): Boolean{
//    if(wylFunWProg == true) {
//        wylFunWProg = false
//    }
//    return wylFunWProg
//}

fun nacisnijenterabykontynuowac(){
    println("Naciśnij ENTER aby kontynuować.")
    readLine()
        for(x in 1..25){
            println("")
        }
}


/*
Na gwiazdkę. Spróbuj za każdym wynikiem wyświetlić 'Naciśnij enter' Po naciśnięciu 'enter' ładnie wyczyści cały tekst i program wróci na początek,(wyswietli menu)
 */
