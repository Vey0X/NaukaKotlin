fun main(args: Array<String>) {

    var login: String?
    var correctPassword: String?

    var username: String?
    var password: String?

    var register: Int = 1

    var changepassword: String?

    do{

        print("Zarejestruj się! Podaj swój nowy login: ")
        login = readLine()!!
        print("Podaj swoje nowe hasło: ")
        correctPassword = readLine()!!
        register = 1

    }while(register == 2)

    while(true)
    {
        print("Podaj login: ")
        username = readLine()!!
        print("Podaj hasło: ")
        password = readLine()!!

        if((login == username) && (correctPassword == password))
        {
            println("Logowanie...")
            println("Pomyślnie zalogowano")
            break
        }
        else
        {
            println("Błędny login lub hasło! Spróbuj ponownie.")
        }
    }

    print("Czy chcesz zmienić hasło? Będzie to można zrobić tylko raz! ")
    changepassword = readLine()!!.toUpperCase()

    if (changepassword == "TAK")
    {
        register = 2
        do{

            print("Zarejestruj się! Podaj swój nowy login: ")
            login = readLine()!!
            print("Podaj swoje nowe hasło: ")
            correctPassword = readLine()!!
            register = 1

        }while(register == 2)

        while(true)
        {
            print("Podaj login: ")
            username = readLine()!!
            print("Podaj hasło: ")
            password = readLine()!!

            if((login == username) && (correctPassword == password))
            {
                println("Logowanie...")
                println("Pomyślnie zalogowano")
                break
            }
            else
            {
                println("Błędny login lub hasło! Spróbuj ponownie.")
            }
        }

    }
    else
    {
        println("Logowanie zakończone pomyślnie")
    }
}