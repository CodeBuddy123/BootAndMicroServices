package com.ashsoft.respository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashsoft.entity.BookEntity;

public interface BookRepository  extends JpaRepository<BookEntity, Serializable>{
	
	
}
