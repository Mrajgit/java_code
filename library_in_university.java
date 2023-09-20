import java.util.ArrayList;
class Book{
    public String name, author;
    public Book(String name,String author) {
        this.name = name;
        this.author = author;
    }
public String toString(){
    return "Book{"+"name = ' "+name +'\''+", author =' "+author +'\''+'}';
}
}
class MyLibrary{
    public ArrayList<Book> books;
    public MyLibrary(ArrayList<Book> books){
        this.books = books;
    }
    public void addBook(Book book){
        System.out.println("the book has been added to the library");
        this.books.add(book);
    }
    public void issueBook(Book book, String issued_to){
        System.out.println("this book has been issued from the library to : "+issued_to);
        this.books.remove(book);
    }
    public void returnBook(Book b){
        System.out.println("the book has been returned ");
        this.books.add(b);
    }
}
public class library_in_university {
    public static void main(String[] args) {
        ArrayList<Book> bk = new ArrayList<>();
        Book b1 = new Book("csdfafasf","yashwant kanetkar");
        bk.add(b1);
        Book b2 = new Book("c++","yashwant kanetkar");
        bk.add(b2);

        Book b3 = new Book("java","Orical");
        bk.add(b3);

        Book b4 = new Book("python","google");
        bk.add(b4);

        MyLibrary l = new MyLibrary(bk);
        l.addBook(new Book("algorithm","corman"));
        System.out.println(l.books);
        l.issueBook(b3,"raj");
        System.out.println(l.books);

    }
}



