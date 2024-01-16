package com.example.bookskart.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Set extends BaseModel{
    @ManyToMany
   private List<Books> books;
}
