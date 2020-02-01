package library.ellen.data

data class Book(
    var name: String,
    var bookNum: String,
    var borrowed: Boolean = false
)

data class Person(
    var name: String,
    var personNum: String,
    var borrowedBookInfo: ArrayList<Book> = arrayListOf()
)

var books = ArrayList<Book>()
var people = ArrayList<Person>()

fun makeBasicInformation() {
    var book1 = Book("Harry Potter", "001", false)
    var book2 = Book("Sherlock Holmes #1", "002")
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