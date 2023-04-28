package com.UST.SharathCars2.Repository;

import com.UST.SharathCars2.Model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<Car,Integer> {

}
