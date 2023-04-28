package com.UST.SharathCars2.Service;

import com.UST.SharathCars2.Model.Car;
import com.UST.SharathCars2.Repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarService {
    @Autowired
    private CarRepository repo;
    public Car addcar(Car car) {
        return repo.save(car);
    }
}
