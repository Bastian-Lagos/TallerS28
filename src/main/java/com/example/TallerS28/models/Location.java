package com.example.TallerS28.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long dimension;
    private String type;
    private String name;
    private String residents_length;
    private String url;

    @OneToMany(mappedBy = "location")
    private Characters character;
}
