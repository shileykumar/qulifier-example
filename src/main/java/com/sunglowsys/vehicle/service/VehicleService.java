package com.sunglowsys.vehicle.service;

import com.sunglowsys.vehicle.bean.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class VehicleService {

    @Autowired
    @Qualifier("bike")
    Vehicle vehicle;

    public void service(){
        vehicle.start();
        vehicle.stop();
    }
}
