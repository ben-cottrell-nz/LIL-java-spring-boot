package com.bencottrell.landon_hotel;
import com.bencottrell.landon_hotel.data.entity.Reservation;
import com.bencottrell.landon_hotel.data.entity.Room;
import com.bencottrell.landon_hotel.data.repository.ReservationRepository;
import com.bencottrell.landon_hotel.data.repository.RoomRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.sql.Date;
import java.util.List;
import java.util.Optional;

@Component
public class CLRunner implements CommandLineRunner {

    private final RoomRepository roomRepository;
    private final ReservationRepository reservationRepository;

    public CLRunner(RoomRepository roomRepository, ReservationRepository reservationRepository) {
        this.roomRepository = roomRepository;
        this.reservationRepository = reservationRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("roomRepository");
        List<Room> rooms = this.roomRepository.findAll();
        Optional<Room> room = this.roomRepository.findByRoomNumberIgnoreCase("p1");
        System.out.println(room);
        rooms.forEach(System.out::println);
        System.out.println("reservationRepository");
        List<Reservation> reservations = this.reservationRepository.findAll();
        //Optional<Reservation> reservation = this.reservationRepository.findAllByResDate(DateTime.
        reservations.forEach(System.out::println);

    }
}