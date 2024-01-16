package com.example.bookskart.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Entity
public class Class extends BaseModel {
    @ManyToOne
    private Set set;
    @ManyToMany
    List<SubjectPublisher> subjectPublishers;
    @OneToMany
    List<Students> studentsList;
}
