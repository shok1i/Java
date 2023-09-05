package Work_2.Number_7_REW;

import java.util.ArrayList;

public class Bookshelf extends Book {
    private ArrayList <Book> BookShelf = new ArrayList<>();
    private int BookCount = 0;

    public void setBookCount() { BookCount = BookShelf.size(); }

    public void addBook (Book bookInfo){
        BookShelf.add(bookInfo);
        setBookCount();
    }

    public Book miYear(){
        Book mi = this;

        for (Book elem : BookShelf) if (mi.getWritingYear() > elem.getWritingYear()) mi = elem;

        return mi;
    }

    public String ToString (){
        StringBuilder tmp = new StringBuilder();

        for (Book SingleBook : BookShelf)
            SingleBook.ToString();

        return tmp.toString();
    }
}
