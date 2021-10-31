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
var x : Int = 0
var polekwadratu : Int = 0

fun main(args: Array<String>){


    println("Witaj!")
    println("Poniżej podaj swoje dane.")
    println("Imię: ")
    firstname = readLine()!!
    println("Nazwisko: ")
    lastname = readLine()!!
    wprowadzDane()
    wprowadzDlugosc()
    liczPoleKwadratu()
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

    return bokB.toInt()     //Ta część kodu nigdy nie zostanie wykonana

    return bokC.toInt()     //Ta część kodu nigdy nie zostanie wykonana

    return bokD.toInt()     //Ta część kodu nigdy nie zostanie wykonana
}

fun wprowadzDlugosc(odcinek: Int = 0): Int{

    x = readLine()!!.toInt()
    return x;
}

fun liczPoleKwadratu(): Int{

    return x * x = polekwadratu;print("Pole kwadratu to $polekwadratu")
}

/*
  Kontynuacja zadania
 mamy funkcje fun wprowadzDlugosc(odcinek: Int): Int{ tutaj jest ciało funkcji.  }
 - uzupełnij jej treść by podczas jej wykonywania prosiła usera o dane. Potem zajmiemy się sprawdzaniem poprawnosci wprowadzonych danych.
 ( trochę już napisałem, musisz poprawić błędy i uzupełnić ;) )

 Druga funkcja będzie liczyć pole kwadratu:
 Czyli

 funkcja fun liczPoleKwadratu(wprowadzDlugosc(x)): Int{ tutaj wykonaj oblcizenia i zrob return wyniku}
 - tutaj danymi wprowadzonymi jest poprzednia funkcja. W niej uzupełnij by poprawnie zwracała pole kwadratu


 */