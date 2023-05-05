package com.dynamodb.service;

import com.dynamodb.model.LibraryCatalog;
import com.dynamodb.repository.LibraryCatalogRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class LibraryCatalogService {

    private final LibraryCatalogRepository libraryCatalogRepository;

    public void save(final LibraryCatalog libraryCatalog) {
        libraryCatalogRepository.saveLibraryCatalog(libraryCatalog);
    }

    public LibraryCatalog getLibraryCatalog(final String author, final String topic) {
        return libraryCatalogRepository.getLibraryCatalog(author, topic);
    }

    public void delete(final String author, final String topic) {
        libraryCatalogRepository.deleteLibraryCatalog(author, topic);
    }
}