package com.example.couchbase.repository;

import com.example.couchbase.model.Book;
import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CouchbaseRepository<Book, String> {
}
