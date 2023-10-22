package com.globonatics.Bike.controller;

import com.globonatics.Bike.domain.Bike;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.websocket.OnClose;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/bikes")
public class BikeController {

    @GetMapping
    public List<Bike> list(){
        List<Bike> bikeList = new ArrayList<>();
        return bikeList;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void create(@PathVariable("id") long id){

    }

    @GetMapping(path = "/{id}")
    public Bike get(@PathVariable("id") long id){
        Bike bike = new Bike();
        return bike;
    }
}
