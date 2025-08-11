package ques12;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @PostMapping
    public ResponseEntity<String> addBook(@RequestBody Book book) {
        bookRepository.save(book);
        return ResponseEntity.ok("Book added.");
    }

    @GetMapping
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @GetMapping("/{bookid}")
    public Book getBookById(@PathVariable int bookid) {
        return bookRepository.findById(bookid);
    }

    @PutMapping("/{bookid}")
    public ResponseEntity<String> updateBook(
            @PathVariable int bookid,
            @RequestBody Book book) {
        book.setBookid(bookid);
        bookRepository.update(book);
        return ResponseEntity.ok("Book updated.");
    }

    @DeleteMapping("/{bookid}")
    public ResponseEntity<String> deleteBook(@PathVariable int bookid) {
        bookRepository.deleteById(bookid);
        return ResponseEntity.ok("Book deleted.");
    }
}
