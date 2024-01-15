package com.example.bookskart.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Books extends BaseModel{
    @ManyToOne
    private SubjectPublisher subjectPublisher;

    @Enumerated(value = EnumType.ORDINAL)
    private BookPart bookPart;

    private Double price;
}

//    1   ->   Many
//  Book  :  Publisher
//  Many   <-   1

//      1   ->  1
//   Book   ->   Subject
//      M   <-   1