package com.synechron.service;

import java.util.List;

import com.synechron.model.Document;

public interface DocService {

	List<Document> findAllDocs(Long id);

}
