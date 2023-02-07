package com.java.spring5;

/**
 * @author zhang
 * @className: Book
 * @description:
 * @date: 2021-07-12 16:11
 * @since JDK 13
 */
public class Book {

    private String bname;
    private String bauthor;

    public void setBname(String bname) {
        this.bname = bname;
    }

    public void setBauthor(String bauthor) {
        this.bauthor = bauthor;
    }

    public void outPut(){
        System.out.println("bname ::" + bname);
        System.out.println("bauthor ::" + bauthor);
    }
}