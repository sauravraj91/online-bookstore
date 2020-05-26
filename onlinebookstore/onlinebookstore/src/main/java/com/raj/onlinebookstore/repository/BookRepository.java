package com.raj.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.raj.onlinebookstore.entity.Book;

public interface BookRepository extends JpaRepository<Book,Long> {

}
