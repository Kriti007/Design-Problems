package design;

public class BookData {
    private final String name, author, publisher, category,price, year, count;


    public BookData(String name, String publisher, String category, String price, String year, String count ){

        this.name = name;
        this.publisher = publisher;
        this.category = category;
        this.price = price;
        this.year = year;
        this.count = count;

    }
    protected String getAuthor(){
        if(name == null)
            throw new IllegalArgumentException();
        return this.author;
    }
    public String getPublisher(){
        if(name == null)
            throw new IllegalArgumentException();
        return this.publisher;
    }
    public String getCategory(){
        if(name == null)
            throw new IllegalArgumentException();
        return this.author;
    }
    public String getPrice(){
        if(name == null)
            throw new IllegalArgumentException();
        return this.author;
    }
    public String getCategory(String name){
        if(name == null)
            throw new IllegalArgumentException();
        return this.author;
    }
    public String getCategory(String name){
        if(name == null)
            throw new IllegalArgumentException();
        return this.author;
    }
}
