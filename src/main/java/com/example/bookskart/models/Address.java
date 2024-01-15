package com.example.bookskart.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Address {
    @Id
    Long id;
    private String houseNo;
    private String locality;
    private String state;
    private String country;
    private Long pinCode;
    private String nearBy;
}
