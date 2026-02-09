public class Library {

    private Book[] books;
    private int count;

    public Library(int capacity) {
        books = new Book[capacity];
        count = 0;
    }

    // TODO: Add book to array
    public void addBook(Book book) {
        if (count < books.length){
            books[count]=book;
            count++;}
        else{
            System.out.println("full");}
    }

    // TODO: Display all books
    public void displayBooks() {
        for(int i = 0 ; i<count;i++){
            System.out.println(books[i]);}}


    // TODO: Search book by title
    public Book searchByTitle(String title) {
        for (int i = 0; i<count; i++){
            if (books[i].getTitle().equals(title)){
                return books[i];
            }
        }
        return null;
    }

    // TODO: Borrow book by title
    public void borrowBook(String title) {
        Book b=searchByTitle(title);

        if (b==null){
            System.out.println("book not found");}
        else if (!b.isAvailable()){
            System.out.println("is already borrowed");}
        else {
            System.out.println("borrowed ");}
    }

    // TODO: Return book by title
    public void returnBook(String title) {
        Book b=searchByTitle(title);
        if (b == null) {
            System.out.println("Book not found");
        } else if (!b.isAvailable()) {
            System.out.println("Book was not borrowed");
        } else {
            b.returnBook();
            System.out.println("Book returned successfully");}

    }
}
