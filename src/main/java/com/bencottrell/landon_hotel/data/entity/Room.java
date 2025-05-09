package com.bencottrell.landon_hotel.data.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

@Entity
@Table(name="ROOMS")
@Data
@ToString
public class Room {
    @Id
    @Column(name="ROOM_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name="NAME")
    private String name;
    @Column(name="ROOM_NUMBER")
    private String roomNumber;
    @Column(name="BED_INFO")
    private String bedInfo;
}
