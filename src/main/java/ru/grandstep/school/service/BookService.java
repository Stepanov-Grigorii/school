package ru.grandstep.school.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.grandstep.school.model.Book;
import ru.grandstep.school.repository.BookRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {
    private final BookRepository bookRepository;

    public Book getById(Integer id) {
        if (id == null || id <= 0) {
            throw new RuntimeException("Wrong id");
        }
        return bookRepository.getById(id);
    }

    public List<Book> getAll() {
        return bookRepository.getAll();
    }

    public Book saveOrUpdate(Book book){
        return bookRepository.saveOrUpdate(book);
    }
}
