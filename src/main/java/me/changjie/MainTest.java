package me.changjie;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainTest {

    private static Logger log = LoggerFactory.getLogger(MainTest.class);

    /**
     * root和logger(category)是父子关系
     * logger节点存在时会覆盖root节点
     * 当logger节点不存在时会使用root节点配置
     * @param args
     */
    public static void main(String[] args) {
        log.debug("1111111");

        log.info("22222222");

        log.error("3333333");

        System.out.println(1111);
    }
}
