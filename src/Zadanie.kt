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

var bokA: Int = 0

fun main(args: Array<String>){

    var firstname = "asd"
    var lastname = "asd"

    println("Witaj!")
    println("Poniżej podaj swoje dane.")
    println("Imię: ")
    firstname = readLine()!!
    println("Nazwisko: ")
    lastname = readLine()!!

}


/*
ta funkcja wprowadza dane bokA, ale fajnie gdyby mogła wprowadzać też inne boki

fun wprowadzBok(bok: Int = 1): Int {

        return bok
    }
}

 */

fun wprowadzDane(){
    println("Witaj!")
    println("wprowadź bok a")
    bokA = 1
}