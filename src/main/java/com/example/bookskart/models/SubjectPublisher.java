package com.example.bookskart.models;

import jakarta.persistence.ManyToOne;

public class SubjectPublisher extends  BaseModel {
    @ManyToOne
    private Subject subject;
    @ManyToOne
    private Publisher publisher;


}
