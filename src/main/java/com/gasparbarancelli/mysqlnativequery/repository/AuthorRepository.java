package com.gasparbarancelli.mysqlnativequery.repository;

import com.gasparbarancelli.mysqlnativequery.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
