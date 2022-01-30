package com.sunglowsys;

import com.sunglowsys.vehicle.service.VehicleService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("com.sunglowsys.vehicle.bean");
        context.scan("com.sunglowsys.vehicle.service");
        context.refresh();

        VehicleService vehicleService = context.getBean(VehicleService.class);
        vehicleService.service();
        context.close();
    }
}
