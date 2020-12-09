package ru.grandstep.school.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
import ru.grandstep.school.model.Book;
import ru.grandstep.school.service.BookService;


@Controller
@RequestMapping("books")
@RequiredArgsConstructor
public class BookController {
    private final BookService bookService;

    @GetMapping("/list")
    public ModelAndView listOfBooks(){
        return new ModelAndView("book/list", "books", bookService.getAll());
    }

    @GetMapping({"/form", "/form/{id}"})
    public ModelAndView editBook(@PathVariable(required = false) Integer id){
        Book book = id == null ? new Book() : bookService.getById(id);
        return new ModelAndView("book/form", "book", book);
    }

    @PostMapping("/save")
    public RedirectView saveBook(@ModelAttribute Book book){
        bookService.saveOrUpdate(book);
        return new RedirectView("list");
    }
}
