package com.example.bookskart.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class School extends BaseModel{
    @ManyToMany
    private List<Class> classes;

    private Long phoneNumber;
    @OneToOne
    private Address address;

    @Enumerated(value = EnumType.ORDINAL)
    private SchoolType schoolType;
}
