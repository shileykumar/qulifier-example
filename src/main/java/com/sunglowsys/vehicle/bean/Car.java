package com.sunglowsys.vehicle.bean;

import org.springframework.stereotype.Component;

@Component("car")
public class Car implements Vehicle{
    @Override
    public void start() {
        System.out.println("Car has started---");
    }

    @Override
    public void stop() {
        System.out.println("Car has stopped---");
    }
}
