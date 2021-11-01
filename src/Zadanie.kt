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

var firstname = "asd" //to samo co powyżej
var lastname = "asd"

fun main(args: Array<String>){
    
    println("Witaj!")
    println("Poniżej podaj swoje dane.")
    println("Imię: ")
    firstname = readLine()!!
    println("Nazwisko: ")
    lastname = readLine()!!
   // wprowadzDlugosc()     tego tutaj nie trzeba
    //liczPoleKwadratu()

    ////////////// Rozwiązanie
    println("Pole kwadratu to: " + liczPoleKwadratu(wprowadzDlugosc())) // Tutaj zobacz sobie że komputer najpierw prosi o dane a potem wyswietla pole

    // Poczytaj sobie o "kolejka a stos"

}

fun wprowadzDlugosc(): Int{
    println("Wprowadź długość boku nr 1: ")   //tutaj miało poprosić o długość
    val x = readLine()!!.toInt()
    return x;
}

fun liczPoleKwadratu(dlugosc: Int = 0): Int{    //tutaj w () powinien być parametr, tak jak w zadaniu
    return dlugosc*dlugosc;
}
// w miare rozwiązywania kasuj moje komentarze. Bede wiedizal ze przeczytales



/*
Kolejne zadanie
na takiej samej podstawie dodaj funkcje która liczy pole prostokąta

na gwiazdkę. zmodyfikuj wprowadzDlugosc() by za każdym razem jej wywołania wyswietlało kolejny numer boku
np:
gdy liczy pole kwadratu podajesz jeden bok wiec 1. Potem gdy liczy trójkąt będzie 2, 3, 4.

 */