package com.practice.demo.repositories;

import com.practice.demo.pojos.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
