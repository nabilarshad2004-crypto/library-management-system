package com.nabil.library.controller;

import com.nabil.library.service.BookService;
import com.nabil.library.entity.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class BookController {

    private final BookService service;

    public BookController(BookService service) {
        this.service = service;
    }

    @GetMapping("/books")
    public String list(Model model) {
        model.addAttribute("books", service.getAll());
        return "list";
    }

    @GetMapping("/add")
    public String form(Model model) {
        model.addAttribute("book", new Book());
        return "form";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute Book book) {
        service.save(book);
        return "redirect:/books";
    }
}
