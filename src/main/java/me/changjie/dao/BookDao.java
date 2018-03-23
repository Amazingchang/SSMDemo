package me.changjie.dao;

import me.changjie.entity.Book;

/**
 * Create by ChangJie on 2018/3/23
 */
public interface BookDao {

    /**
     * 通过ID查询单本图书
     *
     * @param id
     * @return
     */
    Book queryById(long id);

}
