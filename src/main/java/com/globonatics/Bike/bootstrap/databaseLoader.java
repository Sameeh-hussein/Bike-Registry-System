package com.globonatics.Bike.bootstrap;

import com.globonatics.Bike.domain.Bike;
import com.globonatics.Bike.repository.BikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;

@Component
public class databaseLoader implements CommandLineRunner {

    @Autowired
    private BikeRepository bikeRepository;

    @Override
    public void run(String... args) throws Exception {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

        Bike bike1 = new Bike(1L, true, "jeff@bikes.com", "Globo MTB 29 Full Suspension", "Jeff Miller", "328-443-5555", dateFormat.parse("09-10-2023"), 1100L);
        Bike bike2 = new Bike(2L, false, "samantha@bikes.com", "Globo Carbon Fiber Race Series", "Samantha Davis", "448-397-5555", dateFormat.parse("10-10-2022"), 1999L);
        Bike bike3 = new Bike(3L, true, "dave@bikes.com", "Globo Time Trial Blade", "Dave Warren", "563-891-5555", dateFormat.parse("20-11-2023"), 2100L);

        bikeRepository.save(bike1);
        bikeRepository.save(bike2);
        bikeRepository.save(bike3);
    }
}
