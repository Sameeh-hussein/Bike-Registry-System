package com.globonatics.Bike.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Bike {
    @Id
    @NonNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String phone;
    private String model;
    private String serialNumber;
    private Long purchasePrice;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MM-DD-YYYY")
    private Date purchaseDate;
    @NonNull
    private boolean contact;

    public Bike(long id, boolean contact, String email, String model, String name, String phone, Date purchaseDate, long purchasePrice) {
        this.id = id;
        this.contact = contact;
        this.email = email;
        this.model = model;
        this.name = name;
        this.phone = phone;
        this.purchaseDate = purchaseDate;
        this.purchasePrice = purchasePrice;
    }
}
