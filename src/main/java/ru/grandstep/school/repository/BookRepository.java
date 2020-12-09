package ru.grandstep.school.repository;

import lombok.RequiredArgsConstructor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;
import ru.grandstep.school.model.Book;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class BookRepository {
    private final SessionFactory sessionFactory;

    public Book getById(Integer id){
        try(Session session = sessionFactory.openSession()){
            return session.get(Book.class, id);
        }
    }

    public List<Book> getAll() {
        try (Session session = sessionFactory.openSession()) {
            return session.createQuery("FROM Book", Book.class).list();
        }
    }

    public Book saveOrUpdate(Book book){
        try(Session session = sessionFactory.openSession()){
            Transaction transaction = session.beginTransaction();
            session.save(book);
            transaction.commit();
            return book;
        }
    }
}