package com.ceo.campingmanager.dao;

import com.ceo.campingmanager.model.Visitor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface VisitorRepository extends JpaRepository<Visitor, Integer> {

    Optional<Visitor> getById(int id);

    int deleteById(int id);
}
