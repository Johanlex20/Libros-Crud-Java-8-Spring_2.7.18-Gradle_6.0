package com.library.demo.service.iService;
import com.library.demo.model.Author;
import com.library.demo.model.Book;
import java.math.BigDecimal;
import java.util.List;

public interface iBookService{

    Book createBook(Book book);
   /* Book getBookById(Long id) throws RuntimeException;
    List<Book> findBooksByTitle(String titlePart);
    List<Book> findBooksByPriceRange(BigDecimal min, BigDecimal max);
    List<Book> findBooksByAuthor(String author);
    List<Book> getAllBooksSortedByPublicationDate();
    void deleteBook(Long id);
*/
}