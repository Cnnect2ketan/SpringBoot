package com.learning.SpringBoot.bootstrap;

import com.learning.SpringBoot.model.Address;
import com.learning.SpringBoot.model.Author;
import com.learning.SpringBoot.model.Book;
import com.learning.SpringBoot.model.Publisher;
import com.learning.SpringBoot.repositories.AuthorRepository;
import com.learning.SpringBoot.repositories.BookRepository;
import com.learning.SpringBoot.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final PublisherRepository publisherRepository;

    private final AuthorRepository authorRepository;

    private final BookRepository bookRepository;

    public BootStrapData(PublisherRepository publisherRepository, AuthorRepository authorRepository, BookRepository bookRepository) {
        this.publisherRepository = publisherRepository;
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Address address = new Address("AddressLine1","bangalore","karnataka", 560076);
        Publisher publisher = new Publisher("Ketan",address);
        publisherRepository.save(publisher);

        System.out.println("No of Publisher Initialized");
        System.out.println("Count:" + publisherRepository.count());

        Book book1 = new Book("Book1", 111111L);
        Book book2 = new Book("Book2",222222L);
        Author author1 = new Author("Author1","Secondname1");
        Author author2 = new Author("Author2","Secondname2");

        book1.getAuthors().add(author1);
        //book1.getAuthors().add(author2);
        bookRepository.save(book1);

        book2.getAuthors().add(author2);
        bookRepository.save(book2);

        author1.getBooks().add(book1);
        //author1.getBooks().add(book2);
        authorRepository.save(author1);

        author2.getBooks().add(book2);
        authorRepository.save(author2);


    }
}
