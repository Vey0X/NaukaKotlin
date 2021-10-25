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

 // by mieć dostęp do zmiennej też w innej części kodu



var firstname = "asd" //to samo co powyżej
var lastname = "asd"


fun main(args: Array<String>){


    println("Witaj!")
    println("Poniżej podaj swoje dane.")
    println("Imię: ")
    firstname = readLine()!!
    println("Nazwisko: ")
    lastname = readLine()!!
    wprowadzDane()
}


fun wprowadzDane(bok: Int = 0): Int{

    var bokA: Int
    var bokB: Int
    var bokC: Int
    var bokD: Int

    println("Witaj $firstname!")

    println("Wprowadź bok a: ")
    bokA = readLine()!!.toInt()

    println("Wprowadź bok b: ")
    bokB = readLine()!!.toInt()

    println("Wprowadź bok c: ")
    bokC = readLine()!!.toInt()

    println("Wprowadź bok d: ")
    bokD = readLine()!!.toInt()

    println("Wprowadzono wszystkie dane.")

    return bokA.toInt()

    return bokB.toInt()

    return bokC.toInt()

    return bokD.toInt()
}