package com.example.advance.academy.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;
    private int stays;
    private Date dateIn;

    @ManyToOne
    private Room room;

    @ManyToOne
    private Hotel hotel;
    private Double price;
    @ManyToOne
    private User user;



}
