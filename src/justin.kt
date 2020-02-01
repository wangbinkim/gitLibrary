package justin

fun a():Int {
    return 99
}

fun justin():Int {
    return 0
}

fun ellen() {

}

var books = ArrayList<Book>()
var people = ArrayList<Person>()

data class Book(
    var name: String,
    var bookNum: String,
    var borrowed: Boolean = true
)

data class Person(
    var name: String,
    var personNum: String,
    var borrowedBookInfo: ArrayList<Book> = arrayListOf()
)

fun basicInformation() {
    var book1 = Book("Harry Potter", "001", true)
    var book2 = Book("Sherlock Holmes", "002")
    var book3 = Book("Sherlock Holmes #2", "003", false)

    var person1 = Person("Ellen", "001")
    var person2 = Person("Justin", "002")
    var person3 = Person("WB", "003")

    books.add(book1)
    books.add(book2)
    books.add(book3)

    people.add(person1)
    people.add(person2)
    people.add(person3)
}

fun main() {
    basicInformation()

    books.forEach {
        println("${it.name} :: ${it.bookNum}")
    }

    println(books)

    people.forEach { p ->
        println(p.name)
    }


    while (true) {
        println("0:반납 1:검색 2:대출 3:대출현황 4:종료")
        var inpValue = readLine()!!
        if (inpValue == "4") {
            println("도서대출프로그램을 종료합니다.")
            break
        } else {
            runProgram(inpValue)
        }
    }

}

fun borrowBook(personNumber: String, bookNumer: String) {

}

fun checkBorrowedBook(bookNumber: String): Boolean {
    return true
}


fun 대출하라book() {
    println("책번호")
    var inpBookNumber = readLine()!! // 책번호
    println("회원번호")
    var inpPersonNumber = readLine()!! // 회원번호

    if (checkBorrowedBook(inpBookNumber) == true) {
        borrowBook(inpPersonNumber, inpBookNumber)
        println("대출되었습니다.")
    } else {
        println("대출이 불가능합니다.")
    }

}

fun returnBook(bookNumber: String) {

}

fun 반납하라book() {
    println("책번호")
    var 반납할책 = readLine()!!
    returnBook(반납할책)
    println("반납되었습니다.")

}

fun searchBook(bookName: String): ArrayList<Book>? {
    return null
}

fun 검색해서출력하라책을() {
    var 검색할책 = readLine()!!
    var 검색된책 = searchBook(검색할책)
    if (검색된책 == null) {
        println("검색결과가 없습니다.")
    } else {
        println(검색된책)
    }
}

fun returnBorrowedBooks(): ArrayList<Person>? {
    return ArrayList<Person>()
}

fun print대출현황을() {
    var 대출현황 = returnBorrowedBooks()
    println(대출현황)
}

fun runProgram(userValue: String) {
    when (userValue) {
        "0" -> {
            반납하라book()
        }
        "1" -> {
            검색해서출력하라책을()
        }
        "2" -> {
            대출하라book()
        }
        "3" -> {
            print대출현황을()
        }
        else -> {
            println("지원하지않습니다.")

        }
    }

}