package com.gasparbarancelli.mysqlnativequery.repository;

import com.gasparbarancelli.mysqlnativequery.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
