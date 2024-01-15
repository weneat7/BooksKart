package com.example.bookskart.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class SubjectPublisher extends  BaseModel {
    @ManyToOne
    private Subject subject;
    @ManyToOne
    private Publisher publisher;


}
