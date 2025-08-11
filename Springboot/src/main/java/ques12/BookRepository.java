package ques12;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int save(Book book) {
        String sql = "INSERT INTO books (bookid, bookname, author, price) VALUES (?, ?, ?, ?)";
        return jdbcTemplate.update(sql, book.getBookid(), book.getBookname(), book.getAuthor(), book.getPrice());
    }

    public List<Book> findAll() {
        String sql = "SELECT * FROM books";
        return jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Book.class));
    }

    public Book findById(int bookid) {
        String sql = "SELECT * FROM books WHERE bookid = ?";
        return jdbcTemplate.queryForObject(sql, BeanPropertyRowMapper.newInstance(Book.class), bookid);
    }

    public int update(Book book) {
        String sql = "UPDATE books SET bookname = ?, author = ?, price = ? WHERE bookid = ?";
        return jdbcTemplate.update(sql, book.getBookname(), book.getAuthor(), book.getPrice(), book.getBookid());
    }

    public int deleteById(int bookid) {
        String sql = "DELETE FROM books WHERE bookid = ?";
        return jdbcTemplate.update(sql, bookid);
    }
}
