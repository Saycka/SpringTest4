package ru.manyatkin.SpringTest4.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Player {

    @Id
    @GeneratedValue
    private Long Id;

    private String name;
    private String team;
}
