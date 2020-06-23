package com.practice.demo.bootstrap;

import com.practice.demo.repositories.AuthorRepository;
import com.practice.demo.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {
    private final AuthorRepository authorRepo;
    private final BookRepository bookRepo;

    public BootStrapData(AuthorRepository authorRepo, BookRepository bookRepo) {
        this.authorRepo = authorRepo;
        this.bookRepo = bookRepo;
    }

    @Override
    public void run(String... args) throws Exception {

        
    }
}
