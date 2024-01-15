package com.example.bookskart.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Setter
@Getter
public class Publisher extends BaseModel{
    private Long phoneNumber;
    @ManyToMany
    private List<Subject> subjects;
    @OneToOne
    private Address address;
}
