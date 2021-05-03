package com.plane.seats.plaindemo;
import com.plane.seats.plaindemo.model.passenger;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface pass_repository extends CrudRepository<passenger,Long>{

    passenger findByFirstName (String firstname);
    passenger findByLastName ( String lastname);

}
