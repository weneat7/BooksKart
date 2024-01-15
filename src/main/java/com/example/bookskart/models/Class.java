package com.example.bookskart.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Entity
public class Class extends BaseModel {
    List<Subject> subjectList;
    List<Students> studentsList;
}
