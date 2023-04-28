package com.UST.SharathCars2.Controller;

import com.UST.SharathCars2.Model.Car;
import com.UST.SharathCars2.Service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cars")
public class CarController {
    @Autowired
    private CarService carService;
    @PostMapping
    public Car create(@RequestBody Car car){
        return carService.addcar(car);

    }
}
