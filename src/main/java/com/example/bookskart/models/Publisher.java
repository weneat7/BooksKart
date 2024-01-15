package com.example.bookskart.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Setter
@Getter
public class Publisher extends BaseModel{
    private Long phoneNumber;
    private List<Books> books;
    private Address address;
}
