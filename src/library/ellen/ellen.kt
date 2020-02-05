package library.ellen

import library.ellen.data.*


fun main() {
    makeBasicInformation()
    borrowBook("001", "001")
    borrowBook("001", "002")
    returnBorrowedBooks("001")
    returnBorrowedBooks("002")
//    checkBorrowedBook()
}

fun searchBook(bookName: String): ArrayList<Book>? {
    var bookList = ArrayList<Book>()
    books.filter { it.name.contains(bookName) }.forEach { b ->
        //        L(b.name)
        bookList.add(b)
    }
    if (bookList != ArrayList<Book>()) {
        L(bookList)
        return bookList
    } else return null
}
//완료됨

fun borrowBook(personNumber: String, bookNumber: String) {
    var p = people.find { it.personNum == personNumber }
    var b = books.find { it.bookNum == bookNumber }

    if (p != null) {
        if (b != null) {
            if (!b.borrowable) L("${b.name} 는 대출중인 책")
            else {
                L("${p.name} 님 ${b.name} 가 대출됨")
                p.borrowedBookInfo.add(b)
                b.borrowable = false
            }
        } else L("책 번호가 존재하지 않음")

    } else L("회원 번호가 존재하지 않음")
}
// 완료됨

fun returnBorrowedBooks(bookNumber: String): ReturnedInfo {
    var b = books.find { it.bookNum == bookNumber }
    var p = people.find { it.borrowedBookInfo.contains(b) }

    if (b != null) {
        if (p != null) {
            b.borrowable = true
            p.borrowedBookInfo.remove(b)
            println(p.borrowedBookInfo)
            return ReturnedInfo(p.name, b.name, "CODE_RETURNED")
        } else return ReturnedInfo(null, null, "CODE_NO_PERSON")
    } else return ReturnedInfo(null, null, "CODE_NO_BOOK")
}
// todo 회원 이름, 책 이름, 결과 코드 리턴 (Data Class 작성)
// return code 100 반납완료 101 반납불가 102 책번호 존재하지 않음
// 완료됨

//fun checkBorrowedBook():Person? {
//    var p = people.forEach{it.borrowedBookInfo != }
//    println(p)
//    return (p)
//}

fun L(s: Any) {
    println("ellen log : $s")
}

fun L(s: Any, n: Int): Int {
    println("ellen log : $s")
    return n
}


//todo checkBorrowedBook(bookNumber:String):Boolean 만들기


// 아빠답안지
/*
var p = people.find { it.personNum == personNumber }
var b = books.find { b -> b.bookNum == bookNumber }

if (b != null) {
    if (b.borrowed) L("대출중")
    else {
        if (p != null) {
            p.borrowedBookImf.add(b)
            b.borrowed = true
            L("${p.name} 님 ${b.name} 가 대출되었습니다")
        } else {
            L("사람없음")
        }
    }
} else {
    L("책없음")
}
*/


//  var borrowedcheck = false

//    myloop@ for (i in 0 until books.size) {
////        L(" i = $i")
//        for (o in 0 until people.size) {
////            L(" o = $o")
//            if (personNumber == people[o].personNum && bookNumber == books[i].bookNum) {
//                people[o].borrowedBook = books[i].name
//                books[i].borrowed = false
//                borrowedcheck = true
//                L("${people[o].name}님 ${books[i].name}가 대출되었습니다.")
//                L(people[o])
//                L(books[i])
//                break@myloop
//            }
//        }
//    }
//
//    if (!borrowedcheck) {
//        L("잘못된 입력값이 있습니다.")
//    }
//}

fun runProgram() {}
fun 대출하라책을() {}
fun 반납하라책을() {}
fun 검색해서출력하라책을() {}
//예제

// 아빠답안지
//    }
//        L("${it.name} -> ${it.borrowedBookImf}")
//    people.forEach {
//    L("----------사람마다빌린책------------------------")
//
//    }
//        L(it)
//    books.filter { it.borrowed }.forEach {
//    L("-----------대출중인책리스트확인-----------------------")
//
//    }
//        L("${it.name} -> ${it.borrowedBookImf}")
//    people.forEach {
//    L("----------사람마다빌린책------------------------")
//
//    borrowBook("003", "002")
//    borrowBook("001", "003")
//    L("----------대출실행------------------------")
//
//    }
//        people.find { p -> p.borrowedBookImf.contains(it) }?.borrowedBookImf?.remove(it)
//        it.borrowed=false
//        L(it)
//    books.filter { it.name.contains("Holm") }.forEach {
//    L("-----------Holm검색 후 반납-----------------------")
//
//    }
//        L("${it.name} -> ${it.borrowedBookImf}")
//    people.forEach {
//    L("----------사람마다빌린책------------------------")
//
//
//    borrowBook("001", "002")
//    borrowBook("001", "001")
//
//    borrowBook("001", "111")
//    borrowBook("111", "002")
//    L("----------대출실행------------------------")
//
//    }
//        L(it)
//    books.filter { it.borrowed }.forEach {
//    L("----------대출중------------------------")
//대출불가능일 때 -> false 리턴, 대출가능하면 true 리턴

//        L(it.name)
//    books.forEach {
//    }
//        L(i)
//    for( i in 1..books.size){

//fun returnBook(bookNumber: String) {
//    var loopValue = 0
//    for (i in 0 until people.size) {
//        if (bookNumber == people[i].borrowedBookImf) {
//            people[i].borrowedBookImf = "None"
//            books[i].borrowed = true
//            L("${people[i]}님 반납이 완료되었습니다.")
//        }
//    }
//    if (books[loopValue].borrowed != false) {
//        L("반납할 수 없는 책입니다.")
//    }
//
//}

