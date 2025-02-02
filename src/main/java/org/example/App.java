package org.example;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        //creating IoC container
        ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
        Dev dev=context.getBean(Dev.class);
        dev.build();
        Laptop laptop=context.getBean(Laptop.class);
        laptop.compile();
        System.out.println( "Hello World!" );
    }
}
