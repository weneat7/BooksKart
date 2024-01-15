package com.example.bookskart.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class EwsStudents extends Students{
    Long registrationNumber;
}
