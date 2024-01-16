package com.example.bookskart.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ListIndexBase;

import java.util.List;

@Entity
@Setter
@Getter
public class Students extends BaseModel{
    @ManyToOne
    private Class aClass;
    @ManyToOne
    private School school;
    @ManyToOne
    private Set set;

}
