package com.example.advance.academy.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import javax.persistence.*;
import java.util.Set;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;

    private String address;

    @OneToMany(mappedBy = "hotel", fetch = FetchType.EAGER)
    @Cascade(CascadeType.ALL)
    private Set<Room> rooms;

    @OneToMany(mappedBy = "hotel", fetch = FetchType.LAZY)
    private Set<Reservation> reservations;

}
