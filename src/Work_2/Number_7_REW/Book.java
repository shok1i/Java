package Work_2.Number_7_REW;

public class Book {
    private String AuthorName, BookName, PublisherName;
    private int WritingYear;

    Book(String authorName, String bookName, String publisherName, int writingYear){
        AuthorName = authorName;
        BookName = bookName;
        PublisherName = publisherName;
        WritingYear = writingYear;
    }

    public Book() {
    }

    public void setAuthorName(String authorName) { AuthorName = authorName; }
    public void setBookName(String bookName) { BookName = bookName; }
    public void setWritingYear(int writingYear) { WritingYear = writingYear; }
    public void setPublisherName(String publisherName) { PublisherName = publisherName; }
    public int getWritingYear() { return WritingYear; }
    public String getAuthorName() { return AuthorName; }
    public String getBookName() { return BookName; }
    public String getPublisherName() { return PublisherName; }
    public String ToString (){
        return "Имя автора:\t\t\t" + AuthorName + "\nНазвание книги:\t\t" + BookName + "\nГод написания:\t\t" + WritingYear + "\nИмя издателя:\t\t" + PublisherName;
    }
}
