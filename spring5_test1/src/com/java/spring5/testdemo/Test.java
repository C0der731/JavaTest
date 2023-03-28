package com.java.spring5.testdemo;
import com.java.spring5.Book;
import com.java.spring5.Orders;
import org.junit.Test;
import com.java.spring5.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring5 {

    @Test
    public void testAdd(){
        //1.加载Spring的配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        //2.获取配置创建的对象
        User user = (User) context.getBean("user");

        System.out.println(user);
        user.add();
    }

    @Test
    public void testBook(){
        //1.加载Spring的配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        //2.获取配置创建的对象
        Book book = (Book) context.getBean("book");

        System.out.println(book);
        book.outPut();
    }

    @Test
    public void testOrder(){
        //1.加载Spring的配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        //2.获取配置创建的对象
        Orders orders = (Orders) context.getBean("order");

        System.out.println(orders);
        orders.outPut();
    }
}
