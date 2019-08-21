package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    CarRepository carRepository;

    @Override
    public void run (String... strings) throws Exception{
        Car car;

        car = new Car("Nissan", "Quest", "2006");
        carRepository.save(car);

        car = new Car("Toyota", "Camry", "2017");
        carRepository.save(car);

        car = new Car("Honda", "Accord", "2019");
        carRepository.save(car);
    }


}
