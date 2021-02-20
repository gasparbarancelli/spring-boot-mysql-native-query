package com.gasparbarancelli.mysqlnativequery.repository;

import com.gasparbarancelli.mysqlnativequery.entity.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagRepository extends JpaRepository<Tag, Long> {
}
