package com.example.WSAvance.models;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
public class Vol implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;

    @Column
    private String name;

    @Column
    public LocalDateTime date;


    public Vol(String name, LocalDateTime date) {
        this.name = name;
        this.date = date;
    }
}

