package com.bencottrell.landon_hotel.data.repository;

import com.bencottrell.landon_hotel.data.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.Date;
import java.util.Optional;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
    Optional<Reservation> findAllByResDate(Date resDate);
}
