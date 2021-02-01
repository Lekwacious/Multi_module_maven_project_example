package com.lekwacious.repository;

import com.lekwacious.domain.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DbSeeder implements CommandLineRunner {

    private HotelRepository hotelRepository;

    @Autowired
    public DbSeeder(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Hotel marriot = new Hotel("Marriot", 5, true);
        this.hotelRepository.save(marriot);
        Hotel ibis = new Hotel("Ibis", 3, false);
        this.hotelRepository.save(ibis);
        Hotel goldenTulip = new Hotel("Golden Tulip", 5, true);
        this.hotelRepository.save(goldenTulip);




    }
}
