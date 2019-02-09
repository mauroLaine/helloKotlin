import java.util.*

fun main(args: Array<String>) {

    var book = Book("Dorian Gray", "Oscar Wild", 1992)
    val info = book.bookInfo()
    println("Here is your book ${info.first} written by ${info.second}.")
    book.printUrl()
    println(book.getWeight())
    val monkey = Monkey()
    while (book.pages > 0 ){
        monkey.playWithBook(book)
        println(book.pages)
    }

    var ebook = eBook("Bad Blood", "John Carreyrou", 2016, "PDF")
    ebook.readPage()
    val (title, author, year) = ebook.eBookInfo()
    println("Here is your book $title written by $author in $year.")
}

open class Book(val title: String, val author: String, val year: Int, var pages: Int = 200) {
    companion object {
        const val MAX_BOOK = 3
        const val BASE_URL = "www.lemurbooks.com/books/"
    }

    //    object Constants {
//        const val BASE_URL = "www.lemurbooks.com/books/"
//    }
    var borrowedBooks = 0
    var currentPage = 1

    open fun readPage() {
        currentPage++
    }

    fun bookInfo(): Pair<String, String> {
        return title to author
    }

    fun canBorrow(): Boolean {
        return (borrowedBooks < MAX_BOOK)
    }

    fun printUrl() {
        val editedTitle = title.replace(" ", "_")
        println("$BASE_URL$editedTitle.html")
    }

    override fun toString(): String {
        return "Book(title='$title', author='$author', year=$year, currentPage=$currentPage)"
    }
}

fun Book.getWeight(): Double = pages * 1.5
fun Book.tornPages(tornPages: Int) {
    if (pages - tornPages > 0) pages -= tornPages
    else pages = 0
}

class eBook(title: String, author: String, year: Int, var format: String = "text") : Book(title, author, year) {

    private var wordsRead = 0
    override fun readPage() {
        wordsRead += 250
    }

    fun eBookInfo(): Triple<String, String, Int> {
        return Triple(title, author, year)
    }

    override fun toString(): String {
        return "eBook(title='$title', author='$author', format='$format', year=$year, wordsRead=$wordsRead)"
    }
}

class Monkey(val name:String = "Donkey Kong") {
    fun playWithBook(book: Book){
        book.tornPages(Random().nextInt(60))
    }
}
