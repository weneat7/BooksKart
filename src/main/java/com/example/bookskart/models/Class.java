package com.example.bookskart.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Entity
public class Class extends BaseModel {
    @ManyToMany
    List<Subject> subjectList;
    @OneToMany
    List<Students> studentsList;
}
