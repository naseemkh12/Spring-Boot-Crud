package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Books;
import com.example.demo.repository.BooksRepository;

@Service
public class BooksService {

	@Autowired
	BooksRepository booksRepository;

	public List<Books> getAllBooks() {
		List<Books> books = new ArrayList<Books>();
		booksRepository.findAll().forEach(books1 -> books.add(books1));
		return books;
	}

	public void saveOrUpdate(Books books) {
		booksRepository.save(books);
	}

	public Books getBooksById(Integer id) {
		return booksRepository.findById(id).get();

	}

	public void delete(Integer id) {
		booksRepository.deleteById(id);
	}
    
	public void update(Books books,Integer bookid) {
		booksRepository.save(books);
	}
}
