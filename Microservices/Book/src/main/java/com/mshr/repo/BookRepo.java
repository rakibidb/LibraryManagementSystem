package com.mshr.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.mshr.model.Book;

@RepositoryRestResource
@CrossOrigin
public interface BookRepo extends JpaRepository<Book, Integer> {

}
