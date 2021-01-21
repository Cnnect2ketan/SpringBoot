package com.learning.SpringBoot.repositories;

import com.learning.SpringBoot.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher,Integer> {

}
