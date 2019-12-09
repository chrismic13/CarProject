package com.company;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        VehicleChassis vc1 = new VehicleChassis();
        VehicleChassis vc2 = new VehicleChassis("sample");
        ManufacturedEngine me1 = new ManufacturedEngine();
        ManufacturedEngine me2 = new ManufacturedEngine("Honda", new Date(), "H-series", "H23A1", 4, "88 AKI", "2WD: Two-Wheel Drive");
        InteriorFeature if1 = new InteriorFeature();
        InteriorFeature if2 = new InteriorFeature("Climate Control");
        ExteriorFeature ef1 = new ExteriorFeature();
        ExteriorFeature ef2 = new ExteriorFeature("Fog Lamps");
        Vehicle v1 = new Vehicle();
        Vehicle v2 = new Vehicle(new Date(), "Honda", "Honda", "Prelude", new VehicleChassis(),
            "null", "2WD: Two-Wheel Drive", new ManufacturedEngine());
        Car c1 = new Car();
        Feature[] feature = new Feature[10];
        Car c2 = new Car(new Date(), "vehicleManufacturer", "vehicleMake", "vehicleModel", new VehicleFrame(),
            "vehicleType", "driveTrain", new ManufacturedEngine(), feature, 0);


        System.out.println(vc1.toString());
        System.out.println(me1.toString());
        System.out.println(me2.toString());
        System.out.println(if1.toString());
        System.out.println(if2.toString());
        System.out.println(ef1.toString());
        System.out.println(ef2.toString());
        System.out.println(v1.toString());
        System.out.println(v2.toString());
    }
}
