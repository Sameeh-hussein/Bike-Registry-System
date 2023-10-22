package com.globonatics.Bike.controller;

import com.globonatics.Bike.domain.Bike;
import com.globonatics.Bike.repository.BikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/bikes")
public class BikeController {

    @Autowired
    private BikeRepository bikeRepository;
    @GetMapping
    public List<Bike> list(){
        return bikeRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void create(@RequestBody Bike bike){
        bikeRepository.save(bike);
    }

    @GetMapping(path = "/{id}")
    public Optional<Bike> get(@PathVariable("id") long id){
        return bikeRepository.findById(id);
    }
}
