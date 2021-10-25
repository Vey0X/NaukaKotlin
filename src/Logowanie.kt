fun logowanie(args: Array<String>) {

    var login: String = "Kamil"
    var correctPassword: String = "123"

    var username: String?
    var password: String?

    while (true) {
        print("Podaj login: ")
        username = readLine()!!
        print("Podaj hasło: ")
        password = readLine()!!

        if ((login == username) && (correctPassword == password)) {
            println("Logowanie...")
            println("Pomyślnie zalogowano")
            break
        } else {
            println("Błędny login lub hasło! Spróbuj ponownie.")
        }
    }
}
