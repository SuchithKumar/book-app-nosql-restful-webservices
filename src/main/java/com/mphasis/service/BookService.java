package com.mphasis.service;

import java.util.List;
import java.util.Optional;

import com.mphasis.domain.Book;

public interface BookService {

	public Optional<Book> findByBookId(String id);
	
	public List<Book> findByBookTitle(String title);
	
	public List<Book> findAll();
	
	public Book save(Book book);
}
