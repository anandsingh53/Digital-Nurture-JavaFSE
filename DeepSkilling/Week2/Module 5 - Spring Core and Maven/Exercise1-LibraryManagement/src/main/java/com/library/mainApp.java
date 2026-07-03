package com.library.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.library.repository.BookRepository;
import com.library.service.BookService;

public class MainApp {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("   Library Management Application");
        System.out.println("======================================");

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        BookService service =
                context.getBean("bookService", BookService.class);

        BookRepository repository =
                context.getBean("bookRepository", BookRepository.class);

        service.serviceInfo();
        repository.repositoryInfo();

        System.out.println("--------------------------------------");
        System.out.println("Application executed successfully.");
        System.out.println("--------------------------------------");

        // Close the Spring container
        context.close();
    }
}