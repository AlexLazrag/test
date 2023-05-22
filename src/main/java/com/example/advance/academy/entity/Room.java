package com.example.advance.academy.entity;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@AllArgsConstructor
@NoArgsConstructor

@Entity(name = "rooms")
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Enumerated(EnumType.STRING)
    private ViewType view;
    private String floor;
    private int beds;
    @Enumerated(EnumType.STRING)
    private RoomType roomType;
    @ManyToOne
    private Hotel hotel;


}
