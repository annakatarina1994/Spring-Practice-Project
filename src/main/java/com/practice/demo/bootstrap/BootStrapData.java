package com.practice.demo.bootstrap;

import com.practice.demo.pojos.Author;
import com.practice.demo.pojos.Book;
import com.practice.demo.pojos.Publisher;
import com.practice.demo.repositories.AuthorRepository;
import com.practice.demo.repositories.BookRepository;
import com.practice.demo.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {
    private final AuthorRepository authorRepo;
    private final BookRepository bookRepo;
    private final PublisherRepository publisherRepo;

    public BootStrapData(AuthorRepository authorRepo, BookRepository bookRepo, PublisherRepository publisherRepo) {
        this.authorRepo = authorRepo;
        this.bookRepo = bookRepo;
        this.publisherRepo = publisherRepo;
    }

    @Override
    public void run(String... args) throws Exception {

        Author author1 = new Author("Eric", "Evans");
        Book book1 = new Book("Domain Driven Design", "123123");
        author1.getBooks().add(book1);
        book1.getAuthors().add(author1);
        authorRepo.save(author1);
        bookRepo.save(book1);

        Author author2 = new Author("Rodd", "Johnson");
        Book book2 = new Book("J2EE", "321321");
        author2.getBooks().add(book2);
        book2.getAuthors().add(author2);
        authorRepo.save(author2);
        bookRepo.save(book2);

        Publisher publisher1 = new Publisher();
        publisher1.setName("Publishing Company");
        publisher1.setCity("Boston");
        publisher1.setState("MA");
        publisherRepo.save(publisher1);

        System.out.println("Publisher Count: " + publisherRepo.count());

        book1.setPublisher(publisher1);
        publisher1.getBooks().add(book1);


        System.out.println("Started with BootStrap");
        System.out.println("Number of books: " + bookRepo.count());
        System.out.println("Publisher Number of Books: " + publisher1.getBooks().size());
    }
}
