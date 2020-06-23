package com.practice.demo.repositories;

import com.practice.demo.pojos.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
