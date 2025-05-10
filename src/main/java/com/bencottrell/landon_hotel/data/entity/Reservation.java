package com.bencottrell.landon_hotel.data.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

import java.sql.Date;

@Entity
@Table(name="RESERVATIONS")
@Data
@ToString
public class Reservation {
    //  RESERVATION_ID BIGINT PRIMARY KEY auto_increment,
    //  ROOM_ID BIGINT NOT NULL,
    //  GUEST_ID BIGINT NOT NULL,
    //  RES_DATE DATE
    @Id
    @Column(name="RESERVATION_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long reservationId;
    @Column(name="ROOM_ID")
    private long roomId;
    @Column(name="GUEST_ID")
    private long guestId;
    @Column(name="RES_DATE")
    private Date resDate;

}
