package design;

import java.util.LinkedList;
import java.util.List;

public class Catajloguing implements BooksCollection<BookObject> {
    List<BookData> catalogue = new LinkedList<>(); //should have been trie

    @Override
    public void addBookToCatalog(BookData book){
        if(book == null)
            throw new NullPointerException();
        BookObject NewBook = new BookObject(book) ;
        this.catalogue.add(NewBook); //add in author/category  based map and trie
    }

    @Override
    public BookObject searchBook(String BookName){
        if(BookName == null)
            throw new IllegalArgumentException();
        //trie implementation

        return SearchedBook;
    }

    @Override
    public List<BookObject> getMostSoldBooksByAuthor(String author, int limit){
        List<BookObject> mostSoldBooks = new LinkedList<>();
        //return books of which atleast limit qty is sold
        for(int i = 0; i < this.catalogue.size(); i++){
            if(Integer.parseInt(this.catalogue.get(i).count) >= limit)
                mostSoldBooks.add(this.catalogue.get(i));
        }
       return  mostSoldBooks;
    }
}
