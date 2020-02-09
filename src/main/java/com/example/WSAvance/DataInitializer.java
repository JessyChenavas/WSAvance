package com.example.WSAvance;

import com.example.WSAvance.models.Vol;
import com.example.WSAvance.repository.VolRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
@Slf4j
public class DataInitializer implements CommandLineRunner {
    @Autowired
    VolRepository volRepository;
    @Override
    public void run(String... args) throws Exception {

        List<Vol> vols = new ArrayList<>();
        vols.add(new Vol("AF1234", LocalDateTime.now()));
        vols.add(new Vol("MU2668", LocalDateTime.now()));
        vols.add(new Vol("AF8965", LocalDateTime.now()));
        vols.add(new Vol("XF6689", LocalDateTime.now()));
        vols.add(new Vol("AF0856", LocalDateTime.now()));

        volRepository.saveAll(vols);
    }
}
