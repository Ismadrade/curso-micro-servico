package br.com.ismadrade.controller;

import br.com.ismadrade.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("book-service")
public class BookController {

    //http://localhost:8000/book-service/1/BRL

    @Autowired
    private Environment enviroment;

    @GetMapping(value = "/{id}/{currency}")
    public Book findBook(@PathVariable("id") Long id,
                         @PathVariable("currency") String currency){

        var port = enviroment.getProperty("local.server.port");
        return new Book(1L, "Nigel Poulton", "Docker Deep Dive", new Date(), Double.valueOf(13.7), currency, port);
    }

}
