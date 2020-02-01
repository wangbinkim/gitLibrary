package ellen

var books = ArrayList<Book>()
var people = ArrayList<Person>()

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

fun basicInformation() {
    var book1 = Book("Harry Potter", "001", true)
    var book2 = Book("Sherlock Holmes", "002")
    var book3 = Book("Sherlock Holmes", "003", false)

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

fun 함수제작테스트():Int {
    return 111
}

fun main() {
    basicInformation()

    searchBook("Holmes")
    borrowBook("Ellen", "001")
    borrowBook("001", "002")
    borrowBook("003", "003")
    //returnBook("001")


// 아빠답안지
//    println("----------대출중------------------------")
//    books.filter { it.borrowed }.forEach {
//        println(it)
//    }
//
//    println("----------대출실행------------------------")
//    borrowBook("111", "002")
//    borrowBook("001", "111")
//
//    borrowBook("001", "001")
//    borrowBook("001", "002")
//
//
//    println("----------사람마다빌린책------------------------")
//    people.forEach {
//        println("${it.name} -> ${it.borrowedBookImf}")
//    }
//
//    println("-----------Holm검색 후 반납-----------------------")
//    books.filter { it.name.contains("Holm") }.forEach {
//        println(it)
//        it.borrowed=false
//        people.find { p -> p.borrowedBookImf.contains(it) }?.borrowedBookImf?.remove(it)
//    }
//
//    println("----------대출실행------------------------")
//    borrowBook("001", "003")
//    borrowBook("003", "002")
//
//    println("----------사람마다빌린책------------------------")
//    people.forEach {
//        println("${it.name} -> ${it.borrowedBookImf}")
//    }
//
//    println("-----------대출중인책리스트확인-----------------------")
//    books.filter { it.borrowed }.forEach {
//        println(it)
//    }
//
//    println("----------사람마다빌린책------------------------")
//    people.forEach {
//        println("${it.name} -> ${it.borrowedBookImf}")
//    }
//
//

}


fun searchBook(bookName: String): ArrayList<Book>? {
    var bookList = ArrayList<Book>()
    books.filter { it.name.contains(bookName) }.forEach { b ->
        //        println(b.name)
        bookList.add(b)
//        println(bookList)
    }
    if (bookList != ArrayList<Book>()) {
        return bookList
    } else return null

//    }
}
//    for( i in 1..books.size){
//        println(i)
//    }
//    books.forEach {
//        println(it.name)
//    }


fun borrowBook(personNumber: String, bookNumber: String) {
    var p = people.find { it.personNum == personNumber }
    var b = books.find { it.bookNum == bookNumber }

    if (p != null) {
        if (b != null) {
            if(b.borrowed) println(" 대출중인 책")
            else{
                println("대출됨")
                p.borrowedBookInfo.add(b)
                b.borrowed = false
            }
        }else  println("책 번호가 존재하지 않음")

    } else println("회원 번호가 존재하지 않음")

}


// 아빠답안지
/*
var p = people.find { it.personNum == personNumber }
var b = books.find { b -> b.bookNum == bookNumber }

if (b != null) {
    if (b.borrowed) println("대출중")
    else {
        if (p != null) {
            p.borrowedBookImf.add(b)
            b.borrowed = true
            println("${p.name} 님 ${b.name} 가 대출되었습니다")
        } else {
            println("사람없음")
        }
    }
} else {
    println("책없음")
}
*/


//  var borrowedcheck = false

//    myloop@ for (i in 0 until books.size) {
////        println(" i = $i")
//        for (o in 0 until people.size) {
////            println(" o = $o")
//            if (personNumber == people[o].personNum && bookNumber == books[i].bookNum) {
//                people[o].borrowedBook = books[i].name
//                books[i].borrowed = false
//                borrowedcheck = true
//                println("${people[o].name}님 ${books[i].name}가 대출되었습니다.")
//                println(people[o])
//                println(books[i])
//                break@myloop
//            }
//        }
//    }
//
//    if (!borrowedcheck) {
//        println("잘못된 입력값이 있습니다.")
//    }
//}

//fun returnBook(bookNumber: String) {
//    var loopValue = 0
//    for (i in 0 until people.size) {
//        if (bookNumber == people[i].borrowedBookImf) {
//            people[i].borrowedBookImf = "None"
//            books[i].borrowed = true
//            println("${people[i]}님 반납이 완료되었습니다.")
//        }
//    }
//    if (books[loopValue].borrowed != false) {
//        println("반납할 수 없는 책입니다.")
//    }
//
//}

//fun returnBook(bookNumber: String){
//    var b = books.find { b -> b.bookNum == bookNumber }
//}


fun runProgram() {}

fun 대출하라책을() {}
fun 반납하라책을() {}
fun 검색해서출력하라책을() {}


//대출불가능일 때 -> false 리턴, 대출가능하면 true 리턴
//if (checkBook(inputValue) == false) {
//    println("대출불가능")
//}
//else {
//    println("대출가능")
//}

// todo returnBook 확인 & checkBorrowedBook(bookNumber:String):Boolean 만들기
// todo 대출목록 쓰기


//
fun returnBorrowedBooks(): ArrayList<Person> {
    return ArrayList<Person>()
}