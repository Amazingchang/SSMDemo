package me.changjie.service;

import me.changjie.dao.BookDao;
import me.changjie.entity.Book;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Create by ChangJie on 2018/3/23
 */
@Service
public class BookService {

    @Resource
    private BookDao bookDao;


    public Book queryById(long id){
        return bookDao.queryById(id);
    }
}
