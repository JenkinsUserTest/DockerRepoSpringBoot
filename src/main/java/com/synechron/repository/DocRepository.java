package com.synechron.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.synechron.model.Document;

public interface DocRepository extends JpaRepository<Document, Long> {
	public static final String FIND_USER_DOCS = "SELECT * FROM tbl_doc where user_id=?";

	@Query(value = FIND_USER_DOCS, nativeQuery = true)
	public List<Document> findUserDocs(long userId);
}
