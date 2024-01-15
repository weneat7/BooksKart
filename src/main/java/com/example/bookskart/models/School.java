package com.example.bookskart.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class School extends BaseModel{
    private List<Class> classes;
    private Long phoneNumber;
    private Address address;
    private SchoolType schoolType;
}
