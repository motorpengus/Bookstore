package hh.backend.bookstore.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import hh.backend.bookstore.domain.Book;

@Controller
public class BookController {
    @GetMapping("/index")
    public String welcomePage(Model model){
        model.addAttribute("books", new Book());
        return "welcomepage";
    }
}
