package com.mshr.Rate.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Rate {

	@Id
	private Integer Id;
	private Integer bookId;
	private Integer stars;

	public Rate() {

	}

	public Rate(Integer id, Integer bookId, Integer stars) {

		this.Id = id;
		this.bookId = bookId;
		this.stars = stars;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public Integer getStars() {
		return stars;
	}

	public void setStars(Integer stars) {
		this.stars = stars;
	}

}
