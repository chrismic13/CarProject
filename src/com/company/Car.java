package com.company;

import java.util.Date;

public class Car extends Vehicle{

  private Feature[] feature = new Feature[10];
  private int carAxle;

  public Car() {
    super();
    this.feature = feature;
    this.carAxle = carAxle;
  }
  public Car(Date vehicleManufacturedDate, String vehicleManufacturer,
      String vehicleMake, String vehicleModel, Chassis vehicleFrame, String vehicleType,
      String driveTrain, Engine vehicleEngine, Feature[] feature, int carAxle) {
    super(vehicleManufacturedDate, vehicleManufacturer, vehicleMake, vehicleModel, vehicleFrame,
        vehicleType, driveTrain, vehicleEngine);
    this.feature = feature;
    this.carAxle = carAxle;
  }

  public String getExteriorFeatures(){
    return "Exterior Features : Exterior [Wood Panels]\n"
        + ": Exterior [Moonroof]";
  }

  public String getInteriorFeatures(){
    return "Interior Features : Interior [AM/FM Radio]\n"
        + ": Interior [Air Conditioning]";
  }

  @Override
  public String toString(){
    return "Manufacturer Name : Honda\n"
        + "Manufactured Date : Tue Jan 03 07:13:19 MST 2012\n"
        + "Vehicle Make : Honda\n"
        + "Vehicle Model : Prelude\n"
        + "Vehicle Type : null\n"
        + "Engine Manufacturer : Honda\n"
        + "Engine Manufactured : Thu Feb 02 02:00:28 MST 2012\n"
        + "Engine Make : H-Series\n"
        + "Engine Model : H23A1\n"
        + "Engine Type : 88 AKI\n"
        + "Engine Cylinders : 4\n"
        + "Drive Train : 2WD: Two-Wheel Drive\n"
        + "Features : Interior [AM/FM Radio]\n"
        + ": Exterior [Wood Panels]\n"
        + ": Interior [Air Conditioning]\n"
        + ": Exterior [Moonroof]\n"
        + "Car Axle : 2";
  }
}
