fun main(args: Array<String>) {

    var CzySieRusza: String
    var CzyPowinnoSieRuszac: String

    print("Czy coś się rusza?")

    CzySieRusza = readLine()!!.toUpperCase()

    if (CzySieRusza == "TAK") {
        print("A powinno się ruszać?")
        CzyPowinnoSieRuszac = readLine()!!.toUpperCase()

        if (CzyPowinnoSieRuszac == "NIE") {
            print("Użyj taśmy. Po problemie!")
        } else {
            print("Po problemie!")
        }
    } else {
        print("A powinno się ruszać?")
        CzyPowinnoSieRuszac = readLine()!!.toUpperCase()

        if (CzyPowinnoSieRuszac == "NIE") {
            print("Po problemie!")
        } else {
            print("Użyj WD40. Po problemie!")
        }
    }
}
