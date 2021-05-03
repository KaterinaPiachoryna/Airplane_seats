package com.plane.seats.plaindemo.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

import java.io.Serializable;

import static javax.persistence.GenerationType.IDENTITY;

@Getter
@Setter
@Entity
@SuperBuilder
@NoArgsConstructor

@Table(name= "passenger")
public class passenger implements Serializable {


        @Id
        @GeneratedValue(strategy = IDENTITY)
        private Long id;


        @Column (name = "first_name")
        private  String firstname ;


        @Column (name = "last_name")
        private String lastname;

    }


