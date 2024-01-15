package com.example.bookskart.models;

import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

public class BooksPublisherMapping extends  BaseModel {
    @ManyToMany
    private Books books;
    @ManyToOne
    private Publisher publisher;

}
