package com.zjut.study.spring.di;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@ComponentScan("com.zjut.study.spring")
@ImportResource("classpath:spring.xml")
public class Client {

    @Test
    public void testDi1() {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Client.class);
        A a = (A) annotationConfigApplicationContext.getBean("a");
        B b = (B) annotationConfigApplicationContext.getBean("b");
        System.out.println("输出:" + a +" " + b);
    }

}
