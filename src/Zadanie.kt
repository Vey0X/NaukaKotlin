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
var menuwyboru = 0


fun main(args: Array<String>){
    
    println("Witaj!")
    println("Poniżej podaj swoje dane.")
    println("Imię: ")
    firstname = readLine()!!
    println("Nazwisko: ")
    lastname = readLine()!!

    println("Wybierz czego pole chcesz obliczyć.")
    println("1 = kwadratu, 2 = prostokąta, 3 = trójkąta")
    menuwyboru = readLine()!!.toInt()

    while (menuwyboru == 1){
        liczPoleKwadratu()
        println("Pole kwadratu to: " + liczPoleKwadratu(wprowadzDlugosc()))
        break
    }

    while (menuwyboru == 2){
        liczPoleProstokata()
        println("Pole prostokąta to: " + liczPoleProstokata(wprowadzDlugosc(),wprowadzDlugosc()))
        break
    }


    while (menuwyboru == 3){
        liczPoleTrojkata()
        println("Pole trójkąta to: " + liczPoleTrojkata(wprowadzDlugosc(),wprowadzDlugosc()))
        break
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

fun liczPoleProstokata(dlugosc1: Int = 0, dlugosc2: Int = 0): Int{
  return dlugosc1*dlugosc2
}

fun liczPoleTrojkata(dlugosct1: Int = 0, dlugosct2: Int = 0): Int{
    return dlugosct1*dlugosct2/2
}