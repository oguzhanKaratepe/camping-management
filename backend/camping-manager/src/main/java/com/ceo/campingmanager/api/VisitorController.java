package com.ceo.campingmanager.api;

import com.ceo.campingmanager.model.Visitor;
import com.ceo.campingmanager.service.VisitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.UUID;

@RequestMapping("api/")
@RestController
@CrossOrigin
public class VisitorController {
    @Autowired
    private VisitorService visitorService;

    @PostMapping("visitor")
    public void addVisitor(@RequestBody Visitor visitor) {
        System.out.println("here");
        visitorService.addVisitor(visitor);
    }

    @GetMapping("visitor")
    public List<Visitor> getAllVisitors() {
        return visitorService.getAllVisitors();
    }

    @GetMapping("visitor/{id}")
    public Visitor getVisitorById(@PathVariable("id") int id) {
        return visitorService.selectVisitorById(id).orElse(null);
    }

    @DeleteMapping("visitor/{id}")
    public void deleteVisitorById(@PathVariable("id") int id) {
        visitorService.deleteVisitorById(id);

    }

    @PutMapping ("visitor/{id}")
    public int updateVisitorById(@PathVariable("id") int id, @Valid @NotNull @RequestBody Visitor visitor) {
        return visitorService.updateVisitorById(id, visitor);
    }
}
