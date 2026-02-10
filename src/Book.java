public class Book {

    // TODO: make fields private
    private String title;
    private String author;
    private int year;
    private boolean isAvailable;

    // TODO: Implement parameterized constructor
    public Book(String title, String author, int year) {
        this.title=title;
        this.author=author;
        this.year=year;
        this.isAvailable=true;
    }

    // TODO: Implement copy constructor
    public Book(Book other) {
        this.title=other.title;
        this.author=other.author;
        this.year=other.year;
        this.isAvailable=other.isAvailable;

    }

    // TODO: Implement getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    // TODO: Implement borrow logic
    public void borrowBook() {
        this.isAvailable=false;
    }

    // TODO: Implement return logic
    public void returnBook() {
        this.isAvailable=true;
    }

    // TODO: Override toString()
    @Override
    public String toString() {
        return ("Title : "+this.title+" , Author : "+this.author+" , Year : "+this.year+" , is available : "+this.isAvailable);
    }

    // TODO: Override equals()
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;


        Book other = (Book) obj;
        return year == other.year &&
                title.equals(other.title) &&
                author.equals(other.author);
    }
}
