class Librarys{
    String [] books;
    int no_of_books;
    Librarys(){
        this.books = new String[100];
        this.no_of_books = 0 ;
    }
    void addBook(String book){
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book+" has been added");
    }
    void ShowAvailableBooks(){
        System.out.println("available books");
        for (String book:this.books) {
            if(book == null){
                continue;
            }
            System.out.println("---->  "+book);
        }
    }
    void issueBook(String book){
        for (int i = 0; i < this.books.length; i++) {
            if(this.books[i].equals(book)){
                System.out.println("the book has been issued..");
                this.books[i]=null;
                return;
            }
        }
        System.out.println("This book does not exist in library");
    }
    void returnBook(String book){
        addBook(book);
    }
}
public class library {
    public static void main(String[] args) {
        Librarys l = new Librarys();
        l.addBook("c++");
        l.addBook("c");
        l.addBook("java");
        l.ShowAvailableBooks();

        l.issueBook("java");
        l.ShowAvailableBooks();
        l.issueBook("c");
        l.ShowAvailableBooks();

    }
}
