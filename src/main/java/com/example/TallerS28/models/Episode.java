package com.example.TallerS28.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.Data;

@Entity
@Data
public class Episode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String air_date;
    private String episode;
    private String characters;
    private String created;
    private String name;
    private String url;

    @ManyToMany
    @JoinTable(
        name = "character_episode",
        joinColumns = @JoinColumn(name="episode_id"),
        inverseJoinColumns = @JoinColumn(name = "character_id")
    )
    private List<Characters> character_id;
}
