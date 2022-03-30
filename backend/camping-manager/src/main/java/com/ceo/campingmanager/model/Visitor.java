package com.ceo.campingmanager.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.time.LocalDateTime;

enum Gender {
    Male,
    Female,
    UnKnown
}

@Entity
@Table(name = "visitors")
public class Visitor {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "IDENTITY")
    private String identity;


    @Enumerated(EnumType.STRING)
    @Column(name = "GENDER")
    private Gender gender;

    @Column(name = "REGISTRATIONTIME")
    private LocalDateTime registrationTime;

    public Visitor() {
    }

    public Visitor(@JsonProperty("id") int id,
                   @JsonProperty("name") String name,
                   @JsonProperty("identity") String identity,
                   @JsonProperty("gender") Gender gender,
                   @JsonProperty("registrationTime") LocalDateTime registrationTime
    ) {
        this.id = id;
        this.name = name;
        this.identity = identity;
        this.gender = gender;
        this.registrationTime = registrationTime;
    }

    public String getIdentity() {
        return identity;
    }

    public Gender getGender() {
        return gender;
    }

    public LocalDateTime getRegistrationTime() {
        return registrationTime;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
