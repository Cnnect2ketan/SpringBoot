package com.learning.SpringBoot.repositories;

import com.learning.SpringBoot.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long> {
}
