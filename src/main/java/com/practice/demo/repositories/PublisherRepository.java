package com.practice.demo.repositories;

import com.practice.demo.pojos.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
