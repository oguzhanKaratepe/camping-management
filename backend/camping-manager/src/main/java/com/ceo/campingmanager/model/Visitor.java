package com.ceo.campingmanager.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.time.LocalDate;
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
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "identity")
    private String identity;


    @Enumerated(EnumType.STRING)
    @Column(name = "gender")
    private Gender gender;

    @Column(name = "checkin")
    private LocalDateTime checkInTime;

    @Column(name = "checkout")
    private LocalDateTime checkOutTime;

    public Visitor() {
    }

    public Visitor(@JsonProperty("id") int id,
                   @JsonProperty("name") String name,
                   @JsonProperty("identity") String identity,
                   @JsonProperty("gender") Gender gender,
                   @JsonProperty("checkInTime") LocalDateTime checkInTime,
                   @JsonProperty("checkOutTime") LocalDateTime checkOutTime
    ) {
        this.id = id;
        this.name = name;
        this.identity = identity;
        this.gender = gender;
        this.checkInTime = checkInTime;
        this.checkOutTime = checkOutTime;
    }

    public String getIdentity() {
        return identity;
    }

    public Gender getGender() {
        return gender;
    }

    public LocalDateTime getCheckInTime() {
        return checkInTime;
    }

    public LocalDateTime getCheckOutTime() {
        return checkOutTime;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
