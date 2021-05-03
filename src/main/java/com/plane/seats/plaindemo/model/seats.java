package com.plane.seats.plaindemo.model;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;



@Getter
@Setter
@Entity
@SuperBuilder

@Table(name = "seats")
public class seats implements Serializable{

    private int seats ;

    @Column(name= "rrow")
    private int row ;
}
