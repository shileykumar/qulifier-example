package com.sunglowsys.vehicle.bean;

import org.springframework.stereotype.Component;

@Component("bike")
public class Bike implements Vehicle{
    @Override
    public void start() {
        System.out.println("Bike has started---");
    }

    @Override
    public void stop() {
        System.out.println("Bike has stopped---");
    }
}
