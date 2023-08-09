package system.services.interfaces;

import system.models.dto.AuthorDto;
import system.models.dto.BookDto;

import java.util.List;

public interface BookService {
    List<BookDto> getAllBooks();
    BookDto getBookById(long id);
    AuthorDto getAuthorByBookId(long id);
    List<BookDto> getBooksByBook(long id);
    BookDto createBook(long id, BookDto bookDto);
    BookDto updateBook(long id, BookDto bookDto);
    BookDto deleteBook(long id);
}
