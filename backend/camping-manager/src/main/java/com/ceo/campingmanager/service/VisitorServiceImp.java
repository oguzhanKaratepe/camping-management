package com.ceo.campingmanager.service;

import com.ceo.campingmanager.dao.VisitorRepository;
import com.ceo.campingmanager.model.Visitor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class VisitorServiceImp implements VisitorService {

    @Autowired
    private VisitorRepository visitorRepo;

    @Override
    public void addVisitor(Visitor visitor) {
        visitorRepo.save(visitor);
    }

    @Override
    public List<Visitor> getAllVisitors() {
        return visitorRepo.findAll();
    }

    @Override
    public Optional<Visitor> selectVisitorById(int id) {
        return visitorRepo.getById(id);
    }

    @Override
    public int deleteVisitorById(int id) {
        return visitorRepo.deleteById(id);
    }

    @Override
    public int updateVisitorById(int id, Visitor visitor) {
        return 0;
    }
}
