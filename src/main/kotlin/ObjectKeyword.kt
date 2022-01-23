data class Book (var name: String, var price: Int)

object Books{
//    object class provide the single instance like singleTone
    var books = arrayListOf<Book>()

    fun displayBook(){
        for (i in books){
            println(i)
        }
    }
}

fun main(args: Array<String>) {

    Books.books.add(Book(name = "Sun Java", price = 50))
    Books.books.add(Book(name = "Machine Learning", price = 50))
    Books.books.add(Book(name = "Sun Java", price = 50))
    Books.books.add(Book(name = "Sun Java", price = 50))

    Books.displayBook() 
}
