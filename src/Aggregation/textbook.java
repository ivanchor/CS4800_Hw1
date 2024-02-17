package Aggregation;

public class textbook
{

    private String bookTitle;
    private String author;
    private String publisher;

    public textbook(){};

    public textbook(String bookTitle, String author, String publisher)
    {
        this.bookTitle = bookTitle;
        this.author = author;
        this.publisher = publisher;
    }

    public String toString()
    {
        return ("TextBook: " + bookTitle + ", " + author + ", " + publisher);
    }

    public String getBookTitle()
    {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle)
    {
        this.bookTitle = bookTitle;
    }

    public String getAuthor()
    {
        return author;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    public String getPublisher()
    {
        return publisher;
    }

    public void setPublisher(String publisher)
    {
        this.publisher = publisher;
    }
}
