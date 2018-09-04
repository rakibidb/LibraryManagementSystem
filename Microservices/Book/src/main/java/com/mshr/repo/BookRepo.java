package com.mshr.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.mshr.model.Book;

@RepositoryRestResource
@CrossOrigin("*")
public interface BookRepo extends JpaRepository<Book, Integer> {

	@Override
	Book save(Book book);

	Book findByTitle(@Param("title") String title);

	Book findByAuthor(@Param("author") String author);

}
