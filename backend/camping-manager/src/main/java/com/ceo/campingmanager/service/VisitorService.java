package com.ceo.campingmanager.service;

import com.ceo.campingmanager.model.Visitor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface VisitorService {

    public void addVisitor(Visitor visitor);

    public List<Visitor> getAllVisitors();

    public Optional<Visitor> selectVisitorById(int id);

    public int deleteVisitorById(int id);

    public int updateVisitorById(int id, Visitor visitor);
}
