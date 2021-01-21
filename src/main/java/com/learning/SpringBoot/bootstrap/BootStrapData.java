package com.learning.SpringBoot.bootstrap;

import com.learning.SpringBoot.model.Address;
import com.learning.SpringBoot.model.Publisher;
import com.learning.SpringBoot.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final PublisherRepository publisherRepository;

    public BootStrapData(PublisherRepository publisherRepository) {
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Address address = new Address("AddressLine1","bangalore","karnataka", 560076);
        Publisher publisher = new Publisher("Ketan",address);
        publisherRepository.save(publisher);

        System.out.println("No of Publisher Initialized");
        System.out.println("Count:" + publisherRepository.count());
    }
}
