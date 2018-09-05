package com.mshr.Rate.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.mshr.Rate.model.Rate;

@RepositoryRestResource
@CrossOrigin("*")
public interface RateRepo extends JpaRepository<Rate, Integer> {

	@Override
	Rate save(Rate rate);

	@Override
	void delete(Integer id);

	void deleteByBookId(Integer bookId);

	Rate findByBookId(@Param("bookId") Integer bookId);

	List<Rate> findByStars(@Param("stars") Integer stars);

}
