package design;

import java.awt.print.Book;
import java.util.Map;

public  class BookObject{
    protected Map<String, String> attributeMap ;

    protected BookObject(final BookData data){
        this.attributeMap.put("name", data.name );
        this.attributeMap.put("author", data.author );
        this.attributeMap.put("publisher", data.publisher );
        this.attributeMap.put("price", data.price );
        this.attributeMap.put("count", data.count );
        this.attributeMap.put("year", data.year );

    }
}
