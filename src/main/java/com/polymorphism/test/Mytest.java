package com.polymorphism.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContext;
import java.util.Random;

@Component
public class Mytest {
    public static void main(String[] args) {


        ServletContext sc = ContextLoader.getCurrentWebApplicationContext().getServletContext();
        ApplicationContext ac = WebApplicationContextUtils.getRequiredWebApplicationContext(sc);

        //ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        Fork bean = (Fork) ac.getBean("dog");
        //Fork bean = SpringUtils.getBean("dog");
        bean.print();

        Random r = new Random();
        int i = r.nextInt(2);
    }
}
