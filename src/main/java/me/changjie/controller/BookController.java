package me.changjie.controller;

import me.changjie.entity.Book;
import me.changjie.service.BookService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Create by ChangJie on 2018/3/23
 */
@RestController
public class BookController {

    @Resource
    private BookService bookService;


    @RequestMapping(value = "/get/{id}")
    public Book queryById(@PathVariable(value = "id") long id){
        return bookService.queryById(id);
    }
}
