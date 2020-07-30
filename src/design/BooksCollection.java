package design;

import java.util.List;

public interface BooksCollection {
    void addBookToCatalog(BookData book);
    BookObject searchBook(String BookName);
    List<BookObject> getMostSoldBooksByAuthor(String author, int limit);
    List<BookObject> getMostSoldBooksByCategory(String category, int limit);


}
