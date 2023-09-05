package Work_2.Number_7_REW;

public class BookTest {
    public static void main(String[] args) {
        Book singleBook = new Book("A", "B", "P", 0);

        // Методы для проверки работоспособности методов Book
        singleBook.setBookName("SomeBook");
        singleBook.setAuthorName("SomeAuthor");
        singleBook.setWritingYear(2023);
        singleBook.setPublisherName("SomePublisher");
        System.out.println(singleBook.ToString());

        System.out.println("\nКниги на полке");
        Bookshelf BookShelf = new Bookshelf();
        BookShelf.addBook(singleBook);

        for (int i = 0; i < 10; i++){
            Book tmp = new Book("A" + i, "B" + i, "P" + i, (int) (Math.random() * 10000) % 2024);
            BookShelf.addBook(tmp);
        }
        System.out.print(BookShelf.ToString() + "\n\n");

        System.out.println(BookShelf.miYear().ToString());

    }
}
